package dongster.cameranostest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BasicButton extends AppCompatActivity {
    private RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_button);

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<ExpandableListAdapter1.Item> data = new ArrayList<>();


        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));


        ExpandableListAdapter1.Item sentence1 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Hello");
        sentence1.invisibleChildren = new ArrayList<>();
        sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Annyeonghaseyo"));
        //sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "안녕하세요"));
        data.add(sentence1);


        ExpandableListAdapter1.Item sentence2 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Pleased to meet you.");
        sentence2.invisibleChildren = new ArrayList<>();
        sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Cheoeum boebgessseubnida."));
        //sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "처음 뵙겠습니다."));
        data.add(sentence2);

        ExpandableListAdapter1.Item sentence3 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Nice to meet you.");
        sentence3.invisibleChildren = new ArrayList<>();
        sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Mannaseo bangawoyo."));
        //sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "만나서 반가워요."));
        data.add(sentence3);

        ExpandableListAdapter1.Item sentence4 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Happy to meet you.");
        sentence4.invisibleChildren = new ArrayList<>();
        sentence4.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Alge doeeoseo gippeossseubnida."));
        sentence4.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "알게 되어서 기뻤습니다."));
        data.add(sentence4);

        ExpandableListAdapter1.Item sentence5 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Good day.");
        sentence5.invisibleChildren = new ArrayList<>();
        sentence5.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Sugohaseyo."));
        sentence5.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "수고하세요."));
        data.add(sentence5);

        ExpandableListAdapter1.Item sentence6 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Take care.");
        sentence6.invisibleChildren = new ArrayList<>();
        sentence6.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Salpyeo gaseyo."));
        sentence6.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "살펴 가세요."));
        data.add(sentence6);

        ExpandableListAdapter1.Item sentence7= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Happy a nice trip.");
        sentence7.invisibleChildren = new ArrayList<>();
        sentence7.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Yeohaeng jal haseyo."));
        sentence7.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "여행 잘 하세요."));
        data.add(sentence7);

        ExpandableListAdapter1.Item sentence8= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "See you again.");
        sentence8.invisibleChildren = new ArrayList<>();
        sentence8.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Tto bobsida."));
        sentence8.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "또 봅시다."));
        data.add(sentence8);



        ExpandableListAdapter1.Item sentence9= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "May I ask you a question?");
        sentence9.invisibleChildren = new ArrayList<>();
        sentence9.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Jom yeojjwo bolgeyo."));
        sentence9.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "좀 여쭤 볼게요."));
        data.add(sentence9);

        ExpandableListAdapter1.Item sentence10= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Please help me.");
        sentence10.invisibleChildren = new ArrayList<>();
        sentence10.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Jeoleul jom dowajuseyo."));
        sentence10.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "저를 좀 도와주세요."));
        data.add(sentence10);

        ExpandableListAdapter1.Item sentence11= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Please");
        sentence11.invisibleChildren = new ArrayList<>();
        sentence11.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Butaghabnida."));
        sentence11.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "부탁합니다."));
        data.add(sentence11);

        ExpandableListAdapter1.Item sentence12= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Do you have a moment?");
        sentence12.invisibleChildren = new ArrayList<>();
        sentence12.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Jamkkan sigan jom nae juseyo."));
        sentence12.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "잠깐 시간 좀 내 주세요."));
        data.add(sentence12);

        ExpandableListAdapter1.Item sentence13= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Excuse me.");
        sentence13.invisibleChildren = new ArrayList<>();
        sentence13.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Sillyehabnida."));
        sentence13.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "실례합니다."));
        data.add(sentence13);

        ExpandableListAdapter1.Item sentence14= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Okay.");
        sentence14.invisibleChildren = new ArrayList<>();
        sentence14.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Algessseubnida."));
        sentence14.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "알겠습니다."));
        data.add(sentence14);

        ExpandableListAdapter1.Item sentence15= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I'm sorry.");
        sentence15.invisibleChildren = new ArrayList<>();
        sentence15.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Mianhaeyo."));
        sentence15.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "미안해요."));
        data.add(sentence15);

        ExpandableListAdapter1.Item sentence16= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I don't have.");
        sentence16.invisibleChildren = new ArrayList<>();
        sentence16.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Eobseoyo."));
        sentence16.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "없어요."));
        data.add(sentence16);



        ExpandableListAdapter1.Item sentence17= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Great.");
        sentence17.invisibleChildren = new ArrayList<>();
        sentence17.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Daedanhaeyo."));
        sentence17.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "대단해요."));
        data.add(sentence17);

        ExpandableListAdapter1.Item sentence18= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Wonderful.");
        sentence18.invisibleChildren = new ArrayList<>();
        sentence18.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Meosjineyo."));
        sentence18.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "멋지네요."));
        data.add(sentence18);

        ExpandableListAdapter1.Item sentence19= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "You're so kind.");
        sentence19.invisibleChildren = new ArrayList<>();
        sentence19.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Cham chinjeolhaeyo."));
        sentence19.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "참 친절해요."));
        data.add(sentence19);



        ExpandableListAdapter1.Item sentence20= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Thank you.");
        sentence20.invisibleChildren = new ArrayList<>();
        sentence20.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "gamsahaeyo."));
        sentence20.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "감사해요."));
        data.add(sentence20);



        ExpandableListAdapter1.Item sentence21= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Yes.");
        sentence21.invisibleChildren = new ArrayList<>();
        sentence21.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Ne."));
        sentence21.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "네."));
        data.add(sentence21);

        ExpandableListAdapter1.Item sentence22= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "No.");
        sentence22.invisibleChildren = new ArrayList<>();
        sentence22.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Aniyo."));
        sentence22.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "아니요."));
        data.add(sentence22);

        recyclerview.setAdapter(new ExpandableListAdapter1(data));

    }
}
class ExpandableListAdapter1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final int HEADER = 0;
    public static final int CHILD = 1;

    private List<Item> data;

    public ExpandableListAdapter1(List<Item> data) {
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int type) {
        View view = null;
        Context context = parent.getContext();
        float dp = context.getResources().getDisplayMetrics().density;
        int subItemPaddingLeft = (int) (18 * dp);
        int subItemPaddingTopAndBottom = (int) (5 * dp);
        switch (type) {
            case HEADER:
                LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.list_header, parent, false);
                ListHeaderViewHolder header = new ListHeaderViewHolder(view);
                return header;
            case CHILD:
                TextView itemTextView = new TextView(context);
                itemTextView.setPadding(subItemPaddingLeft, subItemPaddingTopAndBottom, 0, subItemPaddingTopAndBottom);
                itemTextView.setTextColor(0x88000000);
                itemTextView.setLayoutParams(
                        new ViewGroup.LayoutParams(
                                ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.WRAP_CONTENT));
                return new RecyclerView.ViewHolder(itemTextView) {
                };
        }
        return null;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final Item item = data.get(position);
        switch (item.type) {
            case HEADER:
                final ListHeaderViewHolder itemController = (ListHeaderViewHolder) holder;
                itemController.refferalItem = item;
                itemController.header_title.setText(item.text);
                if (item.invisibleChildren == null) {
                    itemController.btn_expand_toggle.setImageResource(R.drawable.circle_minus);
                } else {
                    itemController.btn_expand_toggle.setImageResource(R.drawable.circle_plus);
                }
                itemController.btn_expand_toggle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (item.invisibleChildren == null) {
                            item.invisibleChildren = new ArrayList<Item>();
                            int count = 0;
                            int pos = data.indexOf(itemController.refferalItem);
                            while (data.size() > pos + 1 && data.get(pos + 1).type == CHILD) {
                                item.invisibleChildren.add(data.remove(pos + 1));
                                count++;
                            }
                            notifyItemRangeRemoved(pos + 1, count);
                            itemController.btn_expand_toggle.setImageResource(R.drawable.circle_plus);
                        } else {
                            int pos = data.indexOf(itemController.refferalItem);
                            int index = pos + 1;
                            for (Item i : item.invisibleChildren) {
                                data.add(index, i);
                                index++;
                            }
                            notifyItemRangeInserted(pos + 1, index - pos - 1);
                            itemController.btn_expand_toggle.setImageResource(R.drawable.circle_minus);
                            item.invisibleChildren = null;
                        }
                    }
                });
                break;
            case CHILD:
                TextView itemTextView = (TextView) holder.itemView;
                itemTextView.setText(data.get(position).text);
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).type;
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    private static class ListHeaderViewHolder extends RecyclerView.ViewHolder {
        public TextView header_title;
        public ImageView btn_expand_toggle;
        public Item refferalItem;

        public ListHeaderViewHolder(View itemView) {
            super(itemView);
            header_title = (TextView) itemView.findViewById(R.id.header_title);
            btn_expand_toggle = (ImageView) itemView.findViewById(R.id.btn_expand_toggle);
        }
    }

    public static class Item {
        public int type;
        public String text;
        public List<Item> invisibleChildren;

        public Item() {
        }

        public Item(int type, String text) {
            this.type = type;
            this.text = text;
        }
    }

}