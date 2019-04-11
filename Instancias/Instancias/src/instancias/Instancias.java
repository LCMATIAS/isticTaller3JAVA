/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

/**
 *
 * @author PC
 */
public class Instancias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Calculadora UnCal = new Calculadora();
       UnCal.NumeroUno = 10;
       UnCal.NumeroDos = 15;
       UnCal.Sumar();
       
        System.out.println("La suma es " +UnCal.Resultado);
        
    }
    
    
}
