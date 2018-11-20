package com.lingjunhou.favmanpic_andr;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import retrofit2.http.Url;

import static android.content.ContentValues.TAG;


public class FavApplicaition extends Application {

    private static Context mcontext;

    public FavApplicaition() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mcontext = getApplicationContext();
    }

    public static final Context getMcontext() {
        return mcontext;
    }


    private boolean getSWithch () {

            try {

                String path = "http://45.78.20.253:8888/favpicture/config";
                URL url = new URL(path);
                HttpURLConnection connection = (HttpURLConnection)url.openConnection();

                connection.setRequestMethod("GET");
                connection.addRequestProperty("Connection", "Keep-Alive");
                connection.connect();


                if (connection.getResponseCode() == 200) {
                    String result = streamToString(connection.getInputStream());
                    Log.e(TAG,"result = " + result);
                }

            } catch (Exception e) {
                Log.e(TAG,"result = " + e.toString());
            }
            return false;
    }

    private String streamToString(InputStream is) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            baos.close();
            is.close();
            byte[] byteArray = baos.toByteArray();
            return new String(byteArray);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return null;
        }
    }
}
