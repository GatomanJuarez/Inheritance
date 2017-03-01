/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productillo;

/**
 *
 * @author By Gatoman ("Jesus Antonio")
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Nombre uno = new Nombre();
        String jeje = uno.getName();
        System.out.println("El producto es: " + jeje);
        Nombre dos = new Nombre();
        dos.getCost();

    }
}
