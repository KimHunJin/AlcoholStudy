package com.sku.sooltudy.firstapp;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.sku.sooltudy.R;

import java.util.ArrayList;

public class DiaryListActivity extends AppCompatActivity {

    TextView txtDiaryListName;
    ListView listDiary;
    SQLite sqLite;
    ArrayList<ListViewItem> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_list);
        txtDiaryListName = (TextView)findViewById(R.id.txtDiaryName);
        txtDiaryListName.setText("다이어리 리스트");
        listDiary = (ListView)findViewById(R.id.diaryList);

        sqLite = new SQLite(getApplicationContext(),"diary.db", null, 1);
        Cursor cursor = sqLite.select("select `name` from `diary`");
        data=new ArrayList<>();
        String str = "";
        while (cursor.moveToNext()) {
            str = cursor.getString(0);
            Log.e("test",str);
            ListViewItem name = new ListViewItem(str);
            data.add(name);
        }

        ListAdapter adapter = new ListAdapter(this, R.layout.item, data);
        listDiary.setAdapter(adapter);

        listDiary.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = data.get(position).getName();
                Intent it = new Intent(getApplication(),ShowDiaryActivity.class);
                it.putExtra("name",name);
                startActivity(it);
            }
        });
    }
}
