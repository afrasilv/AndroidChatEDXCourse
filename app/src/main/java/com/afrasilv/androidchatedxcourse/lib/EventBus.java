package com.afrasilv.androidchatedxcourse.lib;

/**
 * Created by alex on 30/06/16.
 */
public interface EventBus {
    void register(Object subscriber);
    void unRegister(Object subscriber);
    void post(Object event);
}
