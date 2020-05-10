package DesignModel.Factory.AbstractFactory.Factory;

import DesignModel.Factory.AbstractFactory.Apple.AppleLaptop;
import DesignModel.Factory.AbstractFactory.Apple.IPhone;
import DesignModel.Factory.AbstractFactory.Laptop;
import DesignModel.Factory.AbstractFactory.Phone;

public class AppleFactory extends AbstractFactory {
    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}
