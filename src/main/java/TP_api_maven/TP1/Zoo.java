package TP_api_maven.TP1;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class Zoo {
    public int visiteurs;
    public List<Secteur> secteurAnimaux=new ArrayList();
    private int nbvisiteurMaxParSecteur;

    void ajouterSecteur(TypeAnimal ta){
        Secteur s=new Secteur(ta);
        secteurAnimaux.add(s);
    }
    void nouveauVisiteur()throws LimiteVisiteurExeption{
        this.visiteurs+=1;
    }
    int getLimiteVisiteur(){
        return nbvisiteurMaxParSecteur*secteurAnimaux.size();
    }
    void nouvelAnimal(Animal a) throws AnimalDansMauvaisSecteurException{
        for (Secteur s:secteurAnimaux){
            if (a.getTypeAnimal().equals(s.obtenirType())){
                s.ajouterAnimal(a);
            }
        }

    }
    int nombreAnimaux(){
        int nb=0;

        for (Secteur s:secteurAnimaux ){
            nb+=s.getNombreAnimaux();
        }
        return nb;
    }
}
