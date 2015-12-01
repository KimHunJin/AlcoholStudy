package com.sku.sooltudy.aaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sku.sooltudy.R;

public class SecondActivity extends AppCompatActivity {

    EditText edit;
    Button btn;
    TextView txt;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edit = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.editButton);
        txt = (TextView)findViewById(R.id.editTextView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = edit.getText().toString().trim();
                int number;
                number = Integer.parseInt(text);
                star(number);
            }
        });

    }
    private void star(int number){
        Log.e("dd", number + "");
        for(int i=0;i<number;i++) {
            for(int j=0;j<i;j++) {
                txt.setText(txt.getText()+"*");
            }
            txt.setText(txt.getText()+"\n");
        }
    }
}
