/*package com.javaex.bit.ex08;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       tv=(TextView)findViewById(R.id.tv);
        final TextView tv =(TextView)findViewById(R.id.tv);
        final EditText etID=(EditText)findViewById(R.id.etID);
        final EditText etPass =(EditText) findViewById(R.id.etPass);
        Button btnLogin=(Button)findViewById(R.id.btnLogin);
        final Spinner sp =(Spinner)findViewById(R.id.sp);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override   //클래스인데 한번쓰고 버릴꺼라 여기서 만들어서 바로쓰고 바로 버려
            public void onClick(View v) {
                String id=etID.getText().toString();
                String pass=etPass.getText().toString();
                String spStr =sp.getSelectedItem().toString();
                tv.setText("id: "+id+"  pass: " +pass+"   sp: "+spStr );

                Toast.makeText(MainActivity.this,"토스트",Toast.LENGTH_SHORT).show();
            }
        });
        //지역선택할때 토스트뜨게
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String spStr =sp.getSelectedItem().toString();    //값빼옴
                Toast.makeText(MainActivity.this,spStr+"선택",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }//주의
        });
    }
}
*/