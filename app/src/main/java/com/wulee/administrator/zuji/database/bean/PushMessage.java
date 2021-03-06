package com.wulee.administrator.zuji.database.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import java.io.Serializable;

/**
 * Entity mapped to table "PUSH_MESSAGE_TABLE".
 */
public class PushMessage implements Serializable{
    public static final String MSG_TYPE_LOCATION = "location";
    public static final String MSG_TYPE_SYSTEM = "system";

    private String type;
    private String content;
    private Long time;

    public PushMessage() {
    }

    public PushMessage(String type, String content, Long time) {
        this.type = type;
        this.content = content;
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

}
