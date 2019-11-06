package dongster.cameranostest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TourButton extends AppCompatActivity {
    private RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_button);

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<ExpandableListAdapter1.Item> data = new ArrayList<>();


        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));


        ExpandableListAdapter1.Item sentence1 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where is the tourist information center?");
        sentence1.invisibleChildren = new ArrayList<>();
        sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Gwangwang-annaesoga eodiyeyo?"));
        //sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "관광 안내소가 어디예요?"));
        data.add(sentence1);

        ExpandableListAdapter1.Item sentence2 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I want a guidebook for tourists.");
        sentence2.invisibleChildren = new ArrayList<>();
        sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Gwangwang annae chaegja hana juseyo."));
        //sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "관광 안내 책자 하나 주세요."));
        data.add(sentence2);

        ExpandableListAdapter1.Item sentence3 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "What is there to see around here?");
        sentence3.invisibleChildren = new ArrayList<>();
        sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Geuncheoe gugyeonghal manhan jangsoga iss-eoyo?"));
        //sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "근처에 구경할 만한 장소가 있어요?"));
        data.add(sentence3);

        ExpandableListAdapter1.Item sentence4 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "What's most popular?");
        sentence4.invisibleChildren = new ArrayList<>();
        sentence4.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Eotteon geos-i gajang ingiga iss-eoyo?"));
        sentence4.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "어떤 것이 가장 인기가 있어요?"));
        data.add(sentence4);

        ExpandableListAdapter1.Item sentence5 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "What are the tourist attractions in this city?");
        sentence5.invisibleChildren = new ArrayList<>();
        sentence5.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "I dosiui gwangwang myeongso-eneun eotteon geos-i iss-eoyo?"));
        sentence5.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "이 도시의 관광 명소에는 어떤 것이 있어요?"));
        data.add(sentence5);

        ExpandableListAdapter1.Item sentence6 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "It was really fun.");
        sentence6.invisibleChildren = new ArrayList<>();
        sentence6.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Neomu jaemiss-eoss-eoyo."));
        sentence6.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "너무 재밌었어요."));
        data.add(sentence6);




        ExpandableListAdapter1.Item sentence7= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Can I take a picture here?");
        sentence7.invisibleChildren = new ArrayList<>();
        sentence7.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Yeogiseo sajin-eul jjig-eodo dwaeyo?"));
        sentence7.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "여기서 사진을 찍어도 돼요?"));
        data.add(sentence7);

        ExpandableListAdapter1.Item sentence8= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Would you take a picture of me?");
        sentence8.invisibleChildren = new ArrayList<>();
        sentence8.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Sajin-eul jom jjig-eo jusigess-eoyo?"));
        sentence8.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "사진을 좀 찍어 주시겠어요?"));
        data.add(sentence8);


        ExpandableListAdapter1.Item sentence9= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "How much is the admission fee?");
        sentence9.invisibleChildren = new ArrayList<>();
        sentence9.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Ibjanglyoneun eolmayeyo?"));
        sentence9.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "입장료는 얼마예요?"));
        data.add(sentence9);

        ExpandableListAdapter1.Item sentence10= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Do you have a free map?");
        sentence10.invisibleChildren = new ArrayList<>();
        sentence10.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Mulyo jidoga iss-eoyo?"));
        sentence10.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "무료 지도가 있어요?"));
        data.add(sentence10);


        recyclerview.setAdapter(new ExpandableListAdapter1(data));
    }
}
