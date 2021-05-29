package com.mprog;

public abstract class Vehicle {
    private String modelTitle;

    public Vehicle(String modelTitle) {
        this.modelTitle = modelTitle;
    }

    public abstract void Accept(Visitor visitor);

    public String getModelTitle() {
        return modelTitle;
    }

    public void setModelTitle(String modelTitle) {
        this.modelTitle = modelTitle;
    }
}