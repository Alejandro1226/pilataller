/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosp;

import pila.basep;

/**
 *
 * @author usuario
 */
public class Lanzamiento extends basep{


        private int valor1;
        private int valor2;

    public Lanzamiento() {
    }

    public Lanzamiento(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
        
        

    /**
     * Get the value of valor1
     *
     * @return the value of valor1
     */
    public int getValor1() {
        return valor1;
    }

    /**
     * Set the value of valor1
     *
     * @param valor1 new value of valor1
     */
    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    

    /**
     * Get the value of valor2
     *
     * @return the value of valor2
     */
    public int getValor2() {
        return valor2;
    }

    /**
     * Set the value of valor2
     *
     * @param valor2 new value of valor2
     */
    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    
    @Override
    public String toString() {
        return "Lanzamiento{" + "valor1=" + valor1 + ", valor2=" + valor2 + '}';
    }
    


    
    
    
    @Override
    public basep copia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
