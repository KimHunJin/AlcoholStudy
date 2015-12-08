package com.sku.sooltudy;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Kim on 2015-12-01.
 */
public class SQLiteActivity extends Activity {
    Button btnSelect, btnInsert, btnDelete, btnUpdate;
    TextView tvResult;
    EditText editQuery;
    SQLManager sqlManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);

        initializeLayout();

        setListener();

        sqlManager = new SQLManager(getApplicationContext(), "sooltudy.db", null, 1);

    }

    private void initializeLayout(){
        btnSelect = (Button)findViewById(R.id.btnSelect);
        btnInsert = (Button)findViewById(R.id.btnInsert);
        btnDelete = (Button)findViewById(R.id.btnDelete);
        btnUpdate = (Button)findViewById(R.id.btnUpdate);
        tvResult = (TextView)findViewById(R.id.tvResult);
        editQuery = (EditText)findViewById(R.id.editQuery);
    }

    private void setListener(){
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editQuery.getText().toString().trim();
                sqlManager.insert("INSERT INTO `sooltudy` VALUES ('" + getTime() + "', '" + value + "')");
                editQuery.setText("");
                Toast.makeText(getApplicationContext(),"완료",Toast.LENGTH_SHORT).show();
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("");
                Cursor cursor = sqlManager.select("SELECT * FROM `sooltudy`");

                while(cursor.moveToNext())
                    tvResult.append("key : " + cursor.getString(0) + " name : " + cursor.getString(1) + "\n");
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    private String getTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String time = dateFormat.format(calendar.getTime());
        return time;
    }
}
