package com.azi.meeting.model;


import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "meetingLog")
public class MeetingLog implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String cid;
    private String content;//日志内容
    private String createMan;//创建人
    private String createDatetime;//创建时间

    public MeetingLog() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }

    public String getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime;
    }
}