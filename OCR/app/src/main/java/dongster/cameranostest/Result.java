package dongster.cameranostest;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Result extends AppCompatActivity {
    ListView list;
    StringBuffer sb;
    String Store_Name;
    String Translation_Data;
    String Result_Data;
    String Store_Addr;
    String Store_Cate;
    String Store_Tel;


    TextView textView;
    TextView tx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tx1 = (TextView) findViewById(R.id.Result);
        tx2 = (TextView) findViewById(R.id.Storelist);
        TextView tx3 = (TextView) findViewById(R.id.MenuList);
        TextView tx4=(TextView)findViewById(R.id.OCR);
        Button buttonSearch = (Button) findViewById(R.id.More_info);
        buttonSearch.setOnClickListener(buttonSearchClickListener);


        textView = (TextView) findViewById(R.id.textView01);

        Intent intent = getIntent();

        //TranslateTask translateTask = new TranslateTask();

        String msg = intent.getExtras().getString("message");
        sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        try {
            JSONObject jsonObject = new JSONObject(msg);
            Result_Data = jsonObject.getString("Result");
            String Store_Data = jsonObject.getString("Store_Data");
            String Menu_Data = jsonObject.getString("Menu_Data");
            Translation_Data = jsonObject.getString("Translation_Data");
            JSONArray jarray = new JSONArray(Store_Data);
            JSONArray jarray2 = new JSONArray(Menu_Data);
            for (int i = 0; i < jarray.length(); i++) {
                JSONObject jObject = jarray.getJSONObject(i);
                Store_Name = jObject.getString("Store_Name");
                Store_Tel = jObject.getString("Store_Tel");
                Store_Addr = jObject.getString("Store_Addr");
                Store_Cate = jObject.getString("Store_Cate");
                TranslateTask translateTask = new TranslateTask();
                //translateTask.execute(Store_Addr);

                TranslateTask translateTask1 = new TranslateTask();
                TranslateTask translateTask2 = new TranslateTask();
                TranslateTask translateTask3 = new TranslateTask();
                //translateTask1.execute(Store_Cate);
                sb.append("Store Name : " + Store_Name + "\n");
                translateTask2.execute(Store_Name);
                sb.append("Store Tel : " + Store_Tel + "\n");
                translateTask3.execute(Store_Tel);
                sb.append("Store Address : " + Store_Addr + "\n");
                translateTask.execute(Store_Addr);
                textView.append("\n");
                sb.append( "Store Category : " + Store_Cate + "\n"+"\n");
                translateTask1.execute(Store_Cate);

                tx2.setText(sb);


                //textView.append("\n");
                //  textView.setMovementMethod(new ScrollingMovementMethod());
            }
            for (int i = 0; i < jarray2.length(); i++) {
                JSONObject jsonObject1 = jarray2.getJSONObject(i);
                String Menu_en_Name = jsonObject1.getString("Menu_en_Name");
                String Menu_Info = jsonObject1.getString("Menu_Info");
                sb2.append(
                        "Menu Name: " + Menu_en_Name + "\n" + "Menu_Info : " + Menu_Info + "\n\n"
                );
                tx3.setText(sb2);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


        tx1.setText("  "+Translation_Data);
        tx4.setText("  "+Result_Data);

    }

    View.OnClickListener buttonSearchClickListener = new View.OnClickListener() {

        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, Translation_Data);
            startActivity(intent);
        }

    };


    class TranslateTask extends AsyncTask<String, Void, String>
    {
        String result;
        String translatedResult;
        @Override
        protected String doInBackground(String... strings) {

            String sourceText=strings[0];
            String clientId = "";/*파파고 API 애플리케이션 클라이언트 아이디값*/
            String clientSecret = "";//파파고 API 애플리케이션 클라이언트 시크릿값
            try {
                String text = URLEncoder.encode(sourceText, "UTF-8");
                String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
                URL url = new URL(apiURL);
                HttpURLConnection con = (HttpURLConnection)url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("X-Naver-Client-Id", clientId);
                con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
                // post request
                String postParams = "source=ko&target=en&text=" + text;
                con.setDoOutput(true);
                DataOutputStream wr = new DataOutputStream(con.getOutputStream());
                wr.writeBytes(postParams);
                wr.flush();
                wr.close();
                int responseCode = con.getResponseCode();
                BufferedReader br;
                if(responseCode==200) { // 정상 호출
                    br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                } else {  // 에러 발생
                    br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                }
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = br.readLine()) != null) {
                    response.append(inputLine);
                }
                br.close();
                System.out.println(response.toString());
                result = response.toString();
                Gson gson = new GsonBuilder().create();
                JsonParser parser = new JsonParser();
                JsonElement rootObj = parser.parse(result.toString())
                        .getAsJsonObject().get("message")
                        .getAsJsonObject().get("result");
                TranslatedItem items = gson.fromJson(rootObj.toString(), TranslatedItem.class);
                textView.append(items.getTranslatedText()+"\n");

            } catch (Exception e) {
                System.out.println(e);
            }

            return null;
        }
        private class TranslatedItem {
            String translatedText;

            public String getTranslatedText() {
                return translatedText;
            }
        }
    }


}