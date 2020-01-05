package com.redsos;
//
//import com.facebook.react.ReactActivity;
//
//public class MainActivity extends ReactActivity {
//
//  /**
//   * Returns the name of the main component registered from JavaScript. This is used to schedule
//   * rendering of the component.
//   */
//  @Override
//  protected String getMainComponentName() {
//    return "RedSos";
//  }
//}


//import com.facebook.react.ReactActivity;

import android.os.Bundle;
import android.util.Log;

import com.reactnativenavigation.NavigationActivity;
//public class MainActivity extends ReactActivity {

public class MainActivity extends NavigationActivity {
  /**
   * Returns the name of the main component registered from JavaScript.
   * This is used to schedule rendering of the component.
   */
//    @Override
//    protected String getMainComponentName() {
//        return "com.vn.greenlight.sosmobile";
//    }
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.i("1MainActivity", "M onCreate");
  }
  @Override
  public void onStart(){
    super.onStart();
    Log.i("1MainActivity", "M onStart");
  }
  @Override
  public void onResume(){
    super.onResume();
    // put your code here...
    Log.i("1MainActivity", "M onResume");
  }
  @Override
  public void onPause() {
    super.onPause();  // Always call the superclass method first

    // Release the Camera because we don't need it when paused
    // and other activities might need to use it.
    Log.i("1MainActivity", "M onPause");
//        String from, forward, timeOut;
//        from = "äc";
//        forward= "acn";
//        timeOut ="acbss";
//        Intent notifyIntent = new Intent();
//        notifyIntent.putExtra("from", from);
//        notifyIntent.putExtra("forward", forward);
//        notifyIntent.putExtra("timeOut", timeOut);
//        notifyIntent.setAction(Intent.ACTION_MAIN);
//        notifyIntent.addCategory(Intent.CATEGORY_LAUNCHER);
//        notifyIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY);
//        notifyIntent.setComponent(new ComponentName(getApplicationContext().getPackageName(), AlarmActivity.class.getName()));
//        Log.i("1Main","SHOW ALRARM FUNC: "+ " start ACtivi" +notifyIntent );
//        startActivity(notifyIntent);

  }

  public void onStop() {

    super.onStop();
    Log.i("1MainActivity", "M onStop");
//        String from, forward, timeOut;
//        from = "äc";
//        forward= "acn";
//        timeOut ="acbss";
//        Intent notifyIntent = new Intent();
//        notifyIntent.putExtra("from", from);
//        notifyIntent.putExtra("forward", forward);
//        notifyIntent.putExtra("timeOut", timeOut);
//        notifyIntent.setAction(Intent.ACTION_MAIN);
//        notifyIntent.addCategory(Intent.CATEGORY_LAUNCHER);
//        notifyIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY);
//        notifyIntent.setComponent(new ComponentName(getApplicationContext().getPackageName(), AlarmActivity.class.getName()));
//        Log.i("1Main","SHOW ALRARM FUNC: "+ " start ACtivi" +notifyIntent );
//        startActivity(notifyIntent);
//
//


  }
  public void onDestroy() {

    super.onDestroy();
    Log.i("1MainActivity", "M onDestroy");

  }
}