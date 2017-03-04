package com.denis.mvp.util;

import android.util.Log;


/**
 * Created by gaosheng on 2016/7/29.
 */

public class LogUtils {

    //public static final boolean isDebug = BuildConfig.DEBUG;
    public static final boolean isDebug = true;

    /**
     * 打印一个debug等级的 log
     */
    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg);
        }
    }

    /**
     * 打印一个debug等级的 log
     */
    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(tag, msg);
        }
    }

    /**
     * 打印一个debug等级的 log
     */
    public static void e(Class cls, String msg) {
        if (isDebug) {
            Log.e(cls.getSimpleName(), msg);
        }
    }


}
