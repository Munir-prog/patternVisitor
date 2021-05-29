package com.mprog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> arr = new ArrayList<>();

        arr.add(new Aircraft("Boeing"));
        arr.add(new Helicopter("Mi-128"));
        arr.add(new Aircraft("Jet-007"));
        arr.add(new Helicopter("TY-555"));

        Visitor visitor = new VehicleVisitor();

        for(Vehicle a:arr){
            a.Accept(visitor);
        }
    }
}
