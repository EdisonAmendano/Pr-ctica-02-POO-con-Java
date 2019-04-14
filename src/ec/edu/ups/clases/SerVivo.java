/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Edison
 */
public abstract class SerVivo {
    private String nombre;
    private int anosVida;
    private double peso;
    private double tamano;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnosVida() {
        return anosVida;
    }

    public void setAnosVida(int anosVida) {
        this.anosVida = anosVida;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    
    public boolean nacer(){
        return true;
    }
     public boolean reproducirce(){
        return true;
    }
      public boolean morir(){
        return true;
    }
      public abstract boolean vivir();

    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + ", anosVida=" + anosVida + ", peso=" + peso + ", tamano=" + tamano + '}';
    }
    
    
}
