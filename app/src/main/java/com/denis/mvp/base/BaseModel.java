package com.denis.mvp.base;

import com.walkinthecold.http.Http;
import com.walkinthecold.http.HttpService;
import com.walkinthecold.mvp.IModel;

/**
 * @创建者 duanp
 * @创建时间 2017/2/24 0024
 * @描述 ${TODO}
 */

public class BaseModel implements IModel {
    protected static HttpService httpService;

    static {
        httpService = Http.getHttpService();
    }
}
