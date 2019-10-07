package com.marocrafts.designpatter.strategy;

public class AuthWithFaceBook implements IAuthWith {

    public String login(String auth) {
        return "You're authenticated with FaceBook with the following credential : ".concat(auth);
    }
}
