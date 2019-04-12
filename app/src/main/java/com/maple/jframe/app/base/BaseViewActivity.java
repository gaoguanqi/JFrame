package com.maple.jframe.app.base;

import android.databinding.ViewDataBinding;

/**
 * author: gaogq
 * time: 2019/4/12 10:32
 * description:
 */
public abstract class BaseViewActivity<DB extends ViewDataBinding,VM extends BaseViewModel> extends BaseActivity<DB> implements IView {

    protected abstract VM getVM();

    protected VM vm;

    @Override
    protected DB initDataBinding(int layoutResID) {
        DB db = super.initDataBinding(layoutResID);
        vm = getVM();
        return db;
    }



}
