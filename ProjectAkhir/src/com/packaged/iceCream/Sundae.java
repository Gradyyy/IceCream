package com.packaged.iceCream;

public class Sundae extends IceCream{
    private String syrup;

    public Sundae(String iceCreamId, String iceCreamType, String iceCreamFlavor, int iceCreamPrice, String milk, String topping, String hasSprinkle, String syrup) {
        super(iceCreamId, iceCreamType, iceCreamFlavor, iceCreamPrice, milk, topping, hasSprinkle);
        this.syrup = syrup;
    }

    public String getSyrup() {
        return syrup;
    }

    public void setSyrup(String syrup) {
        this.syrup = syrup;
    }

    public Sundae(){

    }
}
