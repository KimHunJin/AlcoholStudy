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
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(it);
            }

        });



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
