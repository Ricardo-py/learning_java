package DesignModel.Factory.FactoryMethod;

public class client {
    public static void main(String[] args){
        PhoneFactoryMethod applePhoneFactory = new ApplePhoneFactory();
        Phone iPhone = applePhoneFactory.create();
        iPhone.call();
        PhoneFactoryMethod xiaomiPhoneFactory = new XiaomiPhoneFactory();
        Phone xiaomi = xiaomiPhoneFactory.create();
        xiaomi.call();

//        LaptopFactoryMethod appleLaptop = new AppleLaptopFactory();
//        Laptop applelaptop = appleLaptop.create();
//        applelaptop.start();
//
//        LaptopFactoryMethod xiaomiLaptop = new XiaomilaptopFactory();
//        Laptop xiaomilaptop = xiaomiLaptop.create();
//        xiaomilaptop.start();
    }
}
