package com.sku.sooltudy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2015-11-10.
 */
public class SignupActivity extends Activity{

    EditText etid;
    Button btn_save;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_signup);
        //레이아웃 생성

        etid = (EditText)findViewById(R.id.et_id); //레이아웃에 저장한 아이디를 가져오는메소드findview~
        btn_save = (Button)findViewById(R.id.btn_save);
        // 클릭 리스너
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //닉네임 받아오기
                String name = etid.getText().toString().trim();

                if (name.length() == 0){
                    Toast.makeText(getApplicationContext(),"닉네임을 입력해주세요",Toast.LENGTH_SHORT);
                    return;
                }

                //Toast 버튼을 누르면
                Toast.makeText(getApplicationContext(),"입력한 닉네임은"+name+"데스",Toast.LENGTH_SHORT);
            }
        });
    }
}
