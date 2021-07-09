package com.example.ejournal_itda;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final int MY_PERMISSION_REQUEST_INTERNET = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Perizinan*/
        /*Jika tidak dapat izin*/
        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED){
            /*diizinkan*/
            if (ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this, Manifest.permission.INTERNET)){
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Minta izin");
                builder.setMessage("Mengaktifkan izin ini untuk mengaktifkan internet");
                builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.INTERNET}, MY_PERMISSION_REQUEST_INTERNET);
                    }
                });
                builder.setPositiveButton("Dizinkan", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.INTERNET}, MY_PERMISSION_REQUEST_INTERNET);
                    }
                });
                builder.show();
            } else {
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.INTERNET}, MY_PERMISSION_REQUEST_INTERNET);
            }
        } else {
            /*sudah izinkan*/
        }


        SearchView searchView = findViewById(R.id.pencarian);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(getBaseContext(), query, Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case MY_PERMISSION_REQUEST_INTERNET: {
                /*jika izin dibatalkan maka arraynya kosong*/
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this, "Izin telah diberikan", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "izin tidak diberikan", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }

    public void pindah_angkasa(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2_angkasa.class);
        startActivity(intent);
    }

    public void pindah_compiler(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2_compiler.class);
        startActivity(intent);
    }

    public void pindah_avitec(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2_avitec.class);
        startActivity(intent);
    }
}