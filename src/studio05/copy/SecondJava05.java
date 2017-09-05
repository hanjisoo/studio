/*
package com.javaex.bit.ex05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv2=(TextView) findViewById(R.id.tv2);
        Button btn2=(Button)findViewById(R.id.btn2);

        //1->2 데이터받기
        Intent intent=getIntent();
        String id=intent.getStringExtra("id");
        int pass=intent.getIntExtra("pass",0);

        //1->2 받은 데이터 출력
        tv2.setText(" id:"+id + "  pass:"+ pass);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("name","지수");
                intent.putExtra("email","ya@com");
                startActivity(intent);

            }
        });

        Log.d("life2","2.onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life2","2.onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("life2","2.onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("life2","2.onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("life2","2.onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("life2","2.onDestroy()");
    }

}

*/