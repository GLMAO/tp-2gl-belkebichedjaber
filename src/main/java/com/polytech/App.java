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
        Etudiant eleve=new Etudiant("belkebiche");
        Responsable prof=new Responsable("merzougi");
        a.attach(prof);
        a.attach(eleve);
        Cours cours = new CoursBuilder().setEnseignant("mohamed").setSalle("B42").build();
        a.ajouterCours(cours);
        a.modifierCours(cours, "Heure changée à 14:00");
        Cours c = new CoursBuilder().setEnseignant("ens").setMatiere("Genie_logiciel").build();
        System.out.println(c.getDescription());


        
    }
}
