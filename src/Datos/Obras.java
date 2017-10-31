/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Estudiante
 */
public class Obras {
    private String nombre;
    private String estilo;
    private String tecnica;
    private double valor;

    public Obras(String nombre, String estilo, String tecnica, double valor) {
        this.nombre = nombre;
        this.estilo = estilo;
        this.tecnica = tecnica;
        this.valor = valor;
    }
    public double valorfinal(){
        return (this.valor+(this.valor*0.2));
    }

    @Override
    public String toString() {
        return "Obras{" + "nombre=" + nombre + ", estilo=" + estilo + ", tecnica=" + tecnica + ", valor=" + valor + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
