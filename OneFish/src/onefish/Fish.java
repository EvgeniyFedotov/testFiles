/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onefish;

/**
* This class represents a very simplified Fish
*/
public class Fish
{

 private int age;
 private String color;
 private boolean isAlive;

 public Fish()
 {
 age = 1;
 color = "gray";
 isAlive = true;
 }

 public void swim()
 {
 System.out.println("The " + color + " fish is swimming....");
 }

 public String getColor()
 {
 return color;
 }

 public void setColor(String c)
 {
 color = c;
 }

 public int getAge()
 {
 return age;
 }

 public void setAge(int a)
 {
 age = a;
 }

 public void die()
 {
 isAlive = false;
 }
 public boolean isAlive()
 {
 return isAlive;
 }
}

