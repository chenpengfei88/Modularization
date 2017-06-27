package com.weimob.route;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by lenovo on 2017/6/6.
 */
public class Route {

    public static void start(Activity activity, String host) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("route://" + host));
        activity.startActivity(intent);
    }
}
