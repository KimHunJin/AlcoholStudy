/**
 *
 */
package com.sku.sooltudy;

/**
 *
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 *
 */
public class SecondActivity extends Activity {

    EditText edt;
    Button btn;
    TextView txt;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edt = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.editButton);
        txt = (TextView)findViewById(R.id.editTextView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = edt.getText().toString().trim();
                int num;
                num = Integer.parseInt(text);

            }
        });

    }


    /**
     *
     * @param num
     */
    private  void Star(int num){
        for (int i = 0; i<num;i++){
            for (int j = 0; j<i;j++){
                txt.setText(txt.getText()+"*");
            }
            txt.setText(txt.getText()+"*");
        }
    }
}
