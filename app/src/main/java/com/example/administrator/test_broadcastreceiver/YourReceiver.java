package com.example.administrator.test_broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 *      静态接收。
 *      在Manifest.xml中注册广播
 */

public class YourReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "我通过静态注册接到了一个广播", Toast.LENGTH_SHORT).show();
    }
}
