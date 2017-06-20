/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onefish;

import java.util.ArrayList;

/**
 *
 * @author GIP
 */
public class OneFish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Using a loop, create an ArrayList called school of 20 anonymous Fish
objects. Then loop through and set the color to “blue” for each of them.*/
        ArrayList<Fish> school = new ArrayList<Fish>();
        for (int i = 0; i < 20; i++) {
            school.add(i, new Fish());
            school.get(i).setColor("blue");
        }
        
        /*Set the Fish in position 8 to have the color “green” and then tell it to
swim using an object reference variable.*/
        school.get(8).setColor("green");
        school.get(8).swim();
        
        /*Create a new fish object and refer to it with a reference variable. Add it
to the end of the ArrayList using its reference variable*/
        Fish fish = new Fish();
        school.add(20, fish);
        
        /*Remove a fish from the end of the ArrayList and store the reference to it
in a variable called Nemo.*/
        Fish Nemo;
        Nemo = school.remove(20);
        
        /*Choose new colors for the Fish in positions 2 3 7 14 17 and set them.*/
        school.get(2).setColor("color1");
        school.get(3).setColor("color2");
        school.get(7).setColor("color3");
        school.get(14).setColor("color4");
        school.get(17).setColor("color5");
        
        /*Add 3 more Fish. Add one to the end, one to the beginning, and one
anywhere in the middle of the list.*/
        school.add(school.size(), fish);
        school.add(0, fish);
        school.add(school.size() / 2, fish);
        
        /*Print out the number of Fish in the list.*/
        System.out.println("number of Fish in the list school - " + school.size());
        
        /*Loop through and set all of their ages to a random int from 0 to 59 using
(int) (Math.random() * 60)*/
        for (int i = 0; i < school.size(); i++) {
            school.get(i).setAge((int) (Math.random() * 60));
        }
        
        /*Remove 5 Fish.*/
        for (int i = 1; i <= 5; i++) {
            school.remove(i);
        }
        
        /*Loop through and print colors and ages of all Fish.*/
        for (int i = 0; i < school.size(); i++) {
            System.out.println("Color fish " + (i + 1) + " - " + school.get(i).getColor()
                    + ", its age - " + school.get(i).getAge());
        }
        
        /*Loop through and make it so Fish over 40 have died (do not remove
them from the list)*/
        for (int i = 0; i < school.size(); i++) {
            if (school.get(i).getAge() > 40) {
                school.get(i).die();
            }
        }
        
        /*Loop through and print colors and ages of all Fish who are alive.*/
        System.out.println("!!!List of all Fish who are alive!!!");
        for (int i = 0; i < school.size(); i++) {
            if (school.get(i).isAlive()) {
                System.out.println("Color fish " + (i + 1) + " - " + school.get(i).getColor()
                        + ", its age - " + school.get(i).getAge());
            }
        }
        
        /*Loop through and print colors and ages of the Fish who have died.*/
        System.out.println("!!!List of all Fish who have died!!!");
        for (int i = 0; i < school.size(); i++) {
            if (!school.get(i).isAlive()) {
                System.out.println("Color fish " + (i + 1) + " - " + school.get(i).getColor()
                        + ", its age - " + school.get(i).getAge());
            }
        }
        
        /*Create a new arraylist called theGreatBeyond Loop through school and
now remove all Fish who have died from school and add them to the
list called theGreatBeyond. Add 5 more anonymous fish objects to the
list. BE CAREFUL NOT TO SKIP ANY DEAD FISH!*/
        ArrayList<Fish> theGreatBeyond = new ArrayList<Fish>();
        for (int i = 0; i < school.size(); i++) {
            if (!school.get(i).isAlive()) {
                theGreatBeyond.add(school.get(i));
            }
        }
        for (int i = 0; i < school.size(); i++) {
            if (!school.get(i).isAlive()) {
                school.remove(i);
            }
        }
        System.out.println("Проверка, что все умершие рыбки поплыли в theGreatBeyond");
        for (int i = 0; i < theGreatBeyond.size(); i++) {
            System.out.println(theGreatBeyond.get(i).getAge());
        }
        for (int i = 1; i <= 5; i++) {
            theGreatBeyond.add(fish);
        }
        
        /*Create a new Shark object and store a reference to it in an object reference
variable called jaws.*/
        Shark jaws = new Shark();
        
        /*Loop through the list school and have jaws eat all the blue fish in the school
list. Do not remove them just set them to not be alive.*/
        for (int i = 0; i < school.size(); i++) {
            if (school.get(i).getColor().equals("blue")) {
                jaws.eat(school.get(i));
            }
            if (school.get(i).isAlive()) {
                System.out.println("Цвет, оставшейся в живых рыбки № " + (i + 1) + " - "
                        + school.get(i).getColor());
            }
        }
        
        /*Using Math.random() as you did in #8 add 5 new shark objects to random
locations in the list school.*/
        for (int i = 1; i <= 5; i++) {
            System.out.println((int) (Math.random() * i));
            school.add((int) (Math.random() * i), new Shark());
        }
        
        /*Loop through the list school and print the color of all fish again. Do you need
to cast if you encounter a shark in the list?*/
        System.out.println("!!!color of all fish again!!!");
        for (int i = 0; i < school.size(); i++) {
            System.out.println("Color fish " + (i + 1) + " - " + school.get(i).getColor());
        }
        
        /*Loop the list school and use instanceof to determine the Sharks. Print "shark"
when you encounter a shark and print "fish" otherwise.*/
        System.out.println("!!!Разделение рыб!!!");
        for (int i = 0; i < school.size(); i++) {
            if (!school.get(i).getClass().equals(fish.getClass())) {
                System.out.println("Рыбка - !Акула");
            } else {
                System.out.println("Рыбка - рыбка");
            }
        }
        
        /*Loop the list school if you encounter a shark create a new anonymous Fish for
it to eat and feed it to it. You will need instanceof again - why?*/
        for (int i = 0; i < school.size(); i++) {
            if (!school.get(i).getClass().equals(fish.getClass())) {
                jaws.eat(new Fish());
            }
        }
    }
}
