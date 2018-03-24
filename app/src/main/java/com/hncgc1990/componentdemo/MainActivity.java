package com.hncgc1990.componentdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.luojilab.component.componentlib.router.ui.UIRouter;
import com.luojilab.router.facade.annotation.RouteNode;

@RouteNode(path ="/home",desc = "首页")
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        AutowiredService.Factory.getInstance().create().autowire(this);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_one).setOnClickListener(this);
        findViewById(R.id.btn_two).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_one://跳转到组件A中的无数据activity
                goToActivity();
                break;
            case R.id.btn_two://跳转到组件A中的有数据activity
                goToActivityWithData();
                break;
                default:
                    break;
        }
    }



    private void goToActivity() {

//        boolean b1 = UIRouter.getInstance().verifyUri(Uri.parse("DDComp://app/home"));
//        boolean b2 = UIRouter.getInstance().verifyUri(Uri.parse("DDComp://component/main"));
//        Log.d("chen",b+"..."+b1+"____"+b2);


        UIRouter.getInstance().openUri(this, "hncgc1990://component/main", null);


    }
    private void goToActivityWithData() {

        Bundle bundle=new Bundle();
        bundle.putString("data","Hello Data");
        UIRouter.getInstance().openUri(this,"hncgc1990://component/data",bundle);

    }

}
