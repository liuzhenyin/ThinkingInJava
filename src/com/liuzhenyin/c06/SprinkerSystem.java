package com.liuzhenyin.c06;

/**
 * Created by 玉玺 on 2018/11/30
 */
class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("WaterSource()");
        s = new String("Constructed");
    }

    @Override
    public String toString() {
        return s;
    }
}

public class SprinkerSystem {
    WaterSource source;
    int i;
    float f;
    private String value1, value2, value3, value4;

    public static void main(String[] args) {
        SprinkerSystem x = new SprinkerSystem();
        x.print();
    }

    void print() {
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);
        System.out.println("value4 = " + value4);
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("source = " + source);
    }
}
