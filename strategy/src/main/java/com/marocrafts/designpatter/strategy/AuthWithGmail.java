package com.marocrafts.designpatter.strategy;

public class AuthWithGmail implements IAuthWith {

    public String login(String auth) {
        return "You're authenticated with Gmail with the following credential : ".concat(auth);
    }
}
