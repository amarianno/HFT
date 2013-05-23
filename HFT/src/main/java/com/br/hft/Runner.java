package com.br.hft;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Runner extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(null);
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.screen_ac, menu);
		return true;
	}

}
