package com.maple.jframe.view.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;

import com.maple.jframe.R;
import com.maple.jframe.app.base.BaseViewActivity;
import com.maple.jframe.app.base.IView;
import com.maple.jframe.databinding.ActivityTestBinding;
import com.maple.jframe.vm.TestViewModel;

public class TestActivity extends BaseViewActivity<ActivityTestBinding,TestViewModel> implements IView {

    @Override
    protected int layoutResID() {
        return R.layout.activity_test;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {


    }

    @Override
    protected TestViewModel getVM() {
        return ViewModelProviders.of(this).get(TestViewModel.class);
    }
}
