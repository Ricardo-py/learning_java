package DesignModel.Factory.FactoryMethod;

public class XiaomilaptopFactory implements LaptopFactoryMethod {
    @Override
    public Laptop create() {
        return new XiaomiLaptop();
    }
}
