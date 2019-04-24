/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartuchera;

/**
 *
 * @author PC
 */
public class CARTUCHERA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        boligrafo uno = new boligrafo();
        boligrafo dos = new boligrafo("bic");
        
        dos.tuTinta.color =("Rojo");
        
        System.out.println("El color es: "+dos.tuTinta.color);
        */
           boligrafo tres = new boligrafo("bic","rojo",100);
             tres.Escribir("rojo", 50);
       
       
        
        if(tres.Escribir("azul", 20)==1)
        {
            System.out.println("exito");
        }else
        {
            System.out.println("nop");
        }
         if(tres.Escribir("rojo", 20)==1)
        {
            System.out.println("exito");
        }else
        {
            System.out.println("nop");
        }
          if(tres.Escribir("rojo", 200)==1)
        {
            System.out.println("exito");
        }else
        {
            System.out.println("nop");
        }
         System.out.println("quedo :" + tres.tuTinta.Cantidad);
         tres.recargar(170);
            if(tres.Escribir("rojo", 200)==1)
        {
            System.out.println("exito");
        }else
        {
            System.out.println("nop");
        }
         System.out.println("quedo :" + tres.tuTinta.Cantidad);
    }
    
}
