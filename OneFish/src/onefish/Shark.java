/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onefish;

/**
 *
 * @author GIP
 */
public class Shark extends Fish
{

 /**
 * Constructor for objects of class Fish
 */
 public Shark()
 {
super();
 }
 //methods

 public void eat(Fish victim)
 {
 victim.die();
 }
}
