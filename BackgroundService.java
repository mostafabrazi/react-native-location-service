package com.nativemoduleapp;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;

public class BackgroundService extends ReactContextBaseJavaModule {
    BackgroundService(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "BackgroundService";
    }

    // add to CalendarModule.java
    @ReactMethod
    public void createBackgroundThread(String name, String user_id) {
        Intent locationIntent = new Intent(getReactApplicationContext(), LocationService.class);
        locationIntent.putExtra("user_id", user_id);
        getReactApplicationContext().startService(locationIntent);
    }
}