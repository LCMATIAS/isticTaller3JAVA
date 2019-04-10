package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class FuncionesEstaticas{
    
    public static void Saludar(){
    
            System.out.println("Bienvenido a Java");
    
    
}
    public static void SaludarConNombre(String Nombre){
        
       
        System.out.println("Bienvenido  "+Nombre+" a Java");
              
        
    }
  
    public static void SaludarConNombreYApellido(String Nombre, String Apellido){
        
        System.out.println("Su nombre es "+Nombre+" y "+ Apellido+" es su apellido");
        
        
        
    }
    
    public static void SaludarConNombreYEdad(String Nombre, int Edad){
        
        System.out.println("Usted se llama "+Nombre+" y tiene "+Edad+" años de edad");
        
        
    }
    
    public static void SumarSinRetorno(int Numero1, int Numero2){
        
        System.out.println("La suma es: "+(Numero1 + Numero2));
        
    }
    
    public static int SumarConRetorno(int Numero1, int Numero2){
        
        int Resultado;
        
        Resultado = Numero1 + Numero2;
        
        return Resultado;
                
        
        
    }
         
    
    public static int Promedio(int NumeroUno, int NumeroDos, int NumeroTres){
        
        int Promedio;
        
        Promedio = NumeroUno + NumeroDos + NumeroTres;
        
        return Promedio;
        
    }
            
}
