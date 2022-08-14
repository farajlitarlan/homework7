package happyfamily.pets;


import happyfamily.abstracts.Pet;
import happyfamily.abstracts.Foul;
import happyfamily.Species;



public class RoboCat extends Pet  implements Foul{



    public RoboCat(){
        super.setSpecies(Species.ROBOCAT);

    }
    public RoboCat( String nickName, int age, int trickLevel, String[] habits){
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.ROBOCAT);
    }


    @Override
    public void foul() {

    }

    @Override
    public void respond() {

    }
}
