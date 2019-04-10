/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


/**
 *
 * @author PC
 */
public class JavaApplication1 {


    public static void main(String[] args) {
       
      FuncionesEstaticas.Saludar();
       
      FuncionesEstaticas.SaludarConNombre("Lucas Matias");
    
      FuncionesEstaticas.SaludarConNombreYApellido("Lucas Matias", "Correa");
      
      FuncionesEstaticas.SaludarConNombreYEdad("Lucas Matias",20);
      
      FuncionesEstaticas.SumarSinRetorno(10, 5);
      
      FuncionesEstaticas.SumarConRetorno(10, 20);
      
      FuncionesEstaticas.Promedio(10, 10, 7);
      
    }
    
    
    
    
}
