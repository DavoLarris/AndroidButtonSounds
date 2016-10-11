package com.davolarris.instantfun;

import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp = null;
    private  Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
    }

    public void OnClick(View v) {

        int time = 2;

        // shake it
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(time);

            // patterns: gap, vibrate time, gap, vibrate time, gap,...
            //long[] pattern = { 1000, 100, 0, 200, 100, 200 };

            // vibrate patterns and repeat
            //vibrator.vibrate(pattern, 1);
        }

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
