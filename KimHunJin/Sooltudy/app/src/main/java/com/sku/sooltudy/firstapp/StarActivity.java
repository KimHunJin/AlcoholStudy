package com.sku.sooltudy.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.sku.sooltudy.R;

public class StarActivity extends AppCompatActivity {

    Button btnShowStar;
    EditText edtStarNumber;
    TextView txtStarResult, txtDiaryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star);

        btnShowStar = (Button)findViewById(R.id.btnShowStar);
        edtStarNumber = (EditText)findViewById(R.id.edtStarNumber);
        txtStarResult = (TextView)findViewById(R.id.txtStarResult);
        txtDiaryName = (TextView)findViewById(R.id.txtDiaryName);

        txtDiaryName.setText("별찍기");

        btnShowStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtStarResult.setText("");
                if(edtStarNumber.getText().equals("")) {
                    Toast.makeText(getApplicationContext(),"Input the Number", Toast.LENGTH_SHORT).show();
                } else {
                    makeStar(edtStarNumber.getText().toString());
                }
            }
        });
    }

    private void makeStar(String number) {
        int mNumber = Integer.parseInt(number);
        for(int i=0;i<mNumber;i++) {
            for(int j=0;j<=i;j++) {
                txtStarResult.setText(txtStarResult.getText()+"*");
            }
            txtStarResult.setText(txtStarResult.getText()+"\n");
        }
    }
}
