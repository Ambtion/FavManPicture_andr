package com.lingjunhou.favmanpic_andr.netWork;

import com.lingjunhou.favmanpic_andr.netWork.response.FMConfigResponse;

public class FMNetConfig {

    private static class Holder {
        private static final FMNetConfig instance = new FMNetConfig();
    }
    public static FMNetConfig  getInstance() {
        return Holder.instance;
    }

    public String baseUrl = "http://api.pmkoo.cn/aiss/";

    // 返回配置数据
    public  FMConfigResponse response;


}
