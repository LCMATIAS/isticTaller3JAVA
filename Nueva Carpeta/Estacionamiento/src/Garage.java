
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */


public class Garage {
    public String listadoAuto;
    public String listadoAutoFacturado;
    
    
    
    public static void IngresarAuto(Auto unAuto) throws IOException{
        System.out.println(unAuto.patente);
        // Trabaja sobre el run time y no para la maquina / archivos para escribir
          FileWriter Archivo;
          Archivo = new FileWriter("Estacionados.txt",true);
          PrintWriter Escritor;
          Escritor = new PrintWriter(Archivo);
          Escritor.println(unAuto.patente);
          Archivo.close();
    
    }
    
    public static ArrayList retornarListado() throws IOException{
        ArrayList ArrayRetorno = new ArrayList();
        File Archivo = new File("Estacionados.txt");
     
         FileReader lector;
        try {
            lector = new FileReader(Archivo);
            BufferedReader bf = new BufferedReader(lector);
         String Renglon;
         while((Renglon = bf.readLine())!= null)
         {
             System.out.println(Renglon);
             ArrayRetorno.add(Renglon);
             
         }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmListado.class.getName()).log(Level.SEVERE, null, ex);
            
        }
         
    return ArrayRetorno;
    }
      
    
}
