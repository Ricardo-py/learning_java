package DesignModel.Factory.AbstractFactory.Apple;


import DesignModel.Factory.AbstractFactory.Phone;

public class IPhone extends Phone {
    @Override
    public void call() {
        System.out.println("苹果手机打电话");
    }
}
