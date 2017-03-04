package com.denis.mvp.util;

import android.annotation.TargetApi;
import android.os.Build;

import java.util.HashMap;
import java.util.Set;

import rx.Subscription;

/**
 * Created by duanpeifeng on 2017/2/16 0016.
 * 取消请求，维护rxjava的订阅池
 */
public class RxApiManager {
    private static RxApiManager sIntance;

    private HashMap<Object, Subscription> mHashMap;

    private RxApiManager() {
        mHashMap = new HashMap<>();
    }

    public static RxApiManager getInstance() {
        if (sIntance == null) {
            synchronized (RxApiManager.class) {
                if (sIntance == null) {
                    sIntance = new RxApiManager();
                }
            }
        }
        return sIntance;
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void add(Object obj, Subscription subscription) {
        LogUtils.e(getClass(), obj + "---" + subscription);
        mHashMap.put(obj, subscription);
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void remove(Object obj) {
        mHashMap.remove(obj);
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void removeAll() {
        if (!mHashMap.isEmpty()) {
            mHashMap.clear();
        }
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void cancel(Object tag) {
        if (mHashMap.isEmpty()) {
            return;
        }

        if (mHashMap.get(tag) == null) {
            return;
        }

        if (!mHashMap.get(tag).isUnsubscribed()) {
            mHashMap.get(tag).unsubscribe();
            mHashMap.remove(tag);
        }
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public void cancelAll() {
        if (mHashMap.isEmpty()) {
            return;
        }

        Set<Object> keys = mHashMap.keySet();
        for (Object key : keys) {
            cancel(key);
        }
    }
}
