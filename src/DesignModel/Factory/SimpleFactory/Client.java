package DesignModel.Factory.SimpleFactory;

public class Client {
    public static void main(String[] args){
        Phone phone = SimpleFactory.create("Xiaomi");
        phone.call();
        phone = SimpleFactory.create("IPhone");
        phone.call();
    }
}
