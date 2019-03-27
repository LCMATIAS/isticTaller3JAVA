
package tpcalculadora;

import java.util.Scanner;

public class TPCALCULADORA {

   
    public static void main(String[] args) {
        
        int PrimerValor;
        int SegundoValor;
        int Respuesta;
        
        Scanner lector;
        lector = new Scanner(System.in);
    
        
        System.out.println("Ingrese Primer Numero:");
        PrimerValor = lector.nextInt();
        
        System.out.println("Ingrese Segundo Numero:");
        SegundoValor = lector.nextInt();
    System.out.println("----------  ---------  ---------");
    
        Respuesta =Calculadora.SumarconParanetro(PrimerValor, SegundoValor);
        System.out.println("La suma es:"+Respuesta);
        
        
        System.out.println("-------------------");
        
              Respuesta =Calculadora.restarconParanetro(PrimerValor, SegundoValor);
        System.out.println("La Resta es:"+Respuesta);
        
    
    
    }
    
    
        
        
       /*
        Calculadora.sumar();
        int resultado = Calculadora.sumarConRetorno();
        System.out.println("La suma con Retorno es:"+resultado);
        
       resultado = Calculadora.SumarconParanetro(33,33);
                System.out.println("La suma con Parametros es:"+resultado);
        /*
        System.out.println("Hola");
        Scanner lector;
        lector = new Scanner(System.in);
        int edad;
        edad = lector.nextInt();
        System.out.println("La edad es"+edad);
      */
        
    }
   
}
