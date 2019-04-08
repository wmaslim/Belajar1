package com.example.trainingday1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PassingData extends AppCompatActivity {
    public static final String key_name="Name";
    public static final String key_age="age";

    TextView tvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_data);

        tvDataReceived =findViewById(R.id.tv_data_Received );

        String nama=getIntent().getStringExtra(key_name );
        int umur =getIntent() .getIntExtra(key_age ,0);

        String tampung="Nama : " + nama +"\nUmur : " +umur;
        tvDataReceived .setText(tampung);


    }

}
