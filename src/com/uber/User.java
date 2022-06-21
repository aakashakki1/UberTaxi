package com.uber;

public class User {
    private String userId;
    private String emailId;
    private String name;
    private String mobileNo;
    private String location;
    private UserType user;

    public User(String userId, String emailId, String name, String mobileNo, String location, UserType user) {
        this.userId = userId;
        this.emailId = emailId;
        this.name = name;
        this.mobileNo = mobileNo;
        this.location = location;
        this.user = user;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getName() {
        return name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getLocation() {
        return location;
    }

    public UserType getUser() {
        return user;
    }
}
