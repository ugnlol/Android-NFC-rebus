package com.tobbe.treasurehunt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.splash_screen);
		
		IntentLauncher launcher = new IntentLauncher();
		launcher.start();
	}
	
	private class IntentLauncher extends Thread{
		
		public void run()
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				Log.e("SplashScreen", e.getMessage());
			}
			
			Intent intent = new Intent(SplashScreen.this, MainActivity.class);
			SplashScreen.this.startActivity(intent);
			SplashScreen.this.finish();
		}
	}
}
