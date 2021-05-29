package com.mprog;

public class Aircraft extends Vehicle{
    public Aircraft(String modelTitle) {
        super(modelTitle);
    }
    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}
