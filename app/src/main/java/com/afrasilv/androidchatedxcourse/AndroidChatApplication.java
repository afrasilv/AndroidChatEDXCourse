package com.afrasilv.androidchatedxcourse;

import android.app.Application;

import com.afrasilv.androidchatedxcourse.lib.GlideImageLoader;
import com.afrasilv.androidchatedxcourse.lib.ImageLoader;
import com.google.firebase.database.FirebaseDatabase;


/**
 * Created by alex on 28/06/16.
 */
public class AndroidChatApplication extends Application {
    private ImageLoader imageLoader;

    @Override
    public void onCreate() {
        super.onCreate();
        setupFirebase();
        setupImageLoader();
    }

    private void setupImageLoader() {
        imageLoader = new GlideImageLoader(this);
    }

    public ImageLoader getImageLoader() {
        return imageLoader;
    }

    private void setupFirebase(){
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}