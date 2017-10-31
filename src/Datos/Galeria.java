/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Galeria {
    private String nombre;
    private ArrayList<Artista> artistas;
    private ArrayList<Comprador> compradores;

    public Galeria(String nombre) {
        this.nombre = nombre;
        this.artistas =new ArrayList<>();
        this.compradores = new ArrayList<>();
    }

    public void addArtsita(String nombre, String contrasenia){
        Artista usuario= new Artista(nombre,contrasenia) ;      
        this.artistas.add(usuario);
    }
        public void addComprador(String nombre, String contrasenia){
        Comprador usuario= new Comprador(nombre,contrasenia) ;      
        this.compradores.add(usuario);
    }
        public void ListarArtistas(){
            for (Artista artista : artistas) {
                System.out.println(artista);
            }
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    public ArrayList<Comprador> getCompradores() {
        return compradores;
    }

    public void setCompradores(ArrayList<Comprador> compradores) {
        this.compradores = compradores;
    }
    
}
