package com.a21buttons.fragmenttestrule.sample.photo;

/**
 * Created by zhanghehe on 2017/9/7.
 */

public class Client {

    public void onFactoryMethod(){
        IPhotoReaderFactory iPhotoRerfactory=new GifReaderFactory();
        IPhotoReader iPhotoReader=iPhotoRerfactory.newInstance();
        iPhotoReader.readPhoto();


        IPhotoReaderFactory iPhotoRerfactory1=new JPGReaderFactory();
        IPhotoReader iPhotoReader1=iPhotoRerfactory.newInstance();
        iPhotoReader1.readPhoto();


    }
}
