package com.weimob.modularization.app;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lenovo on 2017/6/7.
 */
public abstract class App {

    /**
     *  组装
     */
    public final void assemble(AppCompatActivity activity, ViewGroup rootView) {
        bindData(activity, initView(activity, rootView));
    }

    /**
     *  初始化View
     * @param activity
     */
    protected abstract View initView(AppCompatActivity activity, ViewGroup rootView);

    /**
     *  绑定数据
     */
    protected abstract void bindData(AppCompatActivity activity, View view);


}
