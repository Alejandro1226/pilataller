/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import java.util.LinkedList;

/**
 *
 * @author usuario
 * @param <T>
 */
public class Pila <T extends basep>  {
    private LinkedList<T> elemsp;
    
    public Pila() {
        elemsp = new LinkedList<>();
    }
    
    //METODOS
    
    public void apilar(T elem) {
//        elemsp.addFirst(elem);
//        
//        
        elemsp.push(elem);
    }

    public T desapilar() {
//        return elemsp.removeLast();
          return elemsp.pop();
    }

    public boolean estaVacia() {
        return elemsp.isEmpty();
    }

   @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("[");
        for (T e : elemsp)
        {
            sb.append(" ").append(e.toString());
        }
        sb.append("]");
        
        return sb.toString();
        
    }
    
}
