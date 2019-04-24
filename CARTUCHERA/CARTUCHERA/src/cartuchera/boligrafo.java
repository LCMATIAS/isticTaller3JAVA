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
public class boligrafo {
    String Marca;
    tinta tuTinta;
    
    private boligrafo(){
        this.tuTinta = new tinta(); 
       // System.out.println("por defecto");
    }
    
    public boligrafo(String Marca){
       
        //this.tuTinta = new tinta(); 
        this();
        this.Marca = Marca;   
        // System.out.println("con marca");
    }
    public boligrafo(String Marca,String color,int cantidad){ 
         
        this(Marca);
        this.tuTinta.color=color;
        this.tuTinta.Cantidad=cantidad;    
        
       // System.out.println("todi");
    }
    
    public int Escribir(String color,int cantidad)
    {
        int retorno=0;
        if(this.tuTinta.color==color)
        {
            if(this.tuTinta.Cantidad> cantidad)
                {                    
                    retorno=1;
                    this.tuTinta.Cantidad=this.tuTinta.Cantidad-cantidad;
                }           
        }
        return retorno;
    }
    public void recargar(int cantidad)
   {
       this.tuTinta.Cantidad=this.tuTinta.Cantidad +cantidad;
   }
    
    public void reciclar(String color,int cantidad)
    {
        
    }
}

