package com.example.android.csit_w2_demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.tv_1_act1);
        textView2 = (TextView) findViewById(R.id.tv_2_act2);

        /*button = (Button) findViewById(R.id.btn1_act1);
        button.setOnClickListener(new MyLsnr());*/

        //Optimization of previous two lines of code.
        findViewById((R.id.btn1_act1)).setOnClickListener(new MyLsnr());
        findViewById((R.id.btn2_act2)).setOnClickListener(new MyLsnr());

        //Created our owm listener MyLsnr
       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Some other text");
            }
        });*/
    }

    class MyLsnr implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.btn1_act1) {
                textView1.setText(getString(R.string.label1));
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
            else if(view.getId()==R.id.btn2_act2)
            textView2.setText("Clicked second button");
        }
    }
}

