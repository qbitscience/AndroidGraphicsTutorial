package com.qbitscience.androidgraphicstutorial;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyGraphics myGraphics=new MyGraphics(getApplicationContext());
        setContentView(myGraphics);
    }
}