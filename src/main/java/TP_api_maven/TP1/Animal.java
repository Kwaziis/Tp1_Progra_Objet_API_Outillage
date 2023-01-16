package TP_api_maven.TP1;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class Animal {
    private static final Logger logger = LogManager.getLogger(Animal.class);
    private String nomAnimal;
    private TypeAnimal typeAnimal;

    /*TP_api_maven.TP1.Animal(String nom,TP_api_maven.TP1.TypeAnimal ta){
        nomAnimal=nom;
        typeAnimal=ta;
    }*/

    public String getNomAnimal(){
        return nomAnimal;
    }

    public TypeAnimal getTypeAnimal() {
        return typeAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        logger.trace("nom ajoute");
        this.nomAnimal = nomAnimal;
    }

    public void setTypeAnimal(TypeAnimal typeAnimal) {
        this.typeAnimal = typeAnimal;
    }
}
