package com.a21buttons.fragmenttestrule.sample.shape;

import android.util.Log;

/**
 * Created by zhanghehe on 2017/9/5.
 */

public class Triangle implements IShape {
    @Override
    public void draw() {
        Log.d("Triangle","draw");

    }

    @Override
    public void erase() {
        Log.d("Triangle","erase");

    }
}
