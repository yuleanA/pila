/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yulean.alvarez
 */
public class OperacionesPila {
    
    
     public static <T extends Base> Pila<T> duplicarPila(Pila<T> pilaOriginal){
        Pila<T>Piladuplicada=new Pila<>();
        Pila<T>Pilaauxiliar=new Pila<>();
        
        while (!pilaOriginal.estaVacia()) {
            T elemento=pilaOriginal.desapilar();
            Pilaauxiliar.apilar(elemento);
     
        }
        while (!Pilaauxiliar.estaVacia()) {
            T elemento=Pilaauxiliar.desapilar();
            T copielemento= (T) elemento.copy();
            pilaOriginal.apilar(elemento);
            Piladuplicada.apilar(copielemento);
        }
        return Piladuplicada;
        
}
    public static <T extends Base> Pila <T> invertirPila(Pila<T> PilaOriginal){
        
        Pila<T> pilaInvertida = new Pila<>();
        Pila<T> piladuplicada =  duplicarPila(PilaOriginal);
        
        while (!piladuplicada.estaVacia()){
            T elemento = piladuplicada.desapilar();
            pilaInvertida.apilar(elemento);
        }
        return pilaInvertida;
    } 
}
