package com.mprog;

public interface Visitor {
    void visit (Aircraft aircraft);
    void visit (Helicopter helicopter);
}
