package DesignModel.Factory.AbstractFactory.Apple;


import DesignModel.Factory.AbstractFactory.Laptop;

public class AppleLaptop extends Laptop {
    @Override
    public void start() {
        System.out.println("苹果笔记本电脑启动了");
    }
}
