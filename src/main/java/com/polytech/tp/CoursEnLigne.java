package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {
    CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return coursDecorated.getDescription() + " (En ligne)";
        
    }

    @Override
    public double getDuree() {
        // TODO Auto-generated method stub
        
        return coursDecorated.getDuree();
    };
}
