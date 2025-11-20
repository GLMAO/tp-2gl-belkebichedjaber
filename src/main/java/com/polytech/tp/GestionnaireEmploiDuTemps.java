package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observateurs = new ArrayList<>();
    public void attach(Observer o) {
        observateurs.add(o);
    }
     public void detach(Observer o) {
        observateurs.remove(o);
    }
     public void notifyObservers(String message) {
        for (Observer o : observateurs) {
            o.update(message);
        }
    }


    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        notifyObservers("Nouveau cours ajouté : " + cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        notifyObservers("Modification du cours : " + cours.getDescription() + " -> " + message);
        // TODO: Notifier les observateurs ici aussi
    }

    public void setChangement(String string) {
        // TODO Auto-generated method stub
        System.out.println("Changement détecté : " + string);
        notifyObservers(string);
    }
}