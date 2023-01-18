package com.packaged;

import com.packaged.database.Database;
import com.packaged.iceCream.*;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Machine m = new Machine("iceCream");
    Scanner scan = new Scanner(System.in);
    int index= 1;

    public Main(){
        int choice = 0;
        do {
            m.nextStateCycle();
            System.out.println("FREEZERIA");
            System.out.println("============================");
            System.out.println("1. Buy Ice-Cream :P");
            System.out.println("2. View Waiting List");
            System.out.println("3. Take Out Order");
            choice = scan.nextInt();


            scan.nextLine();
            if(choice == 1){
                buyIceCream();
            }
            else if(choice == 2){
                viewWaitingList();
            }
            else if(choice == 3){
                takeOutOrder();
            }

        }while(choice != 4);
    }

    public void viewWaitingList(){

        m.setCurrentState(new EcoState());
        m.nextStateCycle();

        ArrayList<IceCream> iceCreams = Database.getData().getIceCreams();
        if(iceCreams.isEmpty()){
            System.out.println("NO ORDER YET");
        }
        else{
            System.out.println("================================================================");
            for(IceCream i : iceCreams){
                if(i instanceof Cone){
                    System.out.printf("| %-2d| %-2s| %-7s| %-12s| %-5d| %-8s| %-10s| %-7s Cone|\n",index,i.getIceCreamId(),i.getIceCreamType(),i.getIceCreamFlavor(),i.getIceCreamPrice(),i.getMilk(),i.getTopping(),i.getHasSprinkle(),((Cone) i).getConeFlavor());
                    System.out.println("================================================================");
                    index++;
                }
                else if(i instanceof Sundae){
                    System.out.printf("| %-2d| %-2s| %-7s| %-12s| %-5d| %-8s| %-10s| %-7s Syrup|\n",index,i.getIceCreamId(),i.getIceCreamType(),i.getIceCreamFlavor(),i.getIceCreamPrice(),i.getMilk(),i.getTopping(),i.getHasSprinkle(),((Sundae) i).getSyrup());
                    System.out.println("================================================================");
                    System.out.println();
                    index++;
                }

            }
        }

    }
    //MASIH BAU
    public void takeOutOrder(){
        m.setCurrentState(new EcoState());
        m.nextStateCycle();
        Database database = Database.getData();
        int choice = 0;
        ArrayList<IceCream> iceCreams = Database.getData().getIceCreams();

        if(iceCreams.isEmpty()){
            System.out.println("NO ICE CREAM");
        }
        System.out.println("Which Order do you want to take out?");
        do{
            viewWaitingList();
            System.out.print("Choose Order to delete: ");
            choice = scan.nextInt();
            scan.nextLine();
        }while(choice>index || choice<0);
        database.deleteIceCream(choice-1);

    }

