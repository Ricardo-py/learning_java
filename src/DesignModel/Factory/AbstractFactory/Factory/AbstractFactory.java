package DesignModel.Factory.AbstractFactory.Factory;

import DesignModel.Factory.AbstractFactory.Laptop;
import DesignModel.Factory.AbstractFactory.Phone;

public abstract class AbstractFactory {
    public abstract Phone createPhone();
    public abstract Laptop createLaptop();
}
