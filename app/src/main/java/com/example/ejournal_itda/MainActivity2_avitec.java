package com.example.ejournal_itda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2_avitec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_avitec);
    }

    public void pindah_jurnalavitec1(View view) {
        Intent intent = new Intent(MainActivity2_avitec.this, MainActivity3_avitec1.class);
        startActivity(intent);
    }

    public void pindah_jurnalavitec2(View view) {
        Intent intent = new Intent(MainActivity2_avitec.this, MainActivity3_avitec2.class);
        startActivity(intent);
    }
}