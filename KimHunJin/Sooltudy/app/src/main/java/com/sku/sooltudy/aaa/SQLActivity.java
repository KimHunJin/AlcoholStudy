package com.sku.sooltudy.aaa;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sku.sooltudy.R;

public class SQLActivity extends AppCompatActivity {

    Button btnInsert, btnSelect, btnUpdate, btnDelete;
    EditText editText;
    TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);

        final DBManager dbManager = new DBManager(getApplicationContext(), "food.db", null, 1);
        btnInsert = (Button)findViewById(R.id.btnInsert);
        btnSelect = (Button)findViewById(R.id.btnSelect);
        btnUpdate = (Button)findViewById(R.id.btnUpadte);
        btnDelete = (Button)findViewById(R.id.btnDelete);
        editText = (EditText)findViewById(R.id.edtText);
        txtResult = (TextView)findViewById(R.id.txtResult);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbManager.insert("insert into `food` values(1,'"+editText.getText().toString()+"');");
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor = dbManager.select("select * from `food`");
                String str = "";
                while (cursor.moveToNext()) {
                    str += cursor.getInt(0) + "  " + cursor.getString(1);
                }
                txtResult.setText(str);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sql, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
