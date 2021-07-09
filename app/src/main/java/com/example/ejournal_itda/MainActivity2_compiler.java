package com.example.ejournal_itda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2_compiler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_compiler);
    }

    public void pindah_jurnalcompiler1(View view) {
        Intent intent = new Intent(MainActivity2_compiler.this, MainActivity3_compiler1.class);
        startActivity(intent);
    }

    public void pindah_jurnalcompiler2(View view) {
        Intent intent = new Intent(MainActivity2_compiler.this, MainActivity3_compiler2.class);
        startActivity(intent);
    }
}