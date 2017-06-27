package com.weimob.modularization;

import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.weimob.modularization.app.App;

/**
 * Created by lenovo on 2017/6/7.
 */
public class AppProxy {

    private static AppProxy mInstance;

    private App mApp;

    public static AppProxy getInstance() {
        if (mInstance == null) {
            synchronized (AppProxy.class) {
                if (mInstance == null) {
                    mInstance = new AppProxy();
                }
            }
        }
        return mInstance;
    }

    public void init(App app) {
        mApp = app;
    }

    public void assemble(AppCompatActivity activity, ViewGroup rootView) {
        mApp.assemble(activity, rootView);
    }

    private AppProxy() {
    }
}
