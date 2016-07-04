package com.afrasilv.androidchatedxcourse.contactlist;

import com.afrasilv.androidchatedxcourse.contactlist.events.ContactListEvent;

/**
 * Created by alex on 3/07/16.
 */
public interface ContactListPresenter {
    void onCreate();
    void onDestroy();
    void onPause();
    void onResume();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);
}
