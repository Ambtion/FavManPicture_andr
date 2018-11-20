package com.lingjunhou.favmanpic_andr.netWork.request;

import com.lingjunhou.favmanpic_andr.netWork.response.FMPhotoListResponse;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface FMPhotoListRequest {

    @POST("suite/suiteList.do")
    Call<FMPhotoListResponse> request(@Query("page") int page, @Query("hot") int type);

}
