package DesignModel.Factory.FactoryMethod;

public class AppleLaptopFactory implements LaptopFactoryMethod {
    @Override
    public Laptop create() {
        return new AppleLaptop();
    }
}
