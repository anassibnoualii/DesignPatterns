package com.marocrafts.designpatter.strategy;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AuthWithTest {

    private AuthWith authWith;

    @Before
    public void setUp() {
        authWith = new AuthWith();
    }

    @Test
    public void authWithFacebook() {
        authWith.setAuthStrategy(new AuthWithFaceBook());
        Assert.assertEquals("You're authenticated with FaceBook with the following credential : Anass", authWith.login("Anass"));
    }

    @Test
    public void authWithGmail() {
        authWith.setAuthStrategy(new AuthWithGmail());
        Assert.assertEquals("You're authenticated with Gmail with the following credential : Anass", authWith.login("Anass"));

    }

    @Test
    public void authWithGitHub() {
        authWith.setAuthStrategy(new AuthWithGitHub());
        Assert.assertEquals("You're authenticated with GitHub with the following credential : Anass", authWith.login("Anass"));

    }
}
