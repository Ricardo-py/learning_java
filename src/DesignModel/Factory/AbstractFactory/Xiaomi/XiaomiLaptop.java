package DesignModel.Factory.AbstractFactory.Xiaomi;


import DesignModel.Factory.AbstractFactory.Laptop;

public class XiaomiLaptop extends Laptop {

    @Override
    public void start() {
        System.out.println("小米笔记本电脑启动了");
    }
}
