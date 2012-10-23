package com.caletoeteam.android;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.DroidGap;

public class CamelToeActivity extends DroidGap {
   /**
    * Called when the activity is first created.
    */
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      super.loadUrl("file:///android_asset/www/index.html");
   }
}
