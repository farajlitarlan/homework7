package happyfamily.pets;


import happyfamily.abstracts.Pet;
import happyfamily.Species;

public class Fish extends Pet {

    public Fish(){
        super.setSpecies(Species.FISH);

    }
    public Fish( String nickName, int age, int trickLevel, String[] habits){
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.FISH);
    }

    @Override
    public void respond() {

    }
}
