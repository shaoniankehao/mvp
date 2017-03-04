package com.denis.mvp.activity;

import com.denis.mvp.R;
import com.denis.mvp.base.BaseActivity;
import com.denis.mvp.base.BasePresenter;

public class MainActivity extends BaseActivity {

    @Override
    protected int getRelayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected BasePresenter loadPresenter() {
        return null;
    }
}
