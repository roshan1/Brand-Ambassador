package com.example.brandambassador;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class AddEventActivity extends Activity {

	@SuppressLint ("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
			
	    setupActionBar();
		
		//Get the message from the intent that was in MainActivity
		Intent intent = getIntent();
		String Date = intent.getStringExtra(MainActivity.SELECTED_DATE);
		
		TextView displayDate = new TextView (this);
		displayDate.setText(Date);
		setContentView(R.layout.add_event);
		//setContentView(displayDate);
			
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {
		 if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) 
		 {
		 getActionBar().setDisplayHomeAsUpEnabled(true);
		 }

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_event, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
