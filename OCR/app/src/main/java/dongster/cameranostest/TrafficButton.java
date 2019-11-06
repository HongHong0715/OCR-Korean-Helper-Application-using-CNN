package dongster.cameranostest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TrafficButton extends AppCompatActivity {
    private RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_button);

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<ExpandableListAdapter1.Item> data = new ArrayList<>();


        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));


        ExpandableListAdapter1.Item sentence1 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where am I on the map?");
        sentence1.invisibleChildren = new ArrayList<>();
        sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Yeogiga i jido-eseo eodiyeyo?"));
        //sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "여기가 이 지도에서 어디예요?"));
        data.add(sentence1);

        ExpandableListAdapter1.Item sentence2 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where am I now?");
        sentence2.invisibleChildren = new ArrayList<>();
        sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Jega jigeum issneun gos-i eodiyeyo?"));
        //sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "제가 지금 있는 곳이 어디예요?"));
        data.add(sentence2);

        ExpandableListAdapter1.Item sentence3 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Am I at this address?");
        sentence3.invisibleChildren = new ArrayList<>();
        sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "I jusoga yeogiyeyo?"));
        //sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "이 주소가 여기예요?"));
        data.add(sentence3);

        ExpandableListAdapter1.Item sentence5 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Can I get there on foot?");
        sentence5.invisibleChildren = new ArrayList<>();
        sentence5.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Geol-eoseo gal su iss-eulkkayo?"));
        sentence5.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "걸어서 갈 수 있을까요?"));
        data.add(sentence5);

        ExpandableListAdapter1.Item sentence6 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "How long will it take to get there?");
        sentence6.invisibleChildren = new ArrayList<>();
        sentence6.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Geogikkaji ganeun de eolmana geollilkkayo?"));
        sentence6.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "거기까지 가는 데 얼마나 걸릴까요?"));
        data.add(sentence6);

        ExpandableListAdapter1.Item sentence7= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "How do I get to this address?");
        sentence7.invisibleChildren = new ArrayList<>();
        sentence7.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "I jusolo eotteohge gayo?"));
        sentence7.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "이 주소로 어떻게 가요?"));
        data.add(sentence7);



        ExpandableListAdapter1.Item sentence8= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Please take me to this address.");
        sentence8.invisibleChildren = new ArrayList<>();
        sentence8.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "I jusolo ga juseyo."));
        sentence8.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "이 주소로 가 주세요."));
        data.add(sentence8);

        ExpandableListAdapter1.Item sentence9= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Please stop here.");
        sentence9.invisibleChildren = new ArrayList<>();
        sentence9.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Yeogie sewo juseyo."));
        sentence9.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "여기에 세워 주세요."));
        data.add(sentence9);

        ExpandableListAdapter1.Item sentence10= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "How much is it?");
        sentence10.invisibleChildren = new ArrayList<>();
        sentence10.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Eolmayeyo?"));
        sentence10.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "얼마예요?"));
        data.add(sentence10);

        ExpandableListAdapter1.Item sentence11= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where is the taxi stop?");
        sentence11.invisibleChildren = new ArrayList<>();
        sentence11.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Taegsi seung-gangjang-i eodie iss-eoyo?"));
        sentence11.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "택시 승강장이 어디에 있어요?"));
        data.add(sentence11);

        ExpandableListAdapter1.Item sentence12= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Could you try and make this a fast trip?");
        sentence12.invisibleChildren = new ArrayList<>();
        sentence12.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Ppalli ga juseyo."));
        sentence12.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "빨리 가 주세요."));
        data.add(sentence12);



        ExpandableListAdapter1.Item sentence13= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where is the nearest bus stop?");
        sentence13.invisibleChildren = new ArrayList<>();
        sentence13.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Gajang gakkaun beoseu jeonglyujang-eun eodiyeyo?"));
        sentence13.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "가장 가까운 버스 정류장은 어디예요?"));
        data.add(sentence13);

        ExpandableListAdapter1.Item sentence14= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "When will the next bus come?");
        sentence14.invisibleChildren = new ArrayList<>();
        sentence14.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Da-eum beoseuneun eonje wayo?"));
        sentence14.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "다음 버스는 언제 와요?"));
        data.add(sentence14);


        ExpandableListAdapter1.Item sentence16= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Does this go to City Hall?");
        sentence16.invisibleChildren = new ArrayList<>();
        sentence16.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Igeo sicheong gayo?"));
        sentence16.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "이거 시청 가요?"));
        data.add(sentence16);

        ExpandableListAdapter1.Item sentence17= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where is the next stop?");
        sentence17.invisibleChildren = new ArrayList<>();
        sentence17.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Da-eum jeonglyujang-eun eodiyeyo?"));
        sentence17.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "다음 정류장은 어디예요?"));
        data.add(sentence17);

        ExpandableListAdapter1.Item sentence18= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where should I change buses?");
        sentence18.invisibleChildren = new ArrayList<>();
        sentence18.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Eodiseo gal-ataya haeyo?"));
        sentence18.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "어디서 갈아타야 해요?"));
        data.add(sentence18);



        ExpandableListAdapter1.Item sentence19= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where is the nearest subway station?");
        sentence19.invisibleChildren = new ArrayList<>();
        sentence19.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Gajang gakkaun jihacheol-yeog-eun eodiyeyo?"));
        sentence19.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "가장 가까운 지하철역은 어디예요?"));
        data.add(sentence19);

        ExpandableListAdapter1.Item sentence20= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where do I transfer?");
        sentence20.invisibleChildren = new ArrayList<>();
        sentence20.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Eoneu yeog-eseo gal-ataya haeyo?"));
        sentence20.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "어느 역에서 갈아타야 해요?"));
        data.add(sentence20);

        ExpandableListAdapter1.Item sentence21= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where is exit number one?");
        sentence21.invisibleChildren = new ArrayList<>();
        sentence21.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Il beon chulguga eodiyeyo?"));
        sentence21.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "일 번 출구가 어디예요?"));
        data.add(sentence21);

        ExpandableListAdapter1.Item sentence22= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where is the entrance to the subway?");
        sentence22.invisibleChildren = new ArrayList<>();
        sentence22.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Jihacheol ibguga eodiyeyo?"));
        sentence22.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "지하철 입구가 어디예요?"));
        data.add(sentence22);

        ExpandableListAdapter1.Item sentence23= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where can I buy a ticket?");
        sentence23.invisibleChildren = new ArrayList<>();
        sentence23.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Pyoneun eodiseo sal su iss-eoyo?"));
        sentence23.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "표는 어디서 살 수 있어요?"));
        data.add(sentence23);

        recyclerview.setAdapter(new ExpandableListAdapter1(data));

    }
}
