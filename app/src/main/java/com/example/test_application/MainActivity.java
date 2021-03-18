package com.example.test_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private ListView mListview;
private String[] names={"m1","m2","m3","m4"};
private  int [] images={R.drawable.m1,R.drawable.m2,
        R.drawable.m3,R.drawable.m4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListview=findViewById(R.id.listview);
        MyAdapter adapter = new MyAdapter();
        mListview.setAdapter(adapter);
    }
    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView=getLayoutInflater().inflate(R.layout.card,parent,false);
           ImageView imageView=convertView.findViewById(R.id.imageview);
           TextView textView=convertView.findViewById(R.id.textview);
            textView.setText(names[position]);
            imageView.setImageResource(images[position]);
            return convertView;
        }
    }
}