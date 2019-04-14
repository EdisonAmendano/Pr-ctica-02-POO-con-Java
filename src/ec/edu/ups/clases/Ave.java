/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 *
 * @author Edison
 */
public final class Ave extends Animal implements Acciones{
    
    private double maximoAlturaVuelo;
    private double tamanoAlas;
    private boolean volar;
    private boolean nadar;
    
    public Ave(){
        
    }

    public Ave(String domesticoSalvaje, String color, String tipoAlimento, boolean capacidadCazar, String nombre, int anosVida, double peso, double tamano) {
        super(domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano);
    }

    public Ave(double maximoAlturaVuelo, double tamanoAlas, boolean volar, boolean nadar, String domesticoSalvaje, String color, String tipoAlimento, boolean capacidadCazar, String nombre, int anosVida, double peso, double tamano) {
        super(domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano);
        this.maximoAlturaVuelo = maximoAlturaVuelo;
        this.tamanoAlas = tamanoAlas;
        this.volar = volar;
        this.nadar = nadar;
    }

    

    public double getMaximoAlturaVuelo() {
        return maximoAlturaVuelo;
    }

    public void setMaximoAlturaVuelo(double maximoAlturaVuelo) {
        this.maximoAlturaVuelo = maximoAlturaVuelo;
    }

    public double getTamanoAlas() {
        return tamanoAlas;
    }

    public void setTamanoAlas(double tamanoAlas) {
        this.tamanoAlas = tamanoAlas;
    }

    public boolean isVolar() {
        return volar;
    }

    public void setVolar(boolean volar) {
        this.volar = volar;
    }

    public boolean isNadar() {
        return nadar;
    }

    public void setNadar(boolean nadar) {
        this.nadar = nadar;
    }
    
    public boolean volar(){
        return true;
    }
    public boolean cazarComida(){
        return true;
    }
    public boolean ponerHuevos(){
        return true;
    }

    @Override
    public String toString() {
        return "Ave: " + super.toString()+ ", Maximo de la Altura de Vuelo: " + maximoAlturaVuelo + ", Tamaño de las Alas: " + tamanoAlas + ", Sabe volar: " + volar + ", sabe nadar: " + nadar;
    }

    @Override
    public boolean cazarAnimal() {
        return true;
    }
    
    @Override
    public boolean nacer(){
        return true;
    }
    @Override
    public boolean reproducirse(){
        return true;
    }
}
