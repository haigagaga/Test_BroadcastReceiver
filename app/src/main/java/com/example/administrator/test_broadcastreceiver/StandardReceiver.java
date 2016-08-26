package com.example.administrator.test_broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/8/26.
 */

public class StandardReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "我接收到了一个标准广播（无序）", Toast.LENGTH_SHORT).show();
    }
}
