/*package com.javaex.bit.ex10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv =(TextView)findViewById(R.id.tv);
        final CheckBox cb =(CheckBox)findViewById(R.id.cb);
        Button btn =(Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            String str;

            @Override
            public void onClick(View v) {
              //체크여부확인
                if(cb.isChecked()==true) {
                    str = cb.getText().toString();

                }else{
                    str=" ";
                }
                tv.setText(str);
            }
        });

        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String str="";
                if(cb.isChecked()==true){
                    str="동의";
                }
                if(cb.isChecked()==false){
                    str="비동의";
                }
                tv.setText(str);
            }
        });
    }
}
*/