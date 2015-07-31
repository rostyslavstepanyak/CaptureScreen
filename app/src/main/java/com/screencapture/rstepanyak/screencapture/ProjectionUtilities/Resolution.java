package com.screencapture.rstepanyak.screencapture.ProjectionUtilities;

/**
 * Created by r.stepanyak on 7/30/15.
 */
public class Resolution {
    int x;
    int y;
    public Resolution(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return x + "x" + y;
    }
}