package com.afrasilv.androidchatedxcourse.chat.ui;

import com.afrasilv.androidchatedxcourse.chat.entities.ChatMessage;

public interface ChatView {
    void sendMessage();
    void onMessageReceived(ChatMessage msg);
}