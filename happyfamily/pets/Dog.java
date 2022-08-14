package happyfamily.pets;

import happyfamily.Species;
import happyfamily.abstracts.Pet;
import happyfamily.abstracts.Foul;



public class Dog extends Pet implements Foul {


        public Dog() {
            super.setSpecies(Species.DOG);
        }

        public Dog ( String nickName, int age, int trickLevel, String[] habits) {
            super(nickName, age, trickLevel, habits);
            super.setSpecies(Species.DOG);
        }


    @Override
    public void respond() {

    }
        @Override
        public void foul() {

        }
}
