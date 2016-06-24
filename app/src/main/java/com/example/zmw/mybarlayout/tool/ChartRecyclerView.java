package com.example.zmw.mybarlayout.tool;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;

/**
 * Created by ZMW on 2016/6/24.
 */
public class ChartRecyclerView extends RecyclerView{

    public ChartRecyclerView(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas c) {
        super.onDraw(c);
        if(getAdapter()!=null){
            Adapter adpter=getAdapter();
        }
    }
}
