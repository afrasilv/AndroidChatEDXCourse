package com.afrasilv.androidchatedxcourse.login;

/**
 * Created by alex on 29/06/16.
 */
public interface LoginRepository {
    void signUp(String email, String password);
    void signIn(String email, String password);
    void checkSession();
}
