package com.sku.sooltudy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Kim on 2015-11-11.
 */
public class SignUpActivity extends Activity {
    EditText etId;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        checkID();

        initializationLayout();

        setListener();
    }

    private void checkID(){
        String userId = DataUtil.getAppPreferences(getApplicationContext(),"id");
        if(userId != ""){
            Intent itMain = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(itMain);
            finish();
        }
    }

    private void initializationLayout(){
        etId = (EditText)findViewById(R.id.signup_edit_id);
        btnSave = (Button)findViewById(R.id.signup_btn_save);
    }

    private void setListener(){
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getId;
                getId = etId.getText().toString().trim();

                if(getId.length() == 0){
                    Toast.makeText(getApplicationContext(),"닉네임을 입력해주세요",Toast.LENGTH_SHORT).show();
                    return;
                }

                DataUtil.setAppPreferences(getApplicationContext(),"id",getId);

                Intent itMain = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(itMain);
                finish();
            }
        });
    }
}
