package com.example.trainingday1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.example.trainingday1.model.Orang;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnmove,btnpassdata,btnpassobject,btncallback,btnemail,btncall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmove =findViewById(R.id.btn_move );
        btnpassdata =findViewById(R.id.btn_passdata );
        btnpassobject =findViewById(R.id.btn_passobject );
        btncallback =findViewById(R.id.btn_callback );
        btnemail =findViewById(R.id.btn_email );
        btncall =findViewById(R.id.btn_call );

        btnmove.setOnClickListener(this);
        btnpassdata.setOnClickListener(this);
        btnpassobject.setOnClickListener(this);
        btncallback.setOnClickListener(this);
        btnemail.setOnClickListener(this);
        btncall.setOnClickListener(this);

//        btnmove.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent move=new Intent(MainActivity.this,Move.class);
//                startActivity(move );
//
//           }
//        });


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_move:
                 move() ;
                 break;
            case R.id.btn_passdata:
                 passdata();
                 break;
            case R.id.btn_passobject:
                passingobject();

                break;
            case R.id.btn_callback:
                break;
            case R.id.btn_email:
                break;
            case R.id.btn_call:
                break;
        }
    }

    private void passingobject() {
        Intent passobject=new Intent(MainActivity .this,PassingObject .class);
        //buat object dari class orang
        Orang objectorang=new Orang() ;
        objectorang.setNama("Werdi");
        objectorang.setJob("IT");
        objectorang.setAsal("Jakarta");
        objectorang.setTinggal("Jakarta");
        objectorang.setUmur(43);
        passobject.putExtra(PassingObject.Extra_object ,objectorang );
        startActivity(passobject);

    }

    //todo 2.3
    private void passdata() {
           Intent passdata=new Intent(MainActivity.this,PassingData.class );
           passdata.putExtra(PassingData.key_name,"Werdi");
           passdata.putExtra(PassingData.key_age ,43);
           startActivity(passdata );


    }

    private void move(){
        //todo 1.4
        //*blabla*/

         Intent move=new Intent(MainActivity.this,Move.class);
         startActivity(move);
    }

}
