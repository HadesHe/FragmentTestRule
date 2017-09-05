package com.a21buttons.fragmenttestrule.sample.shape;

/**
 * Created by zhanghehe on 2017/9/5.
 */

public class ShapeFactory {

    public static IShape newShape(String shapeName) throws Exception {
        IShape iShape;
        if("Circle".equals(shapeName)){
            iShape=new Circle();

        }else if("Rectangle".equals(shapeName)){
            iShape=new Rectangle();

        }else if("Triangle".equals(shapeName)){
            iShape=new Triangle();
        }else{
            throw new Exception("UnSuppoeredShapeException");
        }
        return iShape;
    }
}
