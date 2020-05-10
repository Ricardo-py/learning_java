package DesignModel.Factory.AbstractFactory.Xiaomi;

import DesignModel.Factory.AbstractFactory.Phone;

public class XiaomiPhone extends Phone {

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
