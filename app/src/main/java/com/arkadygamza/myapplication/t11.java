package com.arkadygamza.myapplication;

import android.support.annotation.Nullable;

/**
 * block edit
 * cmd + shift + 8
 *
 * multiple cursors
 * shift + alt + click
 *
 * select next occurrence
 * ctrl + G
 *
 * params hints
 */

public class t11 {
    public String value1;
    public String value2;
    public String value3;
    public String value4;
    public String value5;
    public String value6;

    @Nullable
    public Integer i1;
    @Nullable
    public Integer i2;
    @Nullable
    public Integer i3;

    public t11(String value1, String value2, String value3, String value4, String value5, String value6) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;
        this.value6 = value6;
    }

    public static void main(String[] args) {
        new t11("1","2","3","4","5","6");
    }

    void f1(){
        System.out.println("1" + "0");
        System.out.println("1" + "0");
        System.out.println("1" + "0");
        System.out.println("11111" + "0");
        System.out.println("111" + "0");
        System.out.println("1111" + "0");
        System.out.println("11" + "0");
    }
}