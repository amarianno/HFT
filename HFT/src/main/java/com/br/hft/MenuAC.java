package com.br.hft;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MenuAC extends Activity {

    private ImageView institutoZenZutsu;
    private ImageView academiaRunner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_ac);

        institutoZenZutsu = (ImageView) findViewById(R.id.imgZenJutsu);
        academiaRunner = (ImageView) findViewById(R.id.imgRunner);

        institutoZenZutsu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mudarTelaZenJutsu();
            }
        });

        academiaRunner.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mudarTelaRunner();
            }
        });


    }

    /**
     *
     */
    private void mudarTelaZenJutsu() {
        startActivity(new Intent(this, ZenJutsu.class));
    }

    /**
     *
     */
    private void mudarTelaRunner() {
        startActivity(new Intent(this, Runner.class));
    }

    /**
     *
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.screen_ac, menu);
        return true;
    }
}
