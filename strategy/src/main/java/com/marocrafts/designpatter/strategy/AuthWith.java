package com.marocrafts.designpatter.strategy;

public class AuthWith {

    public AuthWith() {
    }

    IAuthWith iAuthWith;

    public void setAuthStrategy(IAuthWith auth) {
        this.iAuthWith = auth;
    }

    public String login(String auth) {
        return iAuthWith.login(auth);
    }
}
