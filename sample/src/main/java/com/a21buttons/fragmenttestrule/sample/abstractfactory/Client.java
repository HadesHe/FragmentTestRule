package com.a21buttons.fragmenttestrule.sample.abstractfactory;

/**
 * Created by zhanghehe on 2017/9/10.
 */

public class Client {

    public void test(){
        IPhoneFactory androidFactory=new AndroidFactory();
        androidFactory.createInterfaceController().createInterface();
        androidFactory.createOperatorController().createOperator();

        IPhoneFactory iPhoneFactory=new IponeFactory();
        iPhoneFactory.createInterfaceController();
        iPhoneFactory.createOperatorController();

        IPhoneFactory symbianFactory=new SymBianFactory();
        symbianFactory.createInterfaceController();
        symbianFactory.createOperatorController();



    }
}
