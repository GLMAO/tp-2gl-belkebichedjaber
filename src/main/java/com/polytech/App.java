package com.polytech;

import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;
import com.polytech.tp.Etudiant;
import com.polytech.tp.GestionnaireEmploiDuTemps;
import com.polytech.tp.Responsable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GestionnaireEmploiDuTemps a=new GestionnaireEmploiDuTemps();
        Etudiant e1=new Etudiant("Djaber");
        Responsable r1=new Responsable("issam");
        a.attach(r1);
        a.attach(e1);
        Cours cours = new CoursBuilder().setMatiere("Maths").setEnseignant("Mr. Ali").setSalle("B12").build();
        a.ajouterCours(cours);
        a.modifierCours(cours, "Heure changée à 11:00");
        Cours c = new CoursBuilder().setEnseignant("ens").setMatiere("Genie_logiciel").build();
        System.out.println(c.getDescription());


        
    }
}
