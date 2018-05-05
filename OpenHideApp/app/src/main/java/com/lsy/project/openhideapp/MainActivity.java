package com.lsy.project.openhideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOpen = (Button) findViewById(R.id.btn_open);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO： 这种方式容易遭到拦截
//                // 通过intent启动app
//                //创建一个隐式的 Intent 对象，方法四：Date 数据
//                Intent intent = new Intent();
//                Uri uri = Uri.parse("content://com.lsy.target.hideapp：8080");
//                //注：setData、setDataAndType、setType 这三种方法只能单独使用，不可共用
//                //单独以 setData 方法设置 URI
//                //intent.setData(uri);
//                //单独以 seType 方法设置 Type
//                //intent.setType("text/plain");
//                //上面分步骤设置是错误的，要么以 setDataAndType 方法设置 URI 及 mime type
//                intent.setDataAndType(uri, "text/plain");
//                startActivity(intent);

                //创建一个隐式的 Intent 对象：Category 类别
                Intent intent = new Intent();
                intent.setAction("customer_action_here");
                //添加与清单中相同的自定义category
                intent.addCategory("customer_category_here");
                startActivity(intent);
            }
        });
    }
}
