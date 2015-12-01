package com.sku.sooltudy.aaa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sku.sooltudy.R;
import com.sku.sooltudy.sooltudyu.SQLiteTest;

public class MainActivity extends Activity {

    Button btn;
    TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btn);
        Button signUpBtn = (Button)findViewById(R.id.btnSignUp);
        Button btnSQL = (Button)findViewById(R.id.btnSQLPage);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(it);
            }
        });

        Button btnDiary = (Button)findViewById(R.id.btnDiary);
        btnDiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(),DiaryActivity.class));
            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplication(), SignUpActivity.class);
                startActivity(it);
            }
        });

        btnSQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(),SQLActivity.class));
            }
        });

        Button btnSqltest = (Button)findViewById(R.id.btnSQLTest);
        btnSqltest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), SQLiteTest.class));
            }
        });
    }
}
