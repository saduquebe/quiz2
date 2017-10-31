/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Agregar {
    public void Leer(String nombre){
        try {
            Scanner in= new Scanner(new File(nombre+".svc"));
            in.useDelimiter(",");
            String artista=in.next();
            int obras= in.nextInt();
            for (int i = 0; i < obras; i++) {              
            String nombreobra=in.next();
            String estilo= in.next();
            String tecnica= in.next();
            double precio= in.nextInt();
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("NO EXISTE EL ARCHIVO");     
        }
       
    }
    public void Escribir(String nombre){
        PrintStream print;
        File archivo= new File(nombre+".svc");
        if(archivo.exists()){

        }
        else{
            try {
                archivo.createNewFile();
            } catch (IOException ex) {
                System.out.println("NO SE HA PODIDO CREAR EL ARCHIVO");            }
        }
                    try {
                print= new PrintStream(archivo);
            } catch (FileNotFoundException ex) {
                System.out.println("ERROR");         
            }
      
         
    }
}
