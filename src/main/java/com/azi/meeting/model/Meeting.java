package com.azi.meeting.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;


@Document(collection = "meeting")
public class Meeting implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String cid;
    private String name;//会议名称
    private String status;//会议状态MeetingStatus
    private Integer signUpLimit;//报名人数限制
    private String signUpMode;//报名模式SignUpMode
    private Date signUpCloseDatetime;//报名结束时间
    private Date signInCloseDatetime;//签到结束时间
    private Date meetingCloseDatetime;//会议结束时间
    private String address;//会议场地
    private String contact;//联系人
    private String hostUnit;//举办单位
    private String guideUnit;//指导单位
    private String description;//会议简介
    private String createMan;//创建人
    private String createDatetime;//创建时间

    private List<MeetingLog> meetingLogs;//会议日志

    public Meeting() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSignUpLimit() {
        return signUpLimit;
    }

    public void setSignUpLimit(Integer signUpLimit) {
        this.signUpLimit = signUpLimit;
    }

    public String getSignUpMode() {
        return signUpMode;
    }

    public void setSignUpMode(String signUpMode) {
        this.signUpMode = signUpMode;
    }

    public Date getMeetingCloseDatetime() {
        return meetingCloseDatetime;
    }

    public void setMeetingCloseDatetime(Date meetingCloseDatetime) {
        this.meetingCloseDatetime = meetingCloseDatetime;
    }

    public Date getSignUpCloseDatetime() {
        return signUpCloseDatetime;
    }

    public void setSignUpCloseDatetime(Date signUpCloseDatetime) {
        this.signUpCloseDatetime = signUpCloseDatetime;
    }

    public Date getSignInCloseDatetime() {
        return signInCloseDatetime;
    }

    public void setSignInCloseDatetime(Date signInCloseDatetime) {
        this.signInCloseDatetime = signInCloseDatetime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getHostUnit() {
        return hostUnit;
    }

    public void setHostUnit(String hostUnit) {
        this.hostUnit = hostUnit;
    }

    public String getGuideUnit() {
        return guideUnit;
    }

    public void setGuideUnit(String guideUnit) {
        this.guideUnit = guideUnit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<MeetingLog> getMeetingLogs() {
        return meetingLogs;
    }

    public void setMeetingLogs(List<MeetingLog> meetingLogs) {
        this.meetingLogs = meetingLogs;
    }
}