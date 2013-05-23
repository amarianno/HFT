package com.br.hft;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.view.Menu;

public class ScreenAC extends Activity  implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_ac);

        Handler h = new Handler();
        h.postDelayed(this, 3000);
    }


    @Override
    public void run() {
        startActivity(new Intent(this, MenuAC.class));
        finish();
    }
    
}
