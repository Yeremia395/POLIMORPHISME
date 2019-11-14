/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_polimorphisme;

/**
 *
 * @author Yeremia Rizky
 */
public class Aeroplan extends Vehicle {
    public void walk (){
        System.out.println("Aeroplan is flying");
    }
    public static void main(String[] args) {
        Aeroplan garuda = new Aeroplan ();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
