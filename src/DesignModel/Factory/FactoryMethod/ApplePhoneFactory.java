package DesignModel.Factory.FactoryMethod;

public class ApplePhoneFactory implements PhoneFactoryMethod {
    @Override
    public Phone create() {
        return new IPhone();
    }
}
