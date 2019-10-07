package com.marocrafts.designpatter.strategy;

public class AuthWithGitHub implements IAuthWith {

    public String login(String auth) {
        return "You're authenticated with GitHub with the following credential : ".concat(auth);
    }
}
