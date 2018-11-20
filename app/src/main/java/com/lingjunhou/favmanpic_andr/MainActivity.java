package com.lingjunhou.favmanpic_andr;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.lingjunhou.favmanpic_andr.netWork.FMNetWorkManager;
import com.lingjunhou.favmanpic_andr.netWork.request.FMConfigRequest;
import com.lingjunhou.favmanpic_andr.netWork.request.FMPhotoListRequest;
import com.lingjunhou.favmanpic_andr.netWork.request.FMSWitchRequest;
import com.lingjunhou.favmanpic_andr.netWork.response.FMConfigResponse;
import com.lingjunhou.favmanpic_andr.netWork.FMNetConfig;
import com.lingjunhou.favmanpic_andr.netWork.response.FMPhotoListResponse;
import com.lingjunhou.favmanpic_andr.netWork.response.FMSWitchResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FMNetWorkManager.requestGroupList(1,1,new Callback<FMPhotoListResponse>() {
                    @Override
                    public void onResponse(Call<FMPhotoListResponse> call, Response<FMPhotoListResponse> response) {
                        Log.e("test","result xxx ");
                    }

                    @Override
                    public void onFailure(Call<FMPhotoListResponse> call, Throwable t) {

                    }
                });
            }
        });
    }




}
