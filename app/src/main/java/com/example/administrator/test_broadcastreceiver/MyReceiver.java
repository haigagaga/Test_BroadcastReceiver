package com.example.administrator.test_broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 *   接收系统广播
 *      动态接收
 *          1. 接收广播首先要先创建一个接收类MyReceiver继承Receiver，
 *              在onReceive方法中做接收处理，并在AndroidManifext.xml文件中注册广播：
 * */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "我通过动态注册接到了一个广播", Toast.LENGTH_SHORT).show();
    }
}
