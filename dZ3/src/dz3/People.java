/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz3;

import java.util.Scanner;

/**
 *
 * @author Fedotov
 */
public class People {

    int age;
    String name;
    double weight;
    double length;
    double indexKetle;

    void whatIsYourName() {
        name = "Alexandr";
        System.out.println("My name is " + name);
    }

    boolean isAdult() {
        System.out.println("Please, enter my age:");
        Scanner aSc = new Scanner(System.in);
        age = aSc.nextInt();
        if (age >= 18)
        return true;
        else
            return false;
        }
        
    boolean isFat() {
        System.out.println("Please, enter my weight:");
        Scanner wLSc = new Scanner(System.in);
        weight = wLSc.nextDouble();
        System.out.println("Please, enter my length in cm:");
        length = wLSc.nextDouble();
        wLSc.close();
        indexKetle=weight/((length*length)/10000);   
        if (indexKetle >= 25)
            return true;
          else 
            return false;
    }
    
    void printAllParams(){
        System.out.println((char) 27 + "[34mSummary of Alexandr " + (char)27 
                + "[0m"); /*так получилось вывести текст "Summary of Alexandr" 
        синим цветом*/
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight, kg: " + weight);
        System.out.println("Length, cm: " + length);
        System.out.println("Body mass index: " + indexKetle);
    }   
}  
