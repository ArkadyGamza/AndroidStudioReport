package com.arkadygamza.myapplication;

import android.util.Log;

/**
 * to move line/selection
 * alt + shift + up
 * alt + shift + down
 *
 * to move element
 *
 * cmd + shift + up
 * cmd + shift + down
 */

public class t05 {

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
