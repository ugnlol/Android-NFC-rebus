package com.tobbe.treasurehunt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void buttonChooserMethod(View v){
		if(v.getId()==R.id.button1)
		{
			Log.d("Main", "button1");
			//Intent startOtherActivity = new Intent(this, OtherActivity.class);
			Intent findGamesActivity = new Intent(this, FindGames.class);
			startActivity(findGamesActivity);
		}
		else if(v.getId()==R.id.button2)
		{
			Log.d("Main", "button2");
		}	
	}


}
