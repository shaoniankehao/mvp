package com.denis.mvp.mvp;

/**
 * @创建者 duanp
 * @创建时间 2017/2/24 0024
 * @描述 ${TODO}
 */

public interface IPresenter<V extends IView> {

    void attachView(V view);

    void detachView();

    V getView();
}
