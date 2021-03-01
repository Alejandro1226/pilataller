/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;



import datosp.Lanzamiento;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author usuario
 */
public class OperacionesPila {
    
    
        public static <T extends basep> Pila<T> duplicarpila(Pila<T> pilaOriginal){
        Pila<T> duplicada =new Pila<>();
        Pila<T> pilaAux =new Pila<>();
        
        while (!pilaOriginal.estaVacia()) {            
            pilaAux.apilar( pilaOriginal.desapilar());
        }
        
        while (!pilaAux.estaVacia()) {            
            T temporal=pilaAux.desapilar();
            T temporal2=(T)temporal.copia();
            pilaOriginal.apilar(temporal);
            duplicada.apilar(temporal2);
        }
        
        return duplicada;
        
    
        }
        
            public static <T extends basep> Pila<T> obtenerImpare(Pila<T> colaOriginal){
         Pila<T> colaimparesp=new Pila<>();
         Pila<T> coladuplicadap=duplicarpila(colaOriginal);
         
         while (!coladuplicadap.estaVacia()) {             
            T elemento=coladuplicadap.desapilar();
             Lanzamiento objp2=(Lanzamiento)elemento;
             
//            if(objp2.getPrecio()%2!=0){
//                colaimparesp.apilar(elemento);
//            }
         }
         
         
         return colaimparesp;
         
     }
//        public static <T extends basep> Pila<T> obtenerCosto (Pila<T> colaOriginal){
//         Pila<T> pilamenores30000=new Pila<>();
//         Pila<T> coladuplicadap=duplicarpila(colaOriginal);
//         
//          while (!coladuplicadap.estaVacia()) {             
//            T elemento=coladuplicadap.desapilar();
//             alimento objALIMENTO2=(alimento)elemento;
//             
//            if(objALIMENTO2.getCosto()<30000){
//                pilamenores30000.apilar(elemento);
//            }
//         }
//         
//         
//         return pilamenores30000;
//         
//     }
//                public static <T extends basep> Pila<T> obtenerPrecio (Pila<T> colaOriginal){
//         Pila<T> pilamenoresp30000=new Pila<>();
//         Pila<T> coladuplicadap=duplicarpila(colaOriginal);
//         
//          while (!coladuplicadap.estaVacia()) {             
//            T elemento1 =coladuplicadap.desapilar();
//             producto objPRODUCTO2=(producto)elemento1;
//             
//            if(objPRODUCTO2.getPrecio()<30000){
//                pilamenoresp30000.apilar(elemento1);
//            }
//         }
//         
//         
//         return pilamenoresp30000;
//         
//     }
        public static  <T extends basep> Pila<T> invierte( Pila<T> colaOriginal) {
            Pila <T> nueva =duplicarpila(colaOriginal);;
     
            while( ! colaOriginal.estaVacia()) {
            nueva.apilar(colaOriginal.desapilar());
            }
            return nueva;
}
            
            
}
