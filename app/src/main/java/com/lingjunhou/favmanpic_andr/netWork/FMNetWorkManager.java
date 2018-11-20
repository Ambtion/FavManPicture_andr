package com.lingjunhou.favmanpic_andr.netWork;

import com.lingjunhou.favmanpic_andr.netWork.request.FMConfigRequest;
import com.lingjunhou.favmanpic_andr.netWork.request.FMPhotoListRequest;
import com.lingjunhou.favmanpic_andr.netWork.request.FMSWitchRequest;
import com.lingjunhou.favmanpic_andr.netWork.response.FMConfigResponse;
import com.lingjunhou.favmanpic_andr.netWork.response.FMPhotoListResponse;
import com.lingjunhou.favmanpic_andr.netWork.response.FMSWitchResponse;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FMNetWorkManager {


    public static void requestSwitch(Callback<FMSWitchResponse> calllback) {

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://45.78.20.253:8888").
                addConverterFactory(GsonConverterFactory.create()).
                build();

        FMSWitchRequest request = retrofit.create(FMSWitchRequest.class);
        request.request().enqueue(calllback);
    }

    public static void requestConmonfig(Callback<FMConfigResponse> calllback) {

        FMConfigRequest request = getOneRetrofit().create(FMConfigRequest.class);
        request.request().enqueue(calllback);
    }


    public static void  requestGroupList(int page,int type,Callback<FMPhotoListResponse> callback) {
        FMPhotoListRequest request = getOneRetrofit().create(FMPhotoListRequest.class);
        request.request(page,type).enqueue(callback);

    }

    private static Retrofit  getOneRetrofit() {
        return new Retrofit.Builder().
                baseUrl(FMNetConfig.getInstance().baseUrl).
                addConverterFactory(GsonConverterFactory.create()).
                build();
    }

}
