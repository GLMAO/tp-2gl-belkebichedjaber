package com.polytech.tp;

public abstract class CoursDecorator implements ICours {
    protected ICours coursDecorated;

    public CoursDecorator(ICours cours) {
        this.coursDecorated = cours;
    }
    public String getDescription() {
        return coursDecorated.getDescription();
    }
     public double getDuree() {
        return coursDecorated.getDuree();
    }
    
    // TODO: Forcer l'implémentation des méthodes de ICours
}