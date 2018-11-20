package com.lingjunhou.favmanpic_andr.netWork.request;

import com.lingjunhou.favmanpic_andr.netWork.response.FMConfigResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;

public interface FMConfigRequest {

    @POST("system/config.do")
    Call<FMConfigResponse> request();

}





