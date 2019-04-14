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
public class Pez extends Animal{
    private double profundidad;
    private int numeroDeAletas;
    private String aguaDulceSalada;
    private String tipoDePez;

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public int getNumeroDeAletas() {
        return numeroDeAletas;
    }

    public void setNumeroDeAletas(int numeroDeAletas) {
        this.numeroDeAletas = numeroDeAletas;
    }

    public String getAguaDulceSalada() {
        return aguaDulceSalada;
    }

    public void setAguaDulceSalada(String aguaDulceSalada) {
        this.aguaDulceSalada = aguaDulceSalada;
    }

    public String getTipoDePez() {
        return tipoDePez;
    }

    public void setTipoDePez(String tipoDePez) {
        this.tipoDePez = tipoDePez;
    }
    
     public boolean nadar(){
        return true;
    }
    public boolean cazrComida(){
        return true;
    }
    public boolean ponerHuevos(){
        return true;
    }

    @Override
    public String toString() {
        return "Pez{" + "profundidad=" + profundidad + ", numeroDeAletas=" + numeroDeAletas + ", aguaDulceSalada=" + aguaDulceSalada + ", tipoDePez=" + tipoDePez + '}';
    }
    
    
}
