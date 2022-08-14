package happyfamily.pets;


import happyfamily.Species;
import happyfamily.abstracts.Pet;
import happyfamily.abstracts.Foul;


public class DomesticCat extends Pet implements  Foul{

    public DomesticCat() {
        super.setSpecies(Species.DOMESTICCAT);
    }

    public DomesticCat ( String nickName, int age, int trickLevel, String[] habits) {
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.DOMESTICCAT);
    }
    @Override
    public void respond() {

    }
    @Override
    public void foul() {

    }
}
