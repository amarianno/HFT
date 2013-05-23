package com.br.hft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class ZenJutsu extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		CheckBox checkBox = null;
		
		LinearLayout linearLayout = (LinearLayout) findViewById(R.layout.selecionar_alunos);

		 ScrollView s = new ScrollView(this);  
	     s.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT)); 

	     checkBox = new CheckBox(this);
         checkBox.setText("Alberto Marianno");
         checkBox.setId(1);
         linearLayout.addView(checkBox);
         
         checkBox = new CheckBox(this);
         checkBox.setText("Guilherme Dred");
         checkBox.setId(2);
         linearLayout.addView(checkBox);
         
         checkBox = new CheckBox(this);
         checkBox.setText("Willy Augusto");
         checkBox.setId(3);
         linearLayout.addView(checkBox);
         
         checkBox = new CheckBox(this);
         checkBox.setText("Francisca Lima");
         checkBox.setId(4);
         linearLayout.addView(checkBox);

         s.addView(linearLayout);
         //setContentView(s);

	}
	
	private void voltar() {
		startActivity(new Intent(this, MenuAC.class));
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.screen_ac, menu);
		return true;
	}

}
