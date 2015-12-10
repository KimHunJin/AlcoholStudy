package com.sku.sooltudy.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sku.sooltudy.R;

public class DiaryActivity extends AppCompatActivity {

    Button btnDiarySvae, btnDiaryCancel;
    EditText edtDiaryContents, edtDiaryName;
    SQLite sqLite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        btnDiarySvae = (Button)findViewById(R.id.btnDiarySave);
        btnDiaryCancel = (Button)findViewById(R.id.btnDiaryCancel);
        edtDiaryContents = (EditText)findViewById(R.id.edtDiaryContents);
        edtDiaryName = (EditText)findViewById(R.id.edtDiaryName);
        sqLite = new SQLite(getApplicationContext(),"diary.db", null, 1);

        btnDiaryCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"취소하였습니다.",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnDiarySvae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtDiaryName.getText().toString();
                String contents = edtDiaryContents.getText().toString();
                if(name.equals("") || contents.equals("")) {
                    Toast.makeText(getApplicationContext(),"제목과 내용을 확인해주세요.",Toast.LENGTH_SHORT).show();
                }
                else {
                    sqLite.insert("insert into `diary` (name, content) values ('"+ edtDiaryName.getText().toString() +"','"+edtDiaryContents.getText().toString()+"');");
                    Toast.makeText(getApplicationContext(),"저장되었습니다.",Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }
}
