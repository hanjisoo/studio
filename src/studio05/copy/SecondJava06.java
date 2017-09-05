/*
 package com.javaex.bit.ex06;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static int LOGIN_OK=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv2=(TextView)findViewById(R.id.tv2);
        Button btn2=(Button)findViewById(R.id.btn2);

        //1->2데이터 받기
        Intent intent=getIntent();
        String id=intent.getStringExtra("id");
        String pass=intent.getStringExtra("pass");

        tv2.setText("id:"+ id +"   pass:"+ pass);
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent=new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("name","지수");
                intent.putExtra("email", "cc@com");
                setResult(LOGIN_OK,intent);
                finish();
            }
        });

    }

}

 */