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
public abstract class Animal extends SerVivo implements Acciones{
    private String domesticoSalvaje;
    private String color;
    private String tipoAlimento;
    private boolean capacidadCazar;
    
    public Animal(){
        
    }

    public Animal(String nombre, int anosVida, double peso, double tamano) {
        super(nombre, anosVida, peso, tamano);
    }

    public Animal(String domesticoSalvaje, String color, String tipoAlimento, boolean capacidadCazar, String nombre, int anosVida, double peso, double tamano) {
        super(nombre, anosVida, peso, tamano);
        this.domesticoSalvaje = domesticoSalvaje;
        this.color = color;
        this.tipoAlimento = tipoAlimento;
        this.capacidadCazar = capacidadCazar;
    }

    public String getDomesticoSalvaje() {
        return domesticoSalvaje;
    }

    public void setDomesticoSalvaje(String domesticoSalvaje) {
        this.domesticoSalvaje = domesticoSalvaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public boolean isCapacidadCazar() {
        return capacidadCazar;
    }

    public void setCapacidadCazar(boolean capacidadCazar) {
        this.capacidadCazar = capacidadCazar;
    }
    
    public boolean jugar(){
        return true;
    }
    public boolean cazar(){
        return true;
    }
    public boolean dormir(){
        return true;
    }
    
    public abstract boolean cazarAnimal();

    @Override
    public String toString() {
        return "Animal{" + "domesticoSalvaje=" + domesticoSalvaje + ", color=" + color + ", tipoAlimento=" + tipoAlimento + ", capacidadCazar=" + capacidadCazar + '}';
    }

    @Override
    public boolean vivir() {
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
