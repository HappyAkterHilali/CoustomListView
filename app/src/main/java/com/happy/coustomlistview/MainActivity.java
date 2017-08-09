package com.happy.coustomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView customList;
    String countryList[]={"Bangladesh","America","Australia","China","India","New Zealand","Portugle"};
    int flag[]={R.drawable.bd,R.drawable.america,R.drawable.australia,R.drawable.china,R.drawable.india,R.drawable.new_zealand,R.drawable.portugle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customList=(ListView)findViewById(R.id.listview);

        CustomListadapter listadapter=new CustomListadapter(getApplicationContext(),countryList,flag);
        customList.setAdapter(listadapter);

    }
}
