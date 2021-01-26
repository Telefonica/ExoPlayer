package com.google.android.exoplayer2.demo;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Log;

public class CustomDrmSessionEventListener implements DrmSessionEventListener {

  private static final String TAG = "DrmSessionEventListener";

  @Override
  public void onDrmSessionAcquired(int windowIndex,
      @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    Log.d(TAG,
        "onDrmSessionAcquired() called with: windowIndex = [" + windowIndex + "], mediaPeriodId = ["
            + mediaPeriodId + "]");
  }

  @Override
  public void onDrmKeysLoaded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    Log.d(TAG,
        "onDrmKeysLoaded() called with: windowIndex = [" + windowIndex + "], mediaPeriodId = ["
            + mediaPeriodId + "]");
  }

  @Override
  public void onDrmSessionManagerError(int windowIndex,
      @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception error) {
    Log.d(TAG, "onDrmSessionManagerError() called with: windowIndex = [" + windowIndex
        + "], mediaPeriodId = [" + mediaPeriodId + "], error = [" + error + "]");
  }

  @Override
  public void onDrmKeysRestored(int windowIndex,
      @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    Log.d(TAG,
        "onDrmKeysRestored() called with: windowIndex = [" + windowIndex + "], mediaPeriodId = ["
            + mediaPeriodId + "]");
  }

  @Override
  public void onDrmKeysRemoved(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    Log.d(TAG,
        "onDrmKeysRemoved() called with: windowIndex = [" + windowIndex + "], mediaPeriodId = ["
            + mediaPeriodId + "]");
  }

  @Override
  public void onDrmSessionReleased(int windowIndex,
      @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    Log.d(TAG,
        "onDrmSessionReleased() called with: windowIndex = [" + windowIndex + "], mediaPeriodId = ["
            + mediaPeriodId + "]");
  }
}
