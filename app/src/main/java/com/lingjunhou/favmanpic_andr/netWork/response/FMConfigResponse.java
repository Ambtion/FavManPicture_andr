package com.lingjunhou.favmanpic_andr.netWork.response;

// baseUrl +  system/config.do
/*
 *
 * {
"data": {
"is_sex": "1",
"last_app_version": "1.0",
"sound_url_header": "http://com-pmkoo-img.oss-cn-beijing.aliyuncs.com/sound/",
"header_url_header": "http://com-pmkoo-img.oss-cn-beijing.aliyuncs.com/header/",
"user_agreement_url": "http://com-wuwei-aiss.oss-cn-beijing.aliyuncs.com/web/userAgreement.html",
"is_review": "1",
"explicitly_stated_url": "http://com-pmkoo-img.oss-cn-beijing.aliyuncs.com/web/explicitlyStated.html",
"is_appstore_pay": "0",
"app_id": "1164948370",
"picture_url_header": "https://aiss.obs.cn-north-1.myhwclouds.com/picture/",
"audio_count": "14",
"vip_agreement_url": "http://com-wuwei-aiss.oss-cn-beijing.aliyuncs.com/web/vipAgreement.html"
},
"msg": null,
"success": true
}
 * **/

public class FMConfigResponse {


    /**
     * data : {"is_sex":"1","last_app_version":"1.0","sound_url_header":"http://com-pmkoo-img.oss-cn-beijing.aliyuncs.com/sound/","header_url_header":"http://com-pmkoo-img.oss-cn-beijing.aliyuncs.com/header/","user_agreement_url":"http://com-wuwei-aiss.oss-cn-beijing.aliyuncs.com/web/userAgreement.html","is_review":"1","explicitly_stated_url":"http://com-pmkoo-img.oss-cn-beijing.aliyuncs.com/web/explicitlyStated.html","is_appstore_pay":"0","app_id":"1164948370","picture_url_header":"https://aiss.obs.cn-north-1.myhwclouds.com/picture/","audio_count":"14","vip_agreement_url":"http://com-wuwei-aiss.oss-cn-beijing.aliyuncs.com/web/vipAgreement.html"}
     * msg : null
     * success : true
     */

    private data data;
    private Object msg;
    private boolean success;

    public data getData() {
        return data;
    }

    public void setData(data data) {
        this.data = data;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class data {
        /**
         * is_sex : 1
         * last_app_version : 1.0
         * sound_url_header : http://com-pmkoo-img.oss-cn-beijing.aliyuncs.com/sound/
         * header_url_header : http://com-pmkoo-img.oss-cn-beijing.aliyuncs.com/header/
         * user_agreement_url : http://com-wuwei-aiss.oss-cn-beijing.aliyuncs.com/web/userAgreement.html
         * is_review : 1
         * explicitly_stated_url : http://com-pmkoo-img.oss-cn-beijing.aliyuncs.com/web/explicitlyStated.html
         * is_appstore_pay : 0
         * app_id : 1164948370
         * picture_url_header : https://aiss.obs.cn-north-1.myhwclouds.com/picture/
         * audio_count : 14
         * vip_agreement_url : http://com-wuwei-aiss.oss-cn-beijing.aliyuncs.com/web/vipAgreement.html
         */

        private String is_sex;
        private String last_app_version;
        private String sound_url_header;
        private String header_url_header;
        private String user_agreement_url;
        private String is_review;
        private String explicitly_stated_url;
        private String is_appstore_pay;
        private String app_id;
        private String picture_url_header;
        private String audio_count;
        private String vip_agreement_url;

        public String getIs_sex() {
            return is_sex;
        }

        public void setIs_sex(String is_sex) {
            this.is_sex = is_sex;
        }

        public String getLast_app_version() {
            return last_app_version;
        }

        public void setLast_app_version(String last_app_version) {
            this.last_app_version = last_app_version;
        }

        public String getSound_url_header() {
            return sound_url_header;
        }

        public void setSound_url_header(String sound_url_header) {
            this.sound_url_header = sound_url_header;
        }

        public String getHeader_url_header() {
            return header_url_header;
        }

        public void setHeader_url_header(String header_url_header) {
            this.header_url_header = header_url_header;
        }

        public String getUser_agreement_url() {
            return user_agreement_url;
        }

        public void setUser_agreement_url(String user_agreement_url) {
            this.user_agreement_url = user_agreement_url;
        }

        public String getIs_review() {
            return is_review;
        }

        public void setIs_review(String is_review) {
            this.is_review = is_review;
        }

        public String getExplicitly_stated_url() {
            return explicitly_stated_url;
        }

        public void setExplicitly_stated_url(String explicitly_stated_url) {
            this.explicitly_stated_url = explicitly_stated_url;
        }

        public String getIs_appstore_pay() {
            return is_appstore_pay;
        }

        public void setIs_appstore_pay(String is_appstore_pay) {
            this.is_appstore_pay = is_appstore_pay;
        }

        public String getApp_id() {
            return app_id;
        }

        public void setApp_id(String app_id) {
            this.app_id = app_id;
        }

        public String getPicture_url_header() {
            return picture_url_header;
        }

        public void setPicture_url_header(String picture_url_header) {
            this.picture_url_header = picture_url_header;
        }

        public String getAudio_count() {
            return audio_count;
        }

        public void setAudio_count(String audio_count) {
            this.audio_count = audio_count;
        }

        public String getVip_agreement_url() {
            return vip_agreement_url;
        }

        public void setVip_agreement_url(String vip_agreement_url) {
            this.vip_agreement_url = vip_agreement_url;
        }
    }
}
