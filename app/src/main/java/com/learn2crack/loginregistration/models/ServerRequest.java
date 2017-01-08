package com.learn2crack.loginregistration.models;

/**
 * Created by Roni on 1/5/2017.
 */
public class ServerRequest {

    private String operation;
    private User user;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
