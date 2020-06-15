package com.example.holle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {
    private Handler mMainHandler;
    private Socket socket;
    private ExecutorService mThreadPool;
    private Button button;
    InputStream is;
    OutputStream outputStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mThreadPool = Executors.newCachedThreadPool();
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mThreadPool.execute(new Runnable() {
                    @Override
                    public void run() {
 //                       try {
 //                           socket = new Socket("192.168.124.8",7777);
  //                          System.out.println(socket.isConnected());
   //                     } catch (IOException e) {
  //                          e.printStackTrace();
  //                      }
  //                      socket.isConnected();
                        startActivity(new Intent(MainActivity.this,MainActivity2.class));
                    }
                });
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
