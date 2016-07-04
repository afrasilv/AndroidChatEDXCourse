package com.afrasilv.androidchatedxcourse.contactlist.ui;

import com.afrasilv.androidchatedxcourse.entities.User;

/**
 * Created by alex on 3/07/16.
 */
public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
