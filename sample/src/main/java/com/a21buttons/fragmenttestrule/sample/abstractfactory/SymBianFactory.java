package com.a21buttons.fragmenttestrule.sample.abstractfactory;

/**
 * Created by zhanghehe on 2017/9/10.
 */

public class SymBianFactory implements IPhoneFactory {
    @Override
    public IInterfaceController createInterfaceController() {
        return new SymBianInterfaceController();
    }

    @Override
    public IOperatroController createOperatorController() {
        return new SymBianOperatorController();
    }
}
