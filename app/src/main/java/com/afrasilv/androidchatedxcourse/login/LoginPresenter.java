package com.afrasilv.androidchatedxcourse.login;

/**
 * Created by alex on 29/06/16.
 */
public interface LoginPresenter {
    void onDestroy();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
}
