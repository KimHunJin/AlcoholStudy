package com.sku.sooltudy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView tvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        Button button = (Button) findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(it);
            }

        });
<<<<<<< HEAD
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),WriteActivity.class);
                startActivity(it);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent it = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(it);
            }
        });
=======
        Button btnToWrite = (Button)findViewById(R.id.btnToWrite);

>>>>>>> 77bb6c9b54018b039df651ea726716f6d34f4794



////        tvMain = (TextView)findViewById(R.id.textView);
////
////        tvMain.setText("Hello Sooltudy!");
////
////        tvMain.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                tvMain.setText("Hello alcholStudy");
//            }
//        });
//    }



}}
