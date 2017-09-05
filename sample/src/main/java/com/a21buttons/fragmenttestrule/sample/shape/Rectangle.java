package com.a21buttons.fragmenttestrule.sample.shape;

import android.util.Log;

/**
 * Created by zhanghehe on 2017/9/5.
 */

public class Rectangle implements IShape {
    @Override
    public void draw() {
        Log.d("Rectangle","draw");

    }

    @Override
    public void erase() {
        Log.d("Rectangle","erase");

    }
}
