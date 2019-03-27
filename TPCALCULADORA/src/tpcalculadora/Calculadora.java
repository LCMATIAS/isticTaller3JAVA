

package tpcalculadora;


import java.util.Scanner;
public class Calculadora {
    
    
  private static void sumar(){
     System.out.println("Estoy Sumando");    
     int NumeroUno;
     int NumeroDos;
     int Suma;
             
     Scanner lector;
     lector = new Scanner(System.in);
     
     System.out.println("Ingrese Primer Numero:");
     NumeroUno = lector.nextInt();
     
     System.out.println("Ingrese Segundo Numero:");
     NumeroDos = lector.nextInt();
     
     Suma = NumeroUno + NumeroDos;
     System.out.println("La suma es:"+Suma);
     
     
      }
  
  public static int sumarConRetorno(){
      
     System.out.println("Estoy Sumando");    
     int NumeroUno;
     int NumeroDos;
     int Suma;
             
     Scanner lector;
     lector = new Scanner(System.in);
     
     System.out.println("Ingrese Primer Numero:");
     NumeroUno = lector.nextInt();
     
     System.out.println("Ingrese Segundo Numero:");
     NumeroDos = lector.nextInt();
     
     Suma = NumeroUno + NumeroDos;
     //System.out.println("La suma es:"+Suma);
     return Suma;
    }
   
  public static int SumarconParanetro(int parametro1,int parametro2){
     
      int Suma;
      Suma = parametro1 + parametro2;
      return Suma;
  }
  
  public static int restarconParanetro(int parametro1,int parametro2){
     
      int Resta;
      Resta = parametro1 - parametro2;
      return Resta;
  }
  
  
  
  
  
  
  
}//Fin
