
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
    
}
