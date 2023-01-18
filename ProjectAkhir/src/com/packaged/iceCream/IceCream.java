package com.packaged.iceCream;

public class IceCream {
    protected String iceCreamId;
    protected String iceCreamType;
    protected String iceCreamFlavor;
    protected int iceCreamPrice;
    protected String milk;
    protected String topping;
    protected String hasSprinkle;

    public IceCream(String iceCreamId, String iceCreamType, String iceCreamFlavor, int iceCreamPrice, String milk, String topping, String hasSprinkle) {
        this.iceCreamId = iceCreamId;
        this.iceCreamType = iceCreamType;
        this.iceCreamFlavor = iceCreamFlavor;
        this.iceCreamPrice = iceCreamPrice;
        this.milk = milk;
        this.topping = topping;
        this.hasSprinkle = hasSprinkle;
    }

    public String getIceCreamType() {
        return iceCreamType;
    }

    public void setIceCreamType(String iceCreamType) {
        this.iceCreamType = iceCreamType;
    }

    public String getIceCreamId() {
        return iceCreamId;
    }

    public void setIceCreamId(String iceCreamId) {
        this.iceCreamId = iceCreamId;
    }

    public String getIceCreamFlavor() {
        return iceCreamFlavor;
    }

    public void setIceCreamFlavor(String iceCreamFlavor) {
        this.iceCreamFlavor = iceCreamFlavor;
    }

    public int getIceCreamPrice() {
        return iceCreamPrice;
    }

    public void setIceCreamPrice(int iceCreamPrice) {
        this.iceCreamPrice = iceCreamPrice;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getHasSprinkle() {
        return hasSprinkle;
    }

    public void setHasSprinkle(String hasSprinkle) {
        this.hasSprinkle = hasSprinkle;
    }

    public IceCream(){

    }


}
