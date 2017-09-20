package com.example.levon.lockapplicaiton;

import android.app.KeyguardManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.TYPE_SYSTEM_OVERLAY);
        setContentView(R.layout.activity_main);
        disableLock();
    }


    //Disable device lock
    private void disableLock() {
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService(MainActivity.KEYGUARD_SERVICE);
        KeyguardManager.KeyguardLock lock = keyguardManager.newKeyguardLock(KEYGUARD_SERVICE);
        lock.disableKeyguard();
    }


    //Disable home long click
    @Override
    protected void onUserLeaveHint() {
        startActivity(new Intent(MainActivity.this, MainActivity.class));
        finish();
        super.onUserLeaveHint();
    }

    //disable back button functionality
    @Override
    public void onBackPressed() {

    }

}
