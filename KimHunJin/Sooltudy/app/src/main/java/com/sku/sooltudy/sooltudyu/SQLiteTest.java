package com.sku.sooltudy.sooltudyu;

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

public class SQLiteTest extends AppCompatActivity {

    Button btnSelect, btnInsert, btnUpdate, btnDelete;
    TextView txtResult;
    EditText edtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_test);

        btnSelect = (Button)findViewById(R.id.btnSelect1);
        btnInsert = (Button)findViewById(R.id.btnInsert1);
        btnDelete = (Button)findViewById(R.id.btnDelete1);
        btnUpdate = (Button)findViewById(R.id.btnUpdate1);
        txtResult = (TextView)findViewById(R.id.txtResult1);
        edtInput = (EditText)findViewById(R.id.edtContext);

        final SQLManager sqlManager = new SQLManager(getApplicationContext(), "sooltudy.db", null, 1);
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlManager.insert(edtInput.getText().toString());
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "";
                Cursor cursor = sqlManager.select("select * from `sooltudy`");
                while (cursor.moveToNext()) {
                    str += "number : " + cursor.getInt(0) + "name : " + cursor.getString(1) + "\n";
                }
                txtResult.setText(str);
            }
        });
    }
}
