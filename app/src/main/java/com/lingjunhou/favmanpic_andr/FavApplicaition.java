package com.lingjunhou.favmanpic_andr;

import android.app.Application;
import android.content.Context;


public class FavApplicaition extends Application {

    private static Context mcontext;

    @Override
    public void onCreate() {
        super.onCreate();
        mcontext = getApplicationContext();
    }

    public static final Context getMcontext() {
        return mcontext;
    }

}
