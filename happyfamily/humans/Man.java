package happyfamily.humans;

import happyfamily.Family;
import happyfamily.Human;

public final class Man extends Human {

    public void sport(){
        System.out.println("Jack does sport!");
    }

    @Override
    public void greetPet() {
        System.out.println("Hello from Mr." + super.getName());
    }

    public Man () {
    }
    public Man(String name, String surname, int year, int iq,  String[][] schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    public Man(String name, String surname, int year, Human father, Human mother) {
        super(name, surname, year, mother, father);
    }
}
