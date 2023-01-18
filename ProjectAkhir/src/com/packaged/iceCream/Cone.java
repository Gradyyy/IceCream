package com.packaged.iceCream;

public class Cone extends IceCream{
    private String coneFlavor;


    public Cone(String iceCreamId, String iceCreamType, String iceCreamFlavor, int iceCreamPrice, String milk, String topping, String hasSprinkle, String coneFlavor) {
        super(iceCreamId, iceCreamType, iceCreamFlavor, iceCreamPrice, milk, topping, hasSprinkle);
        this.coneFlavor = coneFlavor;
    }

    public Cone() {

    }
    public String getConeFlavor() {
        return coneFlavor;
    }



    public void setConeFlavor(String coneFlavor) {
        this.coneFlavor = coneFlavor;
    }
}
