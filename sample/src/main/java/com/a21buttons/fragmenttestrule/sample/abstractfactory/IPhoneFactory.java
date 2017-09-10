package com.a21buttons.fragmenttestrule.sample.abstractfactory;

/**
 * Created by zhanghehe on 2017/9/10.
 */

public interface IPhoneFactory {

    IInterfaceController createInterfaceController();

    IOperatroController createOperatorController();
}
