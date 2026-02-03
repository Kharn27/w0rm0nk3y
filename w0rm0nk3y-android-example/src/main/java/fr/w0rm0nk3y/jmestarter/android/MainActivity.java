package fr.w0rm0nk3y.jmestarter.android;

import com.jme3.app.AndroidHarness;

public class MainActivity extends AndroidHarness {

  public MainActivity() {
    appClass = GameApp.class.getName();
    eglBitsPerPixel = 32;
    eglAlphaBits = 0;
    eglDepthBits = 24;
    eglSamples = 0;
    exitDialogTitle = "Exit";
    exitDialogMessage = "Exit the demo?";
  }
}
