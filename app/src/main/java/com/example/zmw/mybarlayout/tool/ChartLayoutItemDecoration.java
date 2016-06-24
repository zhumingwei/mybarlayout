package com.example.zmw.mybarlayout.tool;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by ZMW on 2016/6/24.
 */
public class ChartLayoutItemDecoration extends RecyclerView.ItemDecoration {

    public ChartLayoutItemDecoration() {

    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);
    }


    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
    }

    private int middleDistanse = 10;//间距

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int count = parent.getAdapter().getItemCount();
        int viewWidth = parent.getMeasuredWidth();
        int itemwidth = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        itemwidth = view.getMeasuredWidth();
        if (count != 0) {
            if (parent.getChildLayoutPosition(view) == 0) {
                //第一个
                outRect.left=viewWidth/2-itemwidth/2;
                outRect.right=middleDistanse;
            } else if (parent.getChildLayoutPosition(view) == count - 1) {
                //最后一个
                outRect.left=middleDistanse;
                outRect.right=viewWidth/2-itemwidth/2;
            } else {
                outRect.left=middleDistanse;
                outRect.right=middleDistanse;
            }
        }
    }


}
