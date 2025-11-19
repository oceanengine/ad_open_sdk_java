package com.bytedance.ads.model;

import java.util.List;

public class QianchuanUniPromotionAdControlTaskUpdateV10Response {
    private String message;
    private Integer code;
    private Object data;
    private List<Long> failedInfos;
    private String requestId;

    // Getter and Setter methods
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public List<Long> getFailedInfos() {
        return failedInfos;
    }

    public void setFailedInfos(List<Long> failedInfos) {
        this.failedInfos = failedInfos;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}