//    private IceCream getFoodByID(String id){
//        if(id.contains("CN") ){
//            ArrayList
//            Quesadilla dataQuesadilla = new Quesadilla();
//            ArrayList<Quesadilla> quesadillas = dataQuesadilla.getAll();
//            return quesadillas.get(id-1);
//        }
//        else if(id.contains("SN")){
//            Taco dataTaco = new Taco();
//            ArrayList<Taco> tacos = dataTaco.getAll();
//            return tacos.get(id-6);
//        }
//    }

    public void buyIceCream(){
        m.nextStateCycle();
        int ID;
        String iceCreamID="";
        String iceCreamType = "";
        String iceCreamFlavor = "";
        int iceCreamPrice = 0;
        String milk = "";
        String topping = "";
        String hasSprinkle = "";
        String specialty = "";
        Database database = Database.getData();

        IceCreamFactory icf = new IceCreamFactory();

        IceCream eskrim;

        ConeBuilder CB = new ConeBuilder();
        SundaeBuilder SB = new SundaeBuilder();



        do{
            System.out.print("What Type of Ice Cream you want to Order[Cone||Sundae]: ");
            iceCreamType = scan.nextLine();
        }while(!(iceCreamType.equals("Cone") || iceCreamType.equals("Sundae")));

        IceCream newIceCream = icf.generateIceCream(iceCreamType);

        if(iceCreamType.equals("Cone")){
            CB.setIceCreamType(iceCreamType);

            do{
                System.out.print("What flavor[Chocolate||Vanilla||Strawberry]: ");
                iceCreamFlavor = scan.nextLine();
            }while (!(iceCreamFlavor.equals("Chocolate")|| iceCreamFlavor.equals("Vanilla")||iceCreamFlavor.equals("Strawberry")));

            scan.nextLine();

            CB.setIceCreamFlavor(iceCreamFlavor);

            do {
                System.out.print("What Milk do you want to use[Dairy || Soy]: ");
                milk = scan.nextLine();
            }while(!(milk.equals("Dairy") || milk.equals("Soy")));

            CB.setMilk(milk);
            scan.nextLine();

            do {
                System.out.print("What Topping do you want to use[Waffer||Cherry]: ");
                topping = scan.nextLine();
            }while(!(topping.equals("Waffer")||topping.equals("Cherry")));

            CB.setTopping(topping);
            scan.nextLine();


            do{
                System.out.print("Do you want to add sprinkle[Y|N]: ");
                hasSprinkle = scan.nextLine();
            }while(!(hasSprinkle.equals("Y")||hasSprinkle.equals("N")));

            CB.setHasSprinkle(hasSprinkle);
            scan.nextLine();



            do {
                System.out.print("What cone flavor[Chocolate|Original]: ");
                specialty = scan.nextLine();
            }while(!(specialty.equals("Chocolate")||specialty.equals("Original")));
            CB.setConeFlavor(specialty);

            scan.nextLine();

            iceCreamID = "CN";
            for(int i=0;i<3;i++) {
                iceCreamID += Integer.toString((int)(Math.random()*10));
            }

            CB.setIceCreamId(iceCreamID);

            iceCreamPrice = 3000;
            CB.setIceCreamPrice(iceCreamPrice);

            newIceCream = CB.build();
            database.addIceCream(newIceCream);

            CB.reset();
        }

        else if(iceCreamType.equals("Sundae")){
            SB.setIceCreamType(iceCreamType);

            do{
                System.out.print("What flavor[Chocolate||Vanilla||Strawberry]: ");
                iceCreamFlavor = scan.nextLine();
            }while (!(iceCreamFlavor.equals("Chocolate")|| iceCreamFlavor.equals("Vanilla")||iceCreamFlavor.equals("Strawberry")));

            scan.nextLine();

            SB.setIceCreamFlavor(iceCreamFlavor);

            do {
                System.out.print("What Milk do you want to use[Dairy || Soy]: ");
                milk = scan.nextLine();
            }while(!(milk.equals("Dairy") || milk.equals("Soy")));

            SB.setMilk(milk);
            scan.nextLine();

            do {
                System.out.print("What Topping do you want to use[Waffer||Cherry]: ");
                topping = scan.nextLine();
            }while(!(topping.equals("Waffer")||topping.equals("Cherry")));

            SB.setTopping(topping);
            scan.nextLine();


            do{
                System.out.print("Do you want to add sprinkle[Y|N]: ");
                hasSprinkle = scan.nextLine();
            }while(!(hasSprinkle.equals("Y")||hasSprinkle.equals("N")));

            SB.setHasSprinkle(hasSprinkle);
            scan.nextLine();



            do {
                System.out.print("What Syrup flavor[Mapple|Caramel]: ");
                specialty = scan.nextLine();
            }while(!(specialty.equals("Mapple")||specialty.equals("Caramel")));
            SB.setSyrup(specialty);

            scan.nextLine();

            iceCreamID = "SD";
            for(int i=0;i<3;i++) {
                iceCreamID += Integer.toString((int)(Math.random()*10));
            }
            SB.setIceCreamId(iceCreamID);

            iceCreamPrice = 5000;
            SB.setIceCreamPrice(iceCreamPrice);

            newIceCream = SB.build();
            database.addIceCream(newIceCream);

            SB.reset();
        }

//        CB.setIceCreamType(iceCreamType);


//        if(iceCreamType.equals("Cone")){
//            iceCreamPrice = 3000;
//        }
//        else if(iceCreamType.equals("Sundae")){
//            iceCreamPrice = 5000;
//        }


//        show order
        System.out.println("=========================================");
        System.out.printf("Ice Cream ID      : "+ iceCreamID+"\n");
        System.out.printf("Ice Cream Type    : " + iceCreamType+"\n");
        System.out.printf("Ice Cream Flavor  : "+ iceCreamFlavor+"\n");
        System.out.printf("Ice Cream Milk    : "+ milk+"\n");
        System.out.printf("Ice Cream Topping : "+ topping+ "\n");
        System.out.printf("Ice Cream Sprinkle: "+ hasSprinkle+"\n");
        System.out.printf("Cone Flavor       : "+ specialty+"\n");

        if(iceCreamType.equals("Cone")){
            System.out.printf("Cone Flavor       : "+ specialty+"\n");
        }
        System.out.printf("Ice Cream Price   : "+ iceCreamPrice+"\n");
        System.out.println("=========================================");




//        IceCream newIceCream = ICF.generateIceCream(iceCreamID,iceCreamType,iceCreamFlavor,iceCreamPrice,milk,topping,hasSprinkle,specialty);
        m.nextStateCycle();

        System.out.println("Ice Cream ORDERED");

    }





    public static void main(String[] args) {

        new Main();
    }
}
