package com.arkadygamza.myapplication;

import android.util.Log;

/**
 * to select scope
 * alt + up
 * alt + down
 *
 * introduce function
 * alt + cmd + M

 * inline function
 * alt + cmd + N
 *
 * introduce constant
 * alt + cmd + C
 */

public class t04 {

    public static final String TAG = "TAG";

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 1) {
                Log.d(TAG, "one");
            }
        }
    }

}
