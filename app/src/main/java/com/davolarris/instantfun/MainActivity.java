package com.davolarris.instantfun;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View v) {

        if (mp != null) {
            mp.reset();
            mp.release();
        }

        switch (v.getId()) {
            case R.id.button8:
                mp = MediaPlayer.create(MainActivity.this, R.raw.badum);
                break;
            case R.id.button7:
                mp = MediaPlayer.create(MainActivity.this, R.raw.nyancat);
                break;
            case R.id.button6:
                mp = MediaPlayer.create(MainActivity.this, R.raw.dramaticchipmunk);
                break;
            case R.id.button5:
                mp = MediaPlayer.create(MainActivity.this, R.raw.nooo);
                break;
            case R.id.button4:
                mp = MediaPlayer.create(MainActivity.this, R.raw.bye);
                break;
            case R.id.button2:
                mp = MediaPlayer.create(MainActivity.this, R.raw.sergeant);
                break;
        }

        mp.start();

    }
}
