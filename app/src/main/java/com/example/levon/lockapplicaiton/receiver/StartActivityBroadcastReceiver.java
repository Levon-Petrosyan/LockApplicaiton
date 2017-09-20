package com.example.levon.lockapplicaiton.receiver;

/**
 * Created by l.petrosyan on 23/08/2017.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.levon.lockapplicaiton.MainActivity;

public class StartActivityBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            Intent i = new Intent(context, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }
    }
}