package TP_api_maven.TP1;

import java.util.ArrayList;

public class Secteur {
    private TypeAnimal typeAnimauxDansSecteur;
    private ArrayList animauxDansSecteur = new ArrayList<Animal>();

    Secteur(TypeAnimal ta){
        typeAnimauxDansSecteur=ta;
    }

    void ajouterAnimal(Animal a){
        animauxDansSecteur.add(a);
    }
    int getNombreAnimaux(){
        return animauxDansSecteur.size();
    }

    public TypeAnimal obtenirType() {
        return typeAnimauxDansSecteur;
    }
}
