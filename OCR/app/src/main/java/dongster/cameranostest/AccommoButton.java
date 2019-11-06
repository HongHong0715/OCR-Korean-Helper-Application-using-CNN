package dongster.cameranostest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AccommoButton extends AppCompatActivity {
    private RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accommo_button);

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<ExpandableListAdapter1.Item> data = new ArrayList<>();


        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));


        ExpandableListAdapter1.Item sentence1 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I'd like to book a room.");
        sentence1.invisibleChildren = new ArrayList<>();
        sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Bang-eul yeyaghago sip-eoyo."));
        //sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "방을 예약하고 싶어요."));
        data.add(sentence1);

        ExpandableListAdapter1.Item sentence2 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "How much is the room?");
        sentence2.invisibleChildren = new ArrayList<>();
        sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Bang gabs-eun eolmayeyo?"));
        //sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "방 값은 얼마예요?"));
        data.add(sentence2);

        ExpandableListAdapter1.Item sentence3 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Do you have any vacancies?");
        sentence3.invisibleChildren = new ArrayList<>();
        sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Bin bang iss-eoyo?"));
        //sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "빈 방 있어요?"));
        data.add(sentence3);

        ExpandableListAdapter1.Item sentence4 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I'd like a quiet room, please.");
        sentence4.invisibleChildren = new ArrayList<>();
        sentence4.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Joyonghan bang-eulo juseyo."));
        sentence4.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "조용한 방으로 주세요."));
        data.add(sentence4);

        ExpandableListAdapter1.Item sentence5 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I'd like to cancel my reservation.");
        sentence5.invisibleChildren = new ArrayList<>();
        sentence5.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Yeyag-eul chwisohagessseubnida."));
        sentence5.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "예약을 취소하겠습니다."));
        data.add(sentence5);

        ExpandableListAdapter1.Item sentence6 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where do I check in?");
        sentence6.invisibleChildren = new ArrayList<>();
        sentence6.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Chekeu-in-eun eodiseo habnikka?"));
        sentence6.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "체크인은 어디서 합니까?"));
        data.add(sentence6);

        ExpandableListAdapter1.Item sentence7= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Here is my reservation information.");
        sentence7.invisibleChildren = new ArrayList<>();
        sentence7.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Yeogi je yeyag jeongboibnida."));
        sentence7.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "여기 제 예약 정보입니다."));
        data.add(sentence7);

        ExpandableListAdapter1.Item sentence8= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I'd like to check in.");
        sentence8.invisibleChildren = new ArrayList<>();
        sentence8.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Chekeu-inhago sipseubnida."));
        sentence8.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "체크인하고 싶습니다."));
        data.add(sentence8);



        ExpandableListAdapter1.Item sentence9= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where is breakfast served?");
        sentence9.invisibleChildren = new ArrayList<>();
        sentence9.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Achim sigsaneun eodiseo haeyo?"));
        sentence9.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "아침 식사는 어디서 해요?"));
        data.add(sentence9);

        ExpandableListAdapter1.Item sentence10= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "My room needs to be cleaned, please.");
        sentence10.invisibleChildren = new ArrayList<>();
        sentence10.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Je bang-eul cheongsohae juseyo."));
        sentence10.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "제 방을 청소해 주세요."));
        data.add(sentence10);

        ExpandableListAdapter1.Item sentence11= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Could you keep my valuables for me?");
        sentence11.invisibleChildren = new ArrayList<>();
        sentence11.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Gwijungpum-eul matgigo sip-eoyo."));
        sentence11.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "귀중품을 맡기고 싶어요."));
        data.add(sentence11);

        ExpandableListAdapter1.Item sentence12= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I'd like to change rooms, please.");
        sentence12.invisibleChildren = new ArrayList<>();
        sentence12.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Daleun bang-eulo bakkwo juseyo."));
        sentence12.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "다른 방으로 바꿔 주세요."));
        data.add(sentence12);

        ExpandableListAdapter1.Item sentence13= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Could I have more towels?");
        sentence13.invisibleChildren = new ArrayList<>();
        sentence13.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Sugeon-eul deo juseyo."));
        sentence13.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "수건을 더 주세요."));
        data.add(sentence13);

        ExpandableListAdapter1.Item sentence14= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "My room is too cold.");
        sentence14.invisibleChildren = new ArrayList<>();
        sentence14.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Bang-i neomu chuwoyo."));
        sentence14.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "방이 너무 추워요."));
        data.add(sentence14);

        ExpandableListAdapter1.Item sentence15= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "My room is too hot.");
        sentence15.invisibleChildren = new ArrayList<>();
        sentence15.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Bang-i neomu deowoyo."));
        sentence15.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "방이 너무 더워요."));
        data.add(sentence15);



        ExpandableListAdapter1.Item sentence16= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "What time do I check out?");
        sentence16.invisibleChildren = new ArrayList<>();
        sentence16.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Chekeuaus-eun myeoch siyeyo?"));
        sentence16.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "체크아웃은 몇 시예요?"));
        data.add(sentence16);

        ExpandableListAdapter1.Item sentence17= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Could you call me a taxi?");
        sentence17.invisibleChildren = new ArrayList<>();
        sentence17.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Taegsileul bulleo juseyo."));
        sentence17.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "택시를 불러 주세요."));
        data.add(sentence17);


        ExpandableListAdapter1.Item sentence19= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Could I get a receipt, please?");
        sentence19.invisibleChildren = new ArrayList<>();
        sentence19.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Yeongsujeung juseyo."));
        sentence19.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "영수증 주세요."));
        data.add(sentence19);

        ExpandableListAdapter1.Item sentence20= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I'd like to leave a day early.");
        sentence20.invisibleChildren = new ArrayList<>();
        sentence20.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Halu iljjig nagago sip-eoyo."));
        sentence20.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "하루 일찍 나가고 싶어요."));
        data.add(sentence20);

        ExpandableListAdapter1.Item sentence21= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Can I stay another night?");
        sentence21.invisibleChildren = new ArrayList<>();
        sentence21.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Halusbam deo mug-eul su iss-eoyo?"));
        sentence21.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "하룻밤 더 묵을 수 있어요?"));
        data.add(sentence21);

        recyclerview.setAdapter(new ExpandableListAdapter1(data));
    }
}
