package com.afrasilv.androidchatedxcourse.addcontact;

import com.afrasilv.androidchatedxcourse.addcontact.events.AddContactEvent;

public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}