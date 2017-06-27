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
import com.weimob.modularization.app.App;
import com.weimob.shopbusinessmodule.ShopBusinessFragment;

/**
 * Created by lenovo on 2017/6/7.
 */
public class WeimobApp extends App {

    @Override
    protected View initView(AppCompatActivity activity, ViewGroup rootView) {
        return LayoutInflater.from(activity).inflate(R.layout.activity_weimob, rootView);
    }

    @Override
    protected void bindData(AppCompatActivity activity, View view) {
        Fragment[] fragments = new Fragment[] {new CustomerServiceFragment(), new CusToShopFragment(), new ShopBusinessFragment()};
        int[] iconImageArray = {R.drawable.icon_main, R.drawable.icon_app, R.drawable.icon_mine};
        int[] selectedIconImageArray = {R.drawable.icon_main_selected, R.drawable.icon_app_selected, R.drawable.icon_mine_selected};
        TabContainerView tabContainerView = (TabContainerView) view.findViewById(R.id.tabcontainerView);
        tabContainerView.setAdapter(new DefaultAdapter(activity, fragments, activity.getSupportFragmentManager(),
                activity.getResources().getStringArray(R.array.titleArray),
                activity.getResources().getColor(R.color.colorPrimary), iconImageArray, selectedIconImageArray));
    }
}
