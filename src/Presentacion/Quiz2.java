/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Galeria;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Galeria galeria=null;
        Scanner in= new Scanner(System.in);
        galeria= new Galeria("WebGallery");
        galeria.addComprador("david","12345678");
        galeria.addComprador("david","12345678");
        galeria.addComprador("david","12345678");
        galeria.addComprador("david","12345678");
        galeria.addComprador("david","12345678");
        galeria.addComprador("david","12345678");
        galeria.addArtsita("Daniel", "12123312");
        galeria.addArtsita("Artista", "12123312");
        galeria.addArtsita("Artista", "12123312");
        for (int i = 0; i <galeria.getArtistas().size(); i++) {
            galeria.getArtistas().get(i).addObra("Obra a ", "Estilo a", "Tecnica x",100);
            galeria.getArtistas().get(i).addObra("Obra b ", "Estilo a", "Tecnica x",100);
            galeria.getArtistas().get(i).addObra("Obra c ", "Estilo a", "Tecnica x",100);
            galeria.getArtistas().get(i).addObra("Obra d" ,"Estilo a", "Tecnica x",100);
        }
        int opc= in.nextInt();
        System.out.println("PRESIONE 1");
        if(opc==1){
        galeria.ListarArtistas();
            System.out.println("NOMBRE DEL ARTISTA?");
        String nombre=in.next();
            for (int i = 0; i < galeria.getArtistas().size(); i++) {
                if(galeria.getArtistas().get(i).getNombre().equals(nombre)){
                    galeria.getArtistas().get(i).listarObras();
            String nombreobra= in.next();
            for (int j = 0; j < galeria.getArtistas().size(); j++) {
                               if(galeria.getArtistas().get(j).getObras().get(j).getNombre().equals(nombreobra)){
                                   System.out.println(galeria.getArtistas().get(j).getObras().get(j).getValor());
                }
            }
            }
        }
    }
    
}
}
