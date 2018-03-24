package com.hncgc1990.componentdemo;

import android.app.Application;

import com.luojilab.component.componentlib.router.ui.UIRouter;

/**
 * Created by cgc on 18-3-24.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //注册uirouter
        UIRouter.getInstance().registerUI("app");

    }
}
