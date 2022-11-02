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
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    private int cont;
    
    //por default el nodo esta vacio
    public Lista(){
        this.inicio=null; //no hay nodos en la lista
        this.fin=null;
        this.cont=0;
    }
    
    public boolean listaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    
    
    public void imprimir(){
        if(inicio==null){
            System.out.println("Lista vacia");
        }else{
        Nodo temp=inicio;
        //como muevo al temp?
        while(temp != null){
            System.out.print(temp.getValor()+" - ");
                temp=temp.getsiguiente();
    }
            System.out.println("");
        }
        
    }
    
    //agregar un nodo al final de la lista 
    //Solucion 1: 0(N°)
    public void add(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        
        //verificar si hay nodos en la lista
        if(inicio==null){ // no hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }else{ //si hay nodos en la lista
            //hay que movernos por la lista usando un nuevo temporal
            //hasta el ultimo nodo de la lista.
            /*Nodo temp=inicio;
            //¿como muevo a temp?
            while(temp.getsiguiente() !=null){
                temp=temp.getsiguiente();
                
            }
            temp.setsiguiente(nuevoNodo);*/
            fin.setsiguiente(nuevoNodo);
            fin= nuevoNodo;
    
    }
       this.cont++; 
}
     public int tamaLista(){
         /*int cont =0;
         Nodo temp=inicio;
        //como muevo al temp?
        while(temp !=null){
            cont++;
                temp=temp.getsiguiente();
    }*/
        return this.cont;
     }
     
     public void insertarEn (int valor, int pos) throws Exception{
         // ¿que debemos validar?
         //insertar en una posicion no válida
         
         
         int cantNodos=tamaLista();
         if(pos < 0){ //posiciones negativas
             throw new Exception("No puede inserterse un nodo en una posicion negativa");
         }else if(pos >= cantNodos){ //posisiones mayores a la cantidad de elementos
             throw new Exception(pos+" no es una posicion valida de la lista");
         }else{
             Nodo nuevoNodo = new Nodo(valor);
             if(pos == 0){ // insertar al inicio de la lista
                 nuevoNodo.setsiguiente(inicio);
                 inicio = nuevoNodo;
             }else{
                   Nodo temp=inicio;
                   int cont =0;
                   //como muevo al temp?
                   while(cont <(pos- 1)){
                       temp=temp.getsiguiente();
                       cont++;
              
                   }
                   //Y ahora??
                   nuevoNodo.setsiguiente(temp.getsiguiente());
                   temp.setsiguiente(nuevoNodo);

             }
             this.cont++;
             
         }
     }
     public void vaciarLista(){
         inicio=null;
         fin=null;
         
     }
     public void borrarEn(int pos) throws Exception{
         int cantNodos = tamaLista();
         
         if(pos < 0){ //posiciones negativas
             throw new Exception("No puede inserterse un nodo en una posicion negativa");
         }else if(pos >= cantNodos){ //posisiones mayores a la cantidad de elementos
             throw new Exception(pos+" no es una posicion valida de la lista");
         }else{
             // piensen como programarores:
             //que puede salir mal si:
             if(cantNodos == 1){
                 vaciarLista();
             }else{
                 // borrar el primer nodo (LISTO)
                 // borrar nodo intermedio
                 // borrar el ultimo nodo
                 if(pos == 0){
                     inicio.setsiguiente(inicio);
                 }else{
                     Nodo temp=inicio;
                     int cont =0;
                     while(cont <(pos- 1)){
                       temp=temp.getsiguiente();
                       cont++;
              
                   }
                     // ya estoy en el nodo previo
                     Nodo objSig = temp.getsiguiente();
                     temp.setsiguiente(objSig.getsiguiente());
                     if(pos == cantNodos - 1){ //reconectar a fin
                         fin = temp;
                     }
                 }
                 this.cont++;
             }
         }
     }
     public int obtenValorEn(int pos) throws Exception{
         int cantNodos = tamaLista();
         int valor = 0;
         
         if(pos < 0){ //posiciones negativas
             throw new Exception("No puede inserterse un nodo en una posicion negativa");
         }else if(pos >= cantNodos){ //posisiones mayores a la cantidad de elementos
             throw new Exception(pos+" no es una posicion valida de la lista");
         }else{
             Nodo temp = inicio;
             int cont=0;
             while(cont < pos){
                 temp = temp.getsiguiente();
                 cont++;
             }
             valor = temp.getValor();
             
         }
         return valor;
     }
     
}
