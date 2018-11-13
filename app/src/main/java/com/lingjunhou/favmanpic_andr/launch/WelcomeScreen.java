package com.lingjunhou.favmanpic_andr.launch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.lingjunhou.favmanpic_andr.MainActivity;

public class WelcomeScreen extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    private void junmpToMainActivity() {
        Intent intent = new Intent(MainActivity.class);

    }

}
