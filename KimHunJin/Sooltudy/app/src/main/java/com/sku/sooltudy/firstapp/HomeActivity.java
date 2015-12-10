package com.sku.sooltudy.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sku.sooltudy.R;

public class HomeActivity extends AppCompatActivity {

    Button btnMakeSatr, btnMakeDiary, btnDiaryList;
    TextView txtHomeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtHomeName = (TextView)findViewById(R.id.txtDiaryName);
        txtHomeName.setText("홈");

        btnMakeSatr = (Button)findViewById(R.id.btnMakeStar);
        btnMakeDiary = (Button)findViewById(R.id.btnDiary);
        btnDiaryList = (Button)findViewById(R.id.btnDiaryList);

        btnMakeSatr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(),StarActivity.class));
            }
        });

        btnMakeDiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(),DiaryActivity.class));
            }
        });

        btnDiaryList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(),DiaryListActivity.class));
            }
        });

    }
}
