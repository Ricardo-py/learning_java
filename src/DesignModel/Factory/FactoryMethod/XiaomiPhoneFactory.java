package DesignModel.Factory.FactoryMethod;


public class XiaomiPhoneFactory implements PhoneFactoryMethod {

    @Override
    public Phone create() {
        return new XiaomiPhone();
    }
}
