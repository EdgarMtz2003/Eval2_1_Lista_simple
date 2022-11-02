/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eval2_1_Lista_simple;

import sun.util.logging.PlatformLogger;

/**
 *
 * @author moviles
 */
public class Eval2_1_Lista_simple {
    public static void main(String[] args) {
        Lista miLista = new Lista();
        
        System.out.println("cantidad de nodos: "+ miLista.tamaLista());
        miLista.add(10); //0
        miLista.add(20); //1
        miLista.add(30); //2 // aqui debe que quedar temp
        miLista.add(40); //3 <------Insercion
        miLista.add(50); //4
        miLista.add(60); //5
        System.out.println("cantidad de nodos: "+ miLista.tamaLista());
        miLista.imprimir();
        try{
        miLista.insertarEn(70, 3);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        
        miLista.imprimir();
        try{
            miLista.borrarEn(0);
        }catch (Exception ex){
            
        }
        System.out.println("cantidad de nodos: "+ miLista.tamaLista());
        miLista.add(80);
        miLista.imprimir();
        /*
        miLista.imprimir();
        miLista.vaciarLista();
        miLista.imprimir();
        */
        
       /*
       // miLista.imprimir();        
       //int[]arreglo = new int [1000000];
        for (int i = 0; i < 1000000; i++) {
            //arreglo[i]=1000;
            miLista.add(1000);
        }
        System.out.println("conteo de nodos: "+miLista.tamaLista());
        */
    }
    
}
