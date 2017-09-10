package com.a21buttons.fragmenttestrule.sample.abstractfactory;

/**
 * Created by zhanghehe on 2017/9/10.
 */

public class AndroidFactory implements IPhoneFactory {
    @Override
    public IInterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }

    @Override
    public IOperatroController createOperatorController() {
        return new AndroidOperatorController();
    }
}
