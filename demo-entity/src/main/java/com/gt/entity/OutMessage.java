package com.gt.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/5/13.
 */
public class OutMessage {
    private String from;
    private String content;
    private Date date = new Date();

    public OutMessage(String content){
        this.content = content;

    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}