package com.lingjunhou.favmanpic_andr.launch;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;

import com.lingjunhou.favmanpic_andr.MainActivity;

public class WelcomeScreen extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        delayHandler.sendEmptyMessageDelayed(1,1000);
    }

    private void junmpToMainActivity() {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }


    // start After delay 2 sec
    private int defalutSecond = 2;
    private  final Handler delayHandler = new Handler() {
        public  void  handleMessage(Message msg) {
            defalutSecond--;
            if (defalutSecond == 0) {
                junmpToMainActivity();
            } else {
                delayHandler.sendEmptyMessageDelayed(1,1000);
            }
        }
    };
}


