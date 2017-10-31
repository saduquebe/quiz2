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
public class Artista extends Usuario {
    private ArrayList<Obras> obras;

    public Artista(String nombre, String contrasenia) {
        super(nombre, contrasenia);
        this.obras= new ArrayList<>();
    }
    public void addObra(String nombre, String estilo, String tecnica, double valor){
        Obras obra=null;
        obra=new Obras(nombre,estilo,tecnica,valor);      
        obra.valorfinal();
        this.obras.add(obra);
    }
    public void listarObras(){
        for (Obras obra : obras) {
            System.out.println(obra);
        }
    }

    public ArrayList<Obras> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obras> obras) {
        this.obras = obras;
    }
    
}
