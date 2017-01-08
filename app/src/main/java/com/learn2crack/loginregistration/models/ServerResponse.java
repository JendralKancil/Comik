package com.learn2crack.loginregistration.models;

/**
 * Created by Roni on 1/5/2017.
 */
public class ServerResponse {

    private String result;
    private String message;
    private User user;

    public String getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}
