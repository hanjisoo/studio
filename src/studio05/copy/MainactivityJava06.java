package studio05.copy;
/*
 package com.javaex.bit.ex06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final static int REQUEST_CODE=0;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.tv1);
        Button btn1=(Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent= new Intent( MainActivity.this, SecondActivity.class);
                intent.putExtra("id","remys");
                intent.putExtra("pass","123");
                startActivityForResult(intent, REQUEST_CODE);
            }

        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String name=data.getStringExtra("name");
        String email=data.getStringExtra("email");

        tv1.setText("name:"+ name+"   email:"+email);

    }

}

*/