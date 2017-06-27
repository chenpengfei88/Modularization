package com.weimob.modularization;

import android.app.Application;

import com.weimob.modularization.app.OtherApp;
import com.weimob.modularization.app.WeimobApp;


/**
 * Created by lenovo on 2017/6/7.
 */
public class MApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AppProxy.getInstance().init(new WeimobApp());
    }
}
