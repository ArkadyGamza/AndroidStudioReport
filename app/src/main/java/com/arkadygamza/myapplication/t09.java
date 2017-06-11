package com.arkadygamza.myapplication;

import android.util.Log;

/**
 * to paste from history
 * cmd + shift + v
 */

public class t09 {
    public static final String TAG = "TAG";

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 1) {
                Log.d(TAG, "one");
            }
            else {
                Log.d(TAG, "not one");
            }
        }
    }

    public String f2(){
        return "String";
    }

    public int f1(){
        return 0;
    }
}
