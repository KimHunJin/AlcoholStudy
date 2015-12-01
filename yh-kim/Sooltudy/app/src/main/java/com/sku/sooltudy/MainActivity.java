package com.sku.sooltudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {
    String userId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userId = DataUtil.getAppPreferences(getApplicationContext(),"id");

        getSupportActionBar().setTitle(userId + "의 일기장");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        // write
        if(id == R.id.mainmenu_btnWrite){
            Intent itWrite = new Intent(getApplicationContext(),WriteActivity.class);
            startActivity(itWrite);
            return true;
        }
        // sql test
        else if(id == R.id.mainmenu_btnSQL){
            Intent itSQL = new Intent(getApplicationContext(), SQLiteActivity.class);
            startActivity(itSQL);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}