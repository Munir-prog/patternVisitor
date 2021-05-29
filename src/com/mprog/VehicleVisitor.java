package com.mprog;

public class VehicleVisitor implements Visitor {
        @Override
        public void visit(Aircraft aircraft) {
            System.out.println("Самолет модели: " + aircraft.getModelTitle());
        }
        @Override
        public void visit(Helicopter helicopter) {
            System.out.println("Вертолоет модели: " + helicopter.getModelTitle());
        }
}
