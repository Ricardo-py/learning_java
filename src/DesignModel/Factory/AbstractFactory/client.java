package DesignModel.Factory.AbstractFactory;

import DesignModel.Factory.AbstractFactory.Factory.AppleFactory;
import DesignModel.Factory.AbstractFactory.Factory.AbstractFactory;
import DesignModel.Factory.AbstractFactory.Factory.XiaomiFactory;

public class client {
    public static void main(String[] args){
        AbstractFactory appleFactory = new AppleFactory();
        Phone iPhone = appleFactory.createPhone();
        iPhone.call();
        Laptop appleLaptop = appleFactory.createLaptop();
        appleLaptop.start();

        AbstractFactory xiaomiFactory = new XiaomiFactory();
        Phone miPhone = xiaomiFactory.createPhone();
        miPhone.call();
        Laptop xiaomiLaptop = xiaomiFactory.createLaptop();
        xiaomiLaptop.start();
    }
}
