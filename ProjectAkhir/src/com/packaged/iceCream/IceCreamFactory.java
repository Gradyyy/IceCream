package com.packaged.iceCream;

public class IceCreamFactory {
    public IceCream generateIceCream(String iceCreamType) {
        if(iceCreamType.equals("Cone")) {
            return new Cone();
        }
        else if(iceCreamType.equals("Sundae")) {
            return new Sundae();
        }

        System.out.println("FAIL");
        return null;
    }
}
