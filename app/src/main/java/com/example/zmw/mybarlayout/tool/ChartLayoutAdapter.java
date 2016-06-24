package com.example.zmw.mybarlayout.tool;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zmw.mybarlayout.R;

import java.util.List;

/**
 * Created by ZMW on 2016/6/24.
 */
public class ChartLayoutAdapter extends RecyclerView.Adapter<ChartLayoutAdapter.ChartViewHolder> {

    Activity activity;
    List<ItemBar> data;
    int contentHeight;

    public ChartLayoutAdapter(Activity activity, List<ItemBar> data) {
        this.activity = activity;
        this.data = data;
        View view = LayoutInflater.from(activity).inflate(R.layout.item_adapter_chart, null);
        view.measure(0,0);
        contentHeight = view.findViewById(R.id.chart_content_layout).getMeasuredHeight();
        debug("contentHeight==" + contentHeight);
    }

    @Override
    public ChartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item_adapter_chart, null);
        return new ChartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ChartViewHolder holder, int position) {
        ItemBar itemBar = data.get(position);
        holder.tvTime.setText(itemBar.getTime());
        holder.vPoint.setTranslationY(-itemBar.getValuePoint()*contentHeight/ItemBar.MAX_VALUE);
        holder.vBar.setTranslationY(contentHeight-itemBar.getValuePoint()*contentHeight/ItemBar.MAX_VALUE);
        holder.vBar.setBackgroundColor(itemBar.getColor());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ChartViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTime;
        private View vPoint, vBar;

        public ChartViewHolder(View itemView) {
            super(itemView);
            tvTime = (TextView) itemView.findViewById(R.id.chart_time);
            vBar = itemView.findViewById(R.id.chart_bar);
            vPoint = itemView.findViewById(R.id.chart_point);
        }
    }

    private void debug(String s) {
        Log.d("tag", s);
    }

}
