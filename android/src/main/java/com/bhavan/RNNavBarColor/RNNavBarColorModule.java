package com.bhavan.RNNavBarColor;

import android.app.Activity;
import android.view.Window;
import android.graphics.Color;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;

public class RNNavBarColorModule extends ReactContextBaseJavaModule {
   public RNNavBarColorModule(ReactApplicationContext reactContext) {
      super(reactContext);
   }

   @Override
   public String getName() {
      return "RNNavBarColor";
   }

   @ReactMethod
   public void setColor(final String color) {
      final Activity activity = getCurrentActivity();
      final int colorInt = Color.parseColor(color);
      activity.runOnUiThread(new Runnable() {
         @Override
         public void run() {
             activity.getWindow().setNavigationBarColor(colorInt);
          }
       });
   }
}