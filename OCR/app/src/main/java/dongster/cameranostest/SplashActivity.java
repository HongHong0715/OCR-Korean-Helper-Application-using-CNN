package dongster.cameranostest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.os.Handler;

/**
 * Created by gihye on 2019-06-24.
 */


public class SplashActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 1000;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
        */
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* 메뉴액티비티를 실행하고 로딩화면을 죽인다.*/
                Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}

