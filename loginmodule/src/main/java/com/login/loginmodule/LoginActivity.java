package com.login.loginmodule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.weimob.route.*;
import com.weimob.route.BuildConfig;

/**
 * Created by lenovo on 2017/6/6.
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.tv_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Route.start(LoginActivity.this, HostConst.MAIN);
                //Route.start(LoginActivity.this, HostConst.CUSTOMERSERVICE);
            }
        });
    }
}
