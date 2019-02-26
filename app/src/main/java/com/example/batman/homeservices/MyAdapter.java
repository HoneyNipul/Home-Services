package com.example.batman.homeservices;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BATMAN on 6/15/2015.
 */
public class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(Context context, String[] value) {
        super(context,R.layout.image_layout, value);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View theview =  theInflater.inflate(R.layout.image_layout,parent,false);
        String sevices = getItem(position);
        TextView tv = (TextView) theview.findViewById(R.id.textview1);
        tv.setText(sevices);
        ImageView iv = (ImageView)  theview.findViewById(R.id.imageView1);
        iv.setImageResource(R.drawable.shiv);
        return theview;
    }
}
