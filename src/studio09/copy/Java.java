/*package com.javaex.bit.ex09;

import android.provider.MediaStore;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv=(TextView)findViewById(R.id.tv);
        final RadioGroup rg=(RadioGroup)findViewById(R.id.rg);
        Button btn=(Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                RadioButton selectedRdo=(RadioButton)findViewById(rg.getCheckedRadioButtonId());
                tv.setText(selectedRdo.getText().toString());
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                RadioButton selectedRdo=(RadioButton)findViewById(checkedId);
                Toast.makeText(MainActivity.this,selectedRdo.getText().toString()+"색",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
*/