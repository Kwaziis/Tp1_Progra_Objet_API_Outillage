package TP_api_maven.TP1;

public class Animal {
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
}
