package com.example.opilane.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tekst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tekst= (TextView)findViewById(R.id.Hello); 
    }


}
