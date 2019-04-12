package com.maple.jframe.app.base;

import android.arch.lifecycle.ViewModel;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * author: gaogq
 * time: 2019/4/12 10:37
 * description:
 */
public abstract class BaseViewModel extends ViewModel {
    private CompositeDisposable mDisposables = new CompositeDisposable();

    public void addDisposable(Disposable disposable) {
        mDisposables.add(disposable);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (!mDisposables.isDisposed()) {
            mDisposables.dispose();
        }
    }
}
