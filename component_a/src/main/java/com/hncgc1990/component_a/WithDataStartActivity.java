package com.hncgc1990.component_a;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.luojilab.component.componentlib.service.AutowiredService;
import com.luojilab.router.facade.annotation.Autowired;
import com.luojilab.router.facade.annotation.RouteNode;

@RouteNode(path = "/data",desc = "需要传入数据")
public class WithDataStartActivity extends AppCompatActivity {

    @Autowired
    String data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_data_start);
        //用于数据的注入
        AutowiredService.Factory.getInstance().create().autowire(this);
       if(data!=null){
           ((TextView)findViewById(R.id.tv_name)).setText(data);
       }

    }
}
