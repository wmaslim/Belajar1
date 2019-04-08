package com.example.trainingday1;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.example.trainingday1.model.Orang;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int REQUEST_CODE =1 ;
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
                callback();

                break;
            case R.id.btn_email:
                implicitemail();
                break;
            case R.id.btn_call:
                implicitcall();
                break;
        }
    }
    //TODO 6.1
    private void implicitemail() {
        Intent email =new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","candakinnara2003@yahoo.com",null) );
        email.putExtra(Intent.EXTRA_SUBJECT ,"testing 1");
        email.putExtra(Intent .EXTRA_TEXT ,"body message 1");
        if (email.resolveActivity(getPackageManager()) != null ){
            startActivity( Intent.createChooser(email,"Pilih share client"));
        }else {
            Toast .makeText(this,"Tidak ada share client",Toast.LENGTH_SHORT ).show() ;
        }
       // startActivity(email);
    }

    //TODO 5.1
    private void implicitcall() {
        Intent call=new Intent(Intent.ACTION_DIAL );
        call.setData(Uri.parse("tel:08128131365"));
        startActivity(call);

    }

    //TODO 4.6 CALLBACK
    private void callback() {
        Intent callback=new Intent(MainActivity .this,Callback .class );
        startActivityForResult(callback ,REQUEST_CODE) ;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode ==REQUEST_CODE ){
            if (resultCode ==RESULT_OK ){
                String tampung=data.getStringExtra(Callback.Extra_Data );
                Toast.makeText(this,tampung,Toast.LENGTH_SHORT ).show() ;

            }
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
