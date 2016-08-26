package com.example.administrator.test_broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * 一种异步机制，采用了订阅-发布机制
 * 代码注册为非常驻型   manifest中注册为常驻型
 * 标准广播（无序广播） 和 有序广播
 */


public class MainActivity extends AppCompatActivity {

    MyReceiver receiver = new MyReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //注册广播
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(receiver, filter);
    }


    //接受标准广播
    public void send_Broadcast(View view) {
        Intent intent = new Intent();
        intent.setAction("ant.receiver");
        //发送
        sendBroadcast(intent);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }
}
