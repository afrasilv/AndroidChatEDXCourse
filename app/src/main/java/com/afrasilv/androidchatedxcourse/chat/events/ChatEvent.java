package com.afrasilv.androidchatedxcourse.chat.events;

import com.afrasilv.androidchatedxcourse.chat.entities.ChatMessage;

public class ChatEvent {
    ChatMessage msg;

    public ChatEvent(ChatMessage msg) {
        this.msg = msg;
    }

    public ChatMessage getMessage() {
        return msg;
    }
}