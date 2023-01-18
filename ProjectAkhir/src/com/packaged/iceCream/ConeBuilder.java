package com.packaged.iceCream;

public class ConeBuilder {
    public Cone cone;



    public ConeBuilder() {
        this.cone = new Cone();
    }

    public Cone build(){
        return this.cone;
    }

    public void reset(){
        cone = new Cone();
    }


    public ConeBuilder setIceCreamId(String iceCreamId){
        cone.setIceCreamId(iceCreamId);
        return this;
    }

    public ConeBuilder setIceCreamType(String iceCreamType){
        cone.setIceCreamType(iceCreamType);
        return this;
    }

    public ConeBuilder setIceCreamFlavor(String iceCreamFlavor){
        cone.setIceCreamFlavor(iceCreamFlavor);
        return this;
    }

    public ConeBuilder setIceCreamPrice(int iceCreamPrice){
        cone.setIceCreamPrice(iceCreamPrice);
        return this;
    }

    public ConeBuilder setMilk(String milk){
        cone.setMilk(milk);
        return this;
    }

    public ConeBuilder setTopping(String topping){
        cone.setTopping(topping);
        return this;
    }

    public ConeBuilder setHasSprinkle(String hasSprinkle){
        cone.setHasSprinkle(hasSprinkle);
        return this;
    }

    public ConeBuilder setConeFlavor(String coneFlavor){
        cone.setConeFlavor(coneFlavor);
        return this;
    }
}
