package com.example.trainingday1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.trainingday1.model.Orang;

public class PassingObject extends AppCompatActivity {
    public static final String Extra_object="object";

    TextView tvdatareceived1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_object);

        tvdatareceived1 =findViewById(R.id.tv_data_Received1);

        Orang objectorang=getIntent() .getParcelableExtra(Extra_object );
        String tampung ="Nama : " +objectorang .getNama() +"\nAsal : " + objectorang.getAsal()
                   +"\nTinggal : " +objectorang.getTinggal() +"\nJob : " + objectorang .getJob()
                   +"\nUmur : " + objectorang .getUmur() ;
        tvdatareceived1 .setText(tampung);

    }
}
