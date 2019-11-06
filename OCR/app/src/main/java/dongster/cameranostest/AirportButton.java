package dongster.cameranostest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AirportButton extends AppCompatActivity {
    private RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport_button);

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<ExpandableListAdapter1.Item> data = new ArrayList<>();


        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));
        // data.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, ""));


        ExpandableListAdapter1.Item sentence1 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "What time does the first flight leave?");
        sentence1.invisibleChildren = new ArrayList<>();
        sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Cheos bihaeng-gineun myeoch sie chulbalhaeyo?"));
        //sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence1.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "첫 비행기는 몇 시에 출발해요?"));
        data.add(sentence1);

        ExpandableListAdapter1.Item sentence2 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "What is the arrival time?");
        sentence2.invisibleChildren = new ArrayList<>();
        sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Dochag sigan-eun eonjeeyo?"));
        //sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence2.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "도착 시간은 언제에요?"));
        data.add(sentence2);

        ExpandableListAdapter1.Item sentence3 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "How many are on the waiting list now?");
        sentence3.invisibleChildren = new ArrayList<>();
        sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Hyeonjae daegijaneun myeoch myeong-ieyo?"));
        //sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, " "));
        sentence3.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "현재 대기자는 몇 명이에요?"));
        data.add(sentence3);

        ExpandableListAdapter1.Item sentence4 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Please put me on the waiting list.");
        sentence4.invisibleChildren = new ArrayList<>();
        sentence4.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Daegija myeongdan-e ollyeojuseyo."));
        sentence4.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "대기자 명단에 올려주세요."));
        data.add(sentence4);

        ExpandableListAdapter1.Item sentence5 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "How long is the layover?");
        sentence5.invisibleChildren = new ArrayList<>();
        sentence5.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Gyeong-yujieseoneun eolmana gidalyeoya haeyo?"));
        sentence5.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "경유지에서는 얼마나 기다려야 해요?"));
        data.add(sentence5);

        ExpandableListAdapter1.Item sentence6 = new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I'd like to confirm my reservation.");
        sentence6.invisibleChildren = new ArrayList<>();
        sentence6.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Yeyag-eul hwag-inhago sip-eoyo."));
        sentence6.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "예약을 확인하고 싶어요."));
        data.add(sentence6);

        ExpandableListAdapter1.Item sentence7= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I need to cancel my flight.");
        sentence7.invisibleChildren = new ArrayList<>();
        sentence7.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Bihaeng-gileul chwisohaeyagess-eoyo."));
        sentence7.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "비행기를 취소해야겠어요."));
        data.add(sentence7);

        ExpandableListAdapter1.Item sentence8= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I'd like to change my reservation.");
        sentence8.invisibleChildren = new ArrayList<>();
        sentence8.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Yeyag-eul byeongyeonghago sip-eoyo."));
        sentence8.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "예약을 변경하고 싶어요."));
        data.add(sentence8);



        ExpandableListAdapter1.Item sentence9= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "When does the boarding start?");
        sentence9.invisibleChildren = new ArrayList<>();
        sentence9.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Tabseung-eun eonjebuteo hanayo."));
        sentence9.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "탑승은 언제부터 하나요?"));
        data.add(sentence9);

        ExpandableListAdapter1.Item sentence10= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where is the boarding gate?");
        sentence10.invisibleChildren = new ArrayList<>();
        sentence10.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Tabseung geiteuneun eodie iss-eoyo?"));
        sentence10.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "탑승 게이트는 어디에 있어요?"));
        data.add(sentence10);

        ExpandableListAdapter1.Item sentence11= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I want to check this piece of luggage.");
        sentence11.invisibleChildren = new ArrayList<>();
        sentence11.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "I jim-eul buchyeo juseyo."));
        sentence11.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "이 짐을 부쳐 주세요."));
        data.add(sentence11);



        ExpandableListAdapter1.Item sentence12= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I'm here on vacation.");
        sentence12.invisibleChildren = new ArrayList<>();
        sentence12.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Hyuga wass-eoyo."));
        sentence12.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "휴가 왔어요."));
        data.add(sentence12);

        ExpandableListAdapter1.Item sentence13= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I'm here on businesss.");
        sentence13.invisibleChildren = new ArrayList<>();
        sentence13.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Sa-eobcha wassseubnida."));
        sentence13.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "사업차 왔습니다."));
        data.add(sentence13);

        ExpandableListAdapter1.Item sentence14= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Here is the customs declaration form.");
        sentence14.invisibleChildren = new ArrayList<>();
        sentence14.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Segwan singoseo yeogi issseubnida."));
        sentence14.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "세관 신고서 여기 있습니다."));
        data.add(sentence14);

        ExpandableListAdapter1.Item sentence15= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Please help me fill it out.");
        sentence15.invisibleChildren = new ArrayList<>();
        sentence15.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Sseuneun geos-eul dowajuseyo."));
        sentence15.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "쓰는 것을 도와주세요."));
        data.add(sentence15);



        ExpandableListAdapter1.Item sentence16= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where is my seat?");
        sentence16.invisibleChildren = new ArrayList<>();
        sentence16.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Je jalineun eodieyo?"));
        sentence16.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "제 자리는 어디에요?"));
        data.add(sentence16);

        ExpandableListAdapter1.Item sentence17= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "When will meals be served?");
        sentence17.invisibleChildren = new ArrayList<>();
        sentence17.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Sigsaneun eonje nawayo?"));
        sentence17.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "식사는 언제 나와요?"));
        data.add(sentence17);

        ExpandableListAdapter1.Item sentence18= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I feel sick.");
        sentence18.invisibleChildren = new ArrayList<>();
        sentence18.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Sog-i an joh-ayo."));
        sentence18.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "속이 안 좋아요."));
        data.add(sentence18);

        ExpandableListAdapter1.Item sentence19= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I have a headache.");
        sentence19.invisibleChildren = new ArrayList<>();
        sentence19.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Meoliga apayo."));
        sentence19.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "머리가 아파요."));
        data.add(sentence19);



        ExpandableListAdapter1.Item sentence20= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where is the information desk?");
        sentence20.invisibleChildren = new ArrayList<>();
        sentence20.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Annaesoneun eodie iss-eoyo?"));
        sentence20.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "안내소는 어디에 있어요?"));
        data.add(sentence20);

        ExpandableListAdapter1.Item sentence21= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where can I exchange money?");
        sentence21.invisibleChildren = new ArrayList<>();
        sentence21.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Eodiseo hwanjeonhaeyo?"));
        sentence21.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "어디서 환전해요?"));
        data.add(sentence21);

        ExpandableListAdapter1.Item sentence22= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I'd like to exchange this, please.");
        sentence22.invisibleChildren = new ArrayList<>();
        sentence22.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Hwanjeonhae juseyo."));
        sentence22.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "환전해 주세요."));
        data.add(sentence22);

        ExpandableListAdapter1.Item sentence23= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where can I take the subway?");
        sentence23.invisibleChildren = new ArrayList<>();
        sentence23.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Jihacheol-eun eodiseo tayo?"));
        sentence23.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "지하철은 어디서 타요?"));
        data.add(sentence23);

        ExpandableListAdapter1.Item sentence24= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "Where can I rent a car?");
        sentence24.invisibleChildren = new ArrayList<>();
        sentence24.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Lenteokaneun eodiseo billyeoyo?"));
        sentence24.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "렌터카는 어디서 빌려요?"));
        data.add(sentence24);

        ExpandableListAdapter1.Item sentence25= new ExpandableListAdapter1.Item(ExpandableListAdapter1.HEADER, "I'd like to sign up for roaming service.");
        sentence25.invisibleChildren = new ArrayList<>();
        sentence25.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "Loming seobiseuleul sincheonghago sip-eoyo."));
        sentence25.invisibleChildren.add(new ExpandableListAdapter1.Item(ExpandableListAdapter1.CHILD, "로밍 서비스를 신청하고 싶어요."));
        data.add(sentence25);

        recyclerview.setAdapter(new ExpandableListAdapter1(data));
    }
}
