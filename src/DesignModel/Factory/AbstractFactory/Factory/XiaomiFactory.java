package DesignModel.Factory.AbstractFactory.Factory;

import DesignModel.Factory.AbstractFactory.Laptop;
import DesignModel.Factory.AbstractFactory.Phone;
import DesignModel.Factory.AbstractFactory.Xiaomi.XiaomiLaptop;
import DesignModel.Factory.AbstractFactory.Xiaomi.XiaomiPhone;

public class XiaomiFactory extends AbstractFactory {
    @Override
    public Phone createPhone() {
        return new XiaomiPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new XiaomiLaptop();
    }
}
