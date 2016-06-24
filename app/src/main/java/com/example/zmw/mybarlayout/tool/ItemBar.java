package com.example.zmw.mybarlayout.tool;

/**
 * Created by ZMW on 2016/6/24.
 */
public class ItemBar {
    private int color;
    private int valueBar;//下面的柱状图
    private int valuePoint;//上面的点
    public static final int MAX_VALUE =20;//假定value数据上限为20
    private String time;
    private String name;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getValueBar() {
        return valueBar;
    }

    public void setValueBar(int valueBar) {
        this.valueBar = valueBar;
    }

    public int getValuePoint() {
        return valuePoint;
    }

    public void setValuePoint(int valuePoint) {
        this.valuePoint = valuePoint;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
