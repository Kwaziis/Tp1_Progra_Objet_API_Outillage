package TP_api_maven.TP1;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Secteur {
    private TypeAnimal typeAnimauxDansSecteur;
    private List<Animal> animauxDansSecteur = new ArrayList<>();

    Secteur(TypeAnimal ta){
        typeAnimauxDansSecteur=ta;
    }

    void ajouterAnimal(Animal a){
        animauxDansSecteur.add(a);
    }
    int getNombreAnimaux(){
        return animauxDansSecteur.size();
    }

    public List<Animal> getAnimauxDansSecteur() {
        return animauxDansSecteur;
    }

    public void setAnimauxDansSecteur(List<Animal> animauxDansSecteur) {
        this.animauxDansSecteur = animauxDansSecteur;
    }

    public TypeAnimal obtenirType() {
        return typeAnimauxDansSecteur;
    }
}
