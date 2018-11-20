package com.lingjunhou.favmanpic_andr.netWork.request;

import com.lingjunhou.favmanpic_andr.netWork.response.FMSWitchResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FMSWitchRequest {

    @GET("favpicture/config")
    Call<FMSWitchResponse> request();
}
