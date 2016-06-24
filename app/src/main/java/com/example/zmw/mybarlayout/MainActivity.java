package com.example.zmw.mybarlayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.zmw.mybarlayout.tool.ChartLayoutHelper;
import com.example.zmw.mybarlayout.tool.ItemBar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RecyclerView chartLayout;
    private ChartLayoutHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chartLayout = (RecyclerView) findViewById(R.id.recyclerview);
        helper = new ChartLayoutHelper(MainActivity.this, chartLayout);
        List<ItemBar> data = getData();
        helper.ininData(data);
    }


    public List<ItemBar> getData() {
        List<ItemBar> data = new ArrayList<ItemBar>();
        Random random=new Random();
        for (int i = 0; i < 20; i++) {
            ItemBar bar=new ItemBar();
            bar.setColor(Color.parseColor("#02ffec"));
            bar.setName("bar"+i);
            bar.setTime(times[i]);
            int value=random.nextInt(12)+5;
            bar.setValueBar(value);
            bar.setValuePoint(value+1);
            data.add(bar);
        }
        return data;
    }

    private String[] times={"05/27","05/28","05/29","05/30","05/31",
            "06/01","06/02","06/03","06/04","06/05","06/06","06/07","06/08","06/09","06/10","06/11","06/12","06/13","06/14","06/15"};


}
