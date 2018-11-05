package com.azi.meeting.enums;

public enum MeetingStatus {
    CANCEL("取消"),
    CREATE("创建"),
    SIGN_UP("报名"),
    SIGN_IN("签到"),
    CLOSE("结束");

    private final String title;

    MeetingStatus(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
