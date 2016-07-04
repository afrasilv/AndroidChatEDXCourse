package com.afrasilv.androidchatedxcourse.contactlist.ui;

import com.afrasilv.androidchatedxcourse.entities.User;

public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}