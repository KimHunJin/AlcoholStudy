package com.sku.sooltudy.firstapp;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sku.sooltudy.R;

public class ShowDiaryActivity extends AppCompatActivity {

    TextView txtDiaryContentsName, txtDiaryContents, txtDiaryTitle;
    Button btnClose;
    SQLite sqLite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_diary);

        txtDiaryTitle = (TextView)findViewById(R.id.txtDiaryName);
        txtDiaryContentsName = (TextView)findViewById(R.id.txtDiaryContentsName);
        txtDiaryContents = (TextView)findViewById(R.id.txtDiaryContents);
        btnClose = (Button)findViewById(R.id.btnDiaryClose);

        txtDiaryTitle.setText("다이어리");

        Intent it = getIntent();
        String str = it.getExtras().getString("name");

        sqLite = new SQLite(getApplicationContext(),"diary.db", null, 1);
        Cursor cursor = sqLite.select("select * from `diary` where `name` = '" + str + "';");
        while (cursor.moveToNext()) {
            txtDiaryContentsName.setText(cursor.getString(1));
            txtDiaryContents.setText(cursor.getString(2));
        }

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
