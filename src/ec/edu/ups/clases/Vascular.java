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
public final class Vascular extends Vegetal{
    private double tamanoRaiz;
    private double tamanoallo;
    private double tamanoHoja;
    private int cantidadMaximaFrutos;

    public double getTamanoRaiz() {
        return tamanoRaiz;
    }

    public void setTamanoRaiz(double tamanoRaiz) {
        this.tamanoRaiz = tamanoRaiz;
    }

    public double getTamanoallo() {
        return tamanoallo;
    }

    public void setTamanoallo(double tamanoallo) {
        this.tamanoallo = tamanoallo;
    }

    public double getTamanoHoja() {
        return tamanoHoja;
    }

    public void setTamanoHoja(double tamanoHoja) {
        this.tamanoHoja = tamanoHoja;
    }

    public int getCantidadMaximaFrutos() {
        return cantidadMaximaFrutos;
    }

    public void setCantidadMaximaFrutos(int cantidadMaximaFrutos) {
        this.cantidadMaximaFrutos = cantidadMaximaFrutos;
    }
    
    public boolean hacerFotosintecis(){
        return true;
    }
    public boolean consumirO2(){
        return true;
    }
    public boolean botarCO2(){
        return true;
    }

    @Override
    public String toString() {
        return "Vascular{" + "tamanoRaiz=" + tamanoRaiz + ", tamanoallo=" + tamanoallo + ", tamanoHoja=" + tamanoHoja + ", cantidadMaximaFrutos=" + cantidadMaximaFrutos + '}';
    }

    @Override
    public boolean usarVegetal() {
        return true;
    }
    
    

}
