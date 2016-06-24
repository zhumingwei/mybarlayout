package com.example.zmw.mybarlayout.tool;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Created by ZMW on 2016/6/24.
 */
public class ChartLayoutHelper {
    Activity context;
    RecyclerView.LayoutManager layoutManager;
    private RecyclerView chartLayout;
    RecyclerView.Adapter adapter;
    public ChartLayoutHelper(Activity activity,RecyclerView chartLayout){
        this.context =activity;
        this.chartLayout=chartLayout;
        initChartLayout();
    }

    public void initChartLayout(){
        layoutManager=new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
        chartLayout.setLayoutManager(layoutManager);
        chartLayout.addItemDecoration(new ChartLayoutItemDecoration());
    }

    public void ininData(List<ItemBar> data){
        adapter=new ChartLayoutAdapter(context,data);
        chartLayout.setAdapter(adapter);
    }
}
