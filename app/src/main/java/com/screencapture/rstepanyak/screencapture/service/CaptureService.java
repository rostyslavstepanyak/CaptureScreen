package com.screencapture.rstepanyak.screencapture.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class CaptureService extends Service {
    public CaptureService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startid) {
        return START_STICKY;
    }
}
