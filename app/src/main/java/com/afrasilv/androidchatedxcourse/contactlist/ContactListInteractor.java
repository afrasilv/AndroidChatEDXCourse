package com.afrasilv.androidchatedxcourse.contactlist;

/**
 * Created by alex on 3/07/16.
 */
public interface ContactListInteractor {
    void subscribeForContactEvents();
    void unSubscribeForContactEvents();
    void destroyContactListListener();
    void removeContact(String email);

}
