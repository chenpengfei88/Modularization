package com.weimob.modularization.app;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.weimob.modularization.R;

/**
 * Created by lenovo on 2017/6/7.
 */
public class OtherApp extends App {

    @Override
    protected View initView(AppCompatActivity activity, ViewGroup rootView) {
        return LayoutInflater.from(activity).inflate(R.layout.activity_other, rootView);
    }

    @Override
    protected void bindData(AppCompatActivity activity, View view) {

    }
}
