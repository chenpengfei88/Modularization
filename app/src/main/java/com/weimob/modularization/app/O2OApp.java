package com.weimob.modularization.app;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fe.library.TabContainerView;
import com.fe.library.adapter.DefaultAdapter;
import com.weimob.customerservicemodule.CustomerServiceFragment;
import com.weimob.custoshopmodule.CusToShopFragment;
import com.weimob.modularization.R;

/**
 * Created by lenovo on 2017/6/7.
 */
public class O2OApp extends App {

    @Override
    protected View initView(AppCompatActivity activity, ViewGroup rootView) {
        return LayoutInflater.from(activity).inflate(R.layout.activity_weimob, rootView);
    }

    @Override
    protected void bindData(AppCompatActivity activity, View view) {
        Fragment[] fragments = new Fragment[] {new CustomerServiceFragment(), new CusToShopFragment()};
        int[] iconImageArray = {R.drawable.icon_main, R.drawable.icon_app};
        int[] selectedIconImageArray = {R.drawable.icon_main_selected, R.drawable.icon_app_selected};
        TabContainerView tabContainerView = (TabContainerView) view.findViewById(R.id.tabcontainerView);
        tabContainerView.setAdapter(new DefaultAdapter(activity, fragments, activity.getSupportFragmentManager(),
                activity.getResources().getStringArray(R.array.titleo2oArray),
                activity.getResources().getColor(R.color.colorPrimary), iconImageArray, selectedIconImageArray));
    }
}
