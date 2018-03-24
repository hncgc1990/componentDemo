package com.hncgc1990.component_a;

import android.util.Log;

import com.luojilab.component.componentlib.applicationlike.IApplicationLike;
import com.luojilab.component.componentlib.router.ui.UIRouter;

/**
 * Created by cgc on 18-3-24.组件中的界面路由和服务注册
 */

public class ComponentApplicationLike implements IApplicationLike {

    UIRouter mUiRouter=UIRouter.getInstance();

    @Override
    public void onCreate() {
        Log.d("chen","我被添加了");
        mUiRouter.registerUI("component");
    }

    @Override
    public void onStop() {
        Log.d("chen","我被删除了");
        mUiRouter.unregisterUI("component");
    }
}
