package com.maple.jframe.app.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * author: gaogq
 * time: 2019/4/12 10:29
 * description:
 */
public abstract class BaseActivity<DB extends ViewDataBinding> extends AppCompatActivity {
    protected abstract int layoutResID();
    protected abstract void initData(Bundle savedInstanceState);

    /**
     * 初始化DataBinding
     */
    protected DB initDataBinding(@LayoutRes int layoutResID) {
        return DataBindingUtil.setContentView(this, layoutResID);
    }

    protected DB db;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = initDataBinding(layoutResID());
        initData(savedInstanceState);
    }
}
