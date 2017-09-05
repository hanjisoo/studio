/* studio04 계산기

package com.javaex.bit.ex04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView mainCount=(TextView)findViewById(R.id.mainCount);
        Button seven=(Button)findViewById(R.id.seven);
        Button eight=(Button)findViewById(R.id.eight);
        Button nine=(Button)findViewById(R.id.nine);
        Button div=(Button)findViewById(R.id.div);
        Button four=(Button)findViewById(R.id.four);
        Button five=(Button)findViewById(R.id.five);
        Button six=(Button)findViewById(R.id.six);
        Button mul=(Button)findViewById(R.id.mul);
        Button one=(Button)findViewById(R.id.one);
        Button two=(Button)findViewById(R.id.two);
        Button three=(Button)findViewById(R.id.three);
        Button sub=(Button)findViewById(R.id.sub);
        Button zero=(Button)findViewById(R.id.zero);
        Button plus=(Button)findViewById(R.id.plus);

        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"7");
            }
        });

        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"9");
            }
        });
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"/");
            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"6");
            }
        });
        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"*");
            }
        });
        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"3");
            }
        });
        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"-");
            }
        });
        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mainCount.setText(mainCount.getText().toString()+"+");
            }
        });

    }
}
*/