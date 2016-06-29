package com.afrasilv.androidchatedxcourse.login;

/**
 * Created by alex on 29/06/16.
 */
public interface LoginInteractor {
    void checkSession();
    void doSignUp(String email, String password);
    void doSignIn(String email, String password);
}
