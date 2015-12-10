package com.sku.sooltudy.firstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sku.sooltudy.R;

import java.util.ArrayList;

/**
 * Created by HunJin on 2015-12-11.
 */
public class ListAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<ListViewItem> data;
    private int layout;

    public ListAdapter(Context context, int layout, ArrayList<ListViewItem> data) {
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
        this.layout = layout;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position).getName();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            convertView = inflater.inflate(layout, parent, false);
        }
        ListViewItem listViewItem = data.get(position);
        TextView name=(TextView)convertView.findViewById(R.id.txtListDiaryName);
        name.setText(listViewItem.getName());
        return convertView;
    }
}
