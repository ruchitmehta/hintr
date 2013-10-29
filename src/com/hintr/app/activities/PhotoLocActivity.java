package com.hintr.app.activities;

import com.myproject.apps.flickrhintrapp.R;
import com.myproject.apps.flickrhintrapp.R.layout;
import com.myproject.apps.flickrhintrapp.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PhotoLocActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_photo_loc);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.photo_loc, menu);
		return true;
	}

}
