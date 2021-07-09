package com.example.ejournal_itda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2_angkasa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_angkasa);
    }

    public void pindah_jurnalangkasa1(View view) {
        Intent intent = new Intent(MainActivity2_angkasa.this, MainActivity3_angkasa1.class);
        startActivity(intent);
    }

    public void pindah_jurnalangkasa2(View view) {
        Intent intent = new Intent(MainActivity2_angkasa.this, MainActivity3_angkasa2.class);
        startActivity(intent);
    }
}