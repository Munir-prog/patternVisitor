package com.mprog;

public class Helicopter extends Vehicle{

    public Helicopter(String modelTitle){
        super(modelTitle);
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}
