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
public class Animal extends SerVivo{
    private String domesticoSalvaje;
    private String color;
    private String tipoAlimento;
    private boolean capacidadCazar;

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

    @Override
    public String toString() {
        return "Animal{" + "domesticoSalvaje=" + domesticoSalvaje + ", color=" + color + ", tipoAlimento=" + tipoAlimento + ", capacidadCazar=" + capacidadCazar + '}';
    }
    
}
