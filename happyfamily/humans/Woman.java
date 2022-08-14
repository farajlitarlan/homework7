package happyfamily.humans;

import happyfamily.Family;
import happyfamily.Human;

public final class Woman extends Human {
 public void makeUp() {
  System.out.println("Belle does makeup!");

 }

 @Override
 public void greetPet() {
  System.out.println("Hello from Ms" + super.getName());
 }

 public Woman (){

 }
 public Woman(String name, String surname, int year, int iq, String[][] schedule, Family family){
  super(name,surname,year,iq,schedule,family);
 }
 public Woman(String name, String surname, int year){
  super(name,surname,year);
 }




}
