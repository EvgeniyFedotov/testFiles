/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz3;

/**
 *
 * @author Fedotov
 */
public class DZ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        People classPeople = new People();
        classPeople.whatIsYourName();
        
        if(classPeople.isAdult())
            System.out.println("Give me my beer, please");
        else
            System.out.println("I'm not an adult yet");
        
        if(classPeople.isFat())
            System.out.println("I am hungry. Give me an apple. "
                    + "I need to lower my body mass index - " 
                    +classPeople.indexKetle);
        else
           System.out.println("I am hungry. Give me a piece of pizza. "
                    + "My body mass index - " 
                    +classPeople.indexKetle + " is Ok!");
        
        classPeople.printAllParams();
    }
}
