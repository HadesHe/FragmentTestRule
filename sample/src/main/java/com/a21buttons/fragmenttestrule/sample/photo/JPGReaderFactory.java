package com.a21buttons.fragmenttestrule.sample.photo;

/**
 * Created by zhanghehe on 2017/9/7.
 */

public class JPGReaderFactory implements IPhotoReaderFactory {
    @Override
    public IPhotoReader newInstance() {
        return new JPGReader();
    }
}
