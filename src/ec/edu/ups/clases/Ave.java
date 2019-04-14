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
public final class Ave extends Animal{
    
    private double maximoAlturaVuelo;
    private double tamanoAlas;
    private boolean volar;
    private boolean nadar;

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
    public boolean cazarAnimal() {
        return true;
    }
}
