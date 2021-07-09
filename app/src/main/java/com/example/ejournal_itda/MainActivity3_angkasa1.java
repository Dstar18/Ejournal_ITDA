package com.example.ejournal_itda;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity3_angkasa1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_angkasa1);

        /*Button Buka link*/
        Button buka_angkasa1link = (Button) findViewById(R.id.btn_bukaangkasa1);
        buka_angkasa1link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://docs.google.com/viewerng/viewer?url=https://ejournals.itda.ac.id/index.php/angkasa/article/viewFile/784/pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }

    public void Download_angkasa1(View view) {
        Uri uri = Uri.parse("https://ejournals.itda.ac.id/index.php/angkasa/article/download/784/pdf");

        DownloadManager downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);

        request.setTitle("Data Download");
        request.setDescription("Android Data download using DownloadManager");

        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"JurnalAngkasa1.pdf");
        request.setMimeType("*/*");
        downloadManager.enqueue(request);
    }
}