package com.azi.meeting.enums;

public enum SignUpMode {
    FIRST_COME("先到先得"),
    SELECT("择优选择"),
    SIGN_UP_LIST("报名名单");

    private final String title;

    SignUpMode(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
