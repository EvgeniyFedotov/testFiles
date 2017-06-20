/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20170118_dz2;

import java.util.Scanner;

/**
 *
 * @author GIP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку 1:");
        String s1 = sc.nextLine();
        System.out.println("Введите строку 2:");
        String s2 = sc.nextLine();

        int feelDifference = s1.length() > s2.length()
                ? s1.length() - s2.length() : s2.length() - s1.length();
        System.out.println("Разница двух строк составляет - " + feelDifference);
        if(s1.length() - s2.length()>0){
            System.out.println("Строка 1 больше строки 2!");
        }
        else if(s1.length() - s2.length()==0){
            System.out.println("Строки равны!");
        }
        else /*if(s1.length() - s2.length()<0)*/{
            System.out.println("Строка 1 меньше строки 2!");
        }
    }
}
