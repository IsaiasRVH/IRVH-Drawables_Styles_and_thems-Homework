package com.pdam.drawabletest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int mVolumeLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVolumeLevel = 0;
    }

    public void increaseVolume(View view) {
        mVolumeLevel++;
        if(mVolumeLevel == 3) {
            view.setEnabled(false);
        }
        if(!findViewById(R.id.button_decrease).isEnabled()) {
            findViewById(R.id.button_decrease).setEnabled(true);
        }
        ImageView image = findViewById(R.id.imageView);
        image.getBackground().setLevel(mVolumeLevel);
    }

    public void decreaseVolume(View view) {
        mVolumeLevel--;
        if(mVolumeLevel == 0) {
            view.setEnabled(false);
        }
        if(!findViewById(R.id.button_increase).isEnabled()) {
            findViewById(R.id.button_increase).setEnabled(true);
        }
        ImageView image = findViewById(R.id.imageView);
        image.getBackground().setLevel(mVolumeLevel);
    }
}