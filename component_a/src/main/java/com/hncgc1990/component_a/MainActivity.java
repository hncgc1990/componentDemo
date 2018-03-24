package com.hncgc1990.component_a;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.luojilab.router.facade.annotation.RouteNode;


@RouteNode(path = "/main",desc = "组件A")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component);
    }
}
