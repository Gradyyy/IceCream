package com.packaged.iceCream;

public class SundaeBuilder {
    public Sundae sundae;

    public SundaeBuilder() {
        this.sundae = new Sundae();
    }

    public Sundae build(){
        return this.sundae;
    }

    public void reset(){
        sundae = new Sundae();
    }


    public SundaeBuilder setIceCreamId(String iceCreamId){
        sundae.setIceCreamId(iceCreamId);
        return this;
    }

    public SundaeBuilder setIceCreamType(String iceCreamType){
        sundae.setIceCreamType(iceCreamType);
        return this;
    }

    public SundaeBuilder setIceCreamFlavor(String iceCreamFlavor){
        sundae.setIceCreamFlavor(iceCreamFlavor);
        return this;
    }

    public SundaeBuilder setIceCreamPrice(int iceCreamPrice){
        sundae.setIceCreamPrice(iceCreamPrice);
        return this;
    }

    public SundaeBuilder setMilk(String milk){
        sundae.setMilk(milk);
        return this;
    }

    public SundaeBuilder setTopping(String topping){
        sundae.setTopping(topping);
        return this;
    }

    public SundaeBuilder setHasSprinkle(String hasSprinkle){
        sundae.setHasSprinkle(hasSprinkle);
        return this;
    }

    public SundaeBuilder setSyrup(String syrup){
        sundae.setSyrup(syrup);
        return this;
    }
}
