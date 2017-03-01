/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productillo;

import javax.swing.JOptionPane;

/**
 *
 * @author By Gatoman 
 */
public class Nombre extends Productos {

    public Nombre() {
    }

    public String getName() {
        nombre = JOptionPane.showInputDialog("Dame el nombre del producto");
        return nombre;
    }

    public void getCost() {
        precio = Integer.parseInt(JOptionPane.showInputDialog("Dame el precio del producto"));
        total = precio * veces;
        System.out.println("Cuesta: " + precio + " .El total a pagar es: " + total);
    }
}
