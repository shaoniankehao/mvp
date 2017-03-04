package com.denis.mvp;

import android.app.Application;
import android.content.Context;

/**
 * @创建者 duanpeifeng
 * @创建时间 2017/2/22 0022
 * @描述 ${TODO}
 */

public class ProApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
