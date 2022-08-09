/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Productos;
import modelo.Pila;

/**
 *
 * @author yulean.alvarez
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila<Productos> pilap=new Pila<>();
        pilap.apilar(new Productos("arroz", 2, 5000));
        pilap.apilar(new Productos("tomate", 2, 5000));
        pilap.apilar(new Productos("platano", 2, 5000));
        pilap.apilar(new Productos("atun", 2, 5000));
        pilap.apilar(new Productos("Panal de huevo", 2, 5000));
        
        System.out.println("Pila\n"+pilap.toString());
        
        pilap.desapilar();
        System.out.println("Pila\n"+pilap.toString());  
    }
    
}
