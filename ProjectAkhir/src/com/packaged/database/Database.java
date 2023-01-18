package com.packaged.database;

import com.packaged.iceCream.IceCream;

import java.util.ArrayList;

public class Database {
    private ArrayList<IceCream> iceCreams = new ArrayList<>();

    public static Database data;

    public static Database getData(){
        if(data == null){
            data = new Database();
        }
        else{

        }
        return data;
    }

    public ArrayList<IceCream> getIceCreams() {
        return iceCreams;
    }

    public void setIceCreams(ArrayList<IceCream> iceCreams) {
        this.iceCreams = iceCreams;
    }

    public void addIceCream(IceCream iceCream){
        iceCreams.add(iceCream);
    }

    public void deleteIceCream(int index){
        iceCreams.remove(index);
    }
}
