package com.google.android.exoplayer2.demo;

import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.google.android.exoplayer2.util.Log;

public class DrmSessionEventListener implements DefaultDrmSessionEventListener {

  private static final String TAG = "DrmSessionEventListener";

  @Override
  public void onDrmSessionAcquired() {
    Log.d(TAG, "onDrmSessionAcquired() called");
  }

  @Override
  public void onDrmKeysLoaded() {
    Log.d(TAG, "onDrmKeysLoaded() called");
  }

  @Override
  public void onDrmSessionManagerError(Exception error) {
    Log.d(TAG, "onDrmSessionManagerError() called with: error = [" + error + "]");
  }

  @Override
  public void onDrmKeysRestored() {
    Log.d(TAG, "onDrmKeysRestored() called");
  }

  @Override
  public void onDrmKeysRemoved() {
    Log.d(TAG, "onDrmKeysRemoved() called");
  }

  @Override
  public void onDrmSessionReleased() {
    Log.d(TAG, "onDrmSessionReleased() called");
  }
}
