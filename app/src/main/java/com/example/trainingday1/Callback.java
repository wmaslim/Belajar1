package com.example.trainingday1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Callback extends AppCompatActivity implements View.OnClickListener {

    public static final String Extra_Data="Data";
    //TODO 4.1 deklarasi
    Button btncallback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callback);

        btncallback =findViewById(R.id.btn_callback );

        btncallback.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
          Intent callback=new Intent();
          callback .putExtra(Extra_Data ,"Ini Data Callback");
          setResult(RESULT_OK,callback) ;
          //TODO 4.5 close activity
          finish() ;

    }
}
