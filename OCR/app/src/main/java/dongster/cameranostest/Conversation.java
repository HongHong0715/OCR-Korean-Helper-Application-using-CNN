package dongster.cameranostest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Conversation extends AppCompatActivity {
    Button basicButton;
    Button airportButton;
    Button restButton;
    Button trafficButton;
    Button accommoButton;
    Button shoppingButton;
    Button tourButton;
    Button emergencyButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);

        basicButton=(Button)findViewById(R.id.basic_ex);
        basicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basic_intent=new Intent(Conversation.this,BasicButton.class);
                startActivity(basic_intent);
            }
        });

        airportButton=(Button)findViewById(R.id.airport_ex);
        airportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent airport_inent=new Intent(Conversation.this,AirportButton.class);
                startActivity(airport_inent);
            }
        });

        restButton=(Button)findViewById(R.id.restaurant_ex);
        restButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rest_intent=new Intent(Conversation.this,RestButton.class);
                startActivity(rest_intent);
            }
        });

        trafficButton=(Button)findViewById(R.id.traffic_ex);
        trafficButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tracfic_intent=new Intent(Conversation.this,TrafficButton.class);
                startActivity(tracfic_intent);
            }
        });

        accommoButton=(Button)findViewById(R.id.accommodation_ex);
        accommoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accommo_intent=new Intent(Conversation.this,AccommoButton.class);
                startActivity(accommo_intent);
            }
        });

        shoppingButton=(Button)findViewById(R.id.shopping_ex);
        shoppingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shopping_intent=new Intent(Conversation.this,ShoppingButton.class);
                startActivity(shopping_intent);
            }
        });

        tourButton=(Button)findViewById(R.id.tourism_ex);
        tourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tour_intent=new Intent(Conversation.this,TourButton.class);
                startActivity(tour_intent);
            }
        });

        emergencyButton=(Button)findViewById(R.id.emergency_ex);
        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emergency_intnet=new Intent(Conversation.this,EmergencyButton.class);
                startActivity(emergency_intnet);
            }
        });


    }
}
