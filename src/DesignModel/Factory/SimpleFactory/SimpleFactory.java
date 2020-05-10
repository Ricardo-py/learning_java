package DesignModel.Factory.SimpleFactory;

public class SimpleFactory {
    public static Phone create(String brand){
        if ("Xiaomi".equals(brand))
            return new Xiaomi();
        else if ("IPhone".equals(brand))
            return new IPhone();
        else
            return null;
    }
}
