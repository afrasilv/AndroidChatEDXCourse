package com.afrasilv.androidchatedxcourse.login;

import com.afrasilv.androidchatedxcourse.login.events.LoginEvent;

/**
 * Created by alex on 29/06/16.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
    void onEventMainThread(LoginEvent event);
}
