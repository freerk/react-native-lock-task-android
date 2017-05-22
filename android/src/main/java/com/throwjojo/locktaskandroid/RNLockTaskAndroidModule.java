
package com.throwjojo.locktaskandroid;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNLockTaskAndroidModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNLockTaskAndroidModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  // Starts lock task mode
  @ReactMethod
  public void startLockTask() {
    if (getCurrentActivity() != null) {
      getCurrentActivity().startLockTask();
    }
  }

  // Stops lock task mode
  @ReactMethod
  public void stopLockTask() {
    if (getCurrentActivity() != null) {
      getCurrentActivity().stopLockTask();
    }
  }

  // Checks if lock task mode is active or not
  private boolean isLockTaskModeActive() {
    ActivityManager activityManager = (ActivityManager) reactContext.getSystemService(Context.ACTIVITY_SERVICE);
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
      return (activityManager.getLockTaskModeState() != ActivityManager.LOCK_TASK_MODE_NONE);
    } else {
      return activityManager.isInLockTaskMode();
    }
  }

  @Override
  public String getName() {
    return "LockTaskAndroid";
  }

}