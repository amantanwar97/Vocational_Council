package com.example.user.vocational_council;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread th=new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (Exception e) {
                } finally {
                    Intent i = new Intent(Main.this, Main2.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        th.start();
    }
}
