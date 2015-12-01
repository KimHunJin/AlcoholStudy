package com.sku.sooltudy.aaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sku.sooltudy.R;

public class SignUpActivity extends AppCompatActivity {

    EditText edtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edtName = (EditText)findViewById(R.id.edtName);
        Button btnSave = (Button)findViewById(R.id.btnJoin);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edtName.getText().toString().toString();
                if(name.length() == 0) {
                    Toast.makeText(getApplicationContext(),"이름입력해",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(),"당신의 이름은 " + name, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
