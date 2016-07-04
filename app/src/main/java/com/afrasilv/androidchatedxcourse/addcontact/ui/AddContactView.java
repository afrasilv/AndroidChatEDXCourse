package com.afrasilv.androidchatedxcourse.addcontact.ui;

public interface AddContactView {
    void showInput();
    void hideInput();
    void showProgress();
    void hideProgress();

    void contactAdded();
    void contactNotAdded();
}