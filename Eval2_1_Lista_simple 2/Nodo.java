/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package Eval2_1_Lista_simple;
/**
 *
 
 * @author moviles
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;
    
    // por default, un nuevo nodo va al final de la lista
    //el final de la lista se indica con null
      
    public Nodo(){
        this.siguiente=null;
        
    }
    public Nodo( int valor){
        this.valor=valor;
        this.siguiente=null;
    }
    
    
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int valor){
        this.valor=valor;
        
    }
    
    public Nodo getsiguiente(){
        return siguiente;
    }
    
    public void setsiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }
    
}
