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
public class Vegetal extends SerVivo{
    
    private boolean hojas;
    private boolean fruto;
    private String usoVegetal;
    private String lugarCrecimiento;

    public boolean isHojas() {
        return hojas;
    }

    public void setHojas(boolean hojas) {
        this.hojas = hojas;
    }

    public boolean isFruto() {
        return fruto;
    }

    public void setFruto(boolean fruto) {
        this.fruto = fruto;
    }

    public String getUsoVegetal() {
        return usoVegetal;
    }

    public void setUsoVegetal(String usoVegetal) {
        this.usoVegetal = usoVegetal;
    }

    public String getLugarCrecimiento() {
        return lugarCrecimiento;
    }

    public void setLugarCrecimiento(String lugarCrecimiento) {
        this.lugarCrecimiento = lugarCrecimiento;
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
        return "Vegetal{" + "hojas=" + hojas + ", fruto=" + fruto + ", usoVegetal=" + usoVegetal + ", lugarCrecimiento=" + lugarCrecimiento + '}';
    }
  
}
