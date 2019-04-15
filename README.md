1. Crear un repositorio en GitHub con el nombre “Práctica 02 – POO con Java”
 
2. Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar un commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub).
 
3. Crear un paquete para las clases, otro para las interfaces, otro para las pruebas.

 
4. Crear una jerarquía de clases de tres niveles, es decir, una clase “abuelo”, dos clases “padres” y cuatro clases “hijas” (dos de cada padre).
public abstract class SerVivo {
     public abstract class Animal extends SerVivo{
          public class Ave extends Animal{
          public class Pez extends Animal{
     public abstract class Vegetal extends SerVivo{
          public class Vascular extends Vegetal{
          public class NoVascular extends Vegetal{

5. Todas las clases deben tener por lo menos cuatros atributos (aparte de los de herencia), tres métodos (aparte de los getters y setters) y método toString(). 
6. Cada clase padre debe tener por lo menos un método abstracto cada una. 
7. Los métodos abstractos deben ser sobre-escritos (implementados) en cada clase hija.
8. Todas las clases hijas deben ser clases finales.
9. Crear una interface, con al menos dos métodos abstractos. Estos métodos deben ser implementados en cada clase hija.
Clase SerVivo
package ec.edu.ups.clases;

/**
 * SerVivo
 * @author Edison
 */
public abstract class SerVivo {
    // atrivutos
    private String nombre;
    private int anosVida;
    private double peso;
    private double tamano;
    
    // constructores
    public SerVivo(){
        
    }
    
    public SerVivo(String nombre){
        
    }

    public SerVivo(String nombre, int anosVida, double peso, double tamano) {
        this.nombre = nombre;
        this.anosVida = anosVida;
        this.peso = peso;
        this.tamano = tamano;
    }
    
    // getters y setters
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
    
    // metodos
    public boolean nacer(){
        return true;
    }
     public boolean reproducirce(){
        return true;
    }
      public boolean morir(){
        return true;
    }
    // metodo abstracto
    public abstract boolean vivir();

    // toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Años de Vida: " + anosVida + ", Peso: " + peso + ", Tamaño: " + tamano;
    }
}

Clase Animal
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 * Animal
 * @author Edison
 */
public abstract class Animal extends SerVivo implements Acciones{
    //atributos
    private String domesticoSalvaje;
    private String color;
    private String tipoAlimento;
    private boolean capacidadCazar;
    
    //Constructores
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

    // getters y setters
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
    
    // metodos
    public boolean jugar(){
        return true;
    }
    public boolean cazar(){
        return true;
    }
    public boolean dormir(){
        return true;
    }
    
    // metodo abstracto
    public abstract boolean cazarAnimal();
    
    // toString
    @Override
    public String toString() {
        return super.toString()+", Domestico o Salvaje: " + domesticoSalvaje + ", Color: " + color + ", Tipo de Alimento: " + tipoAlimento + ", CapacidadCazar: " + capacidadCazar ;
    }

    // implementacion metodos abtractos
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

Clase Vegetal
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 * Vegetal
 * @author Edison
 */
public abstract class Vegetal extends SerVivo implements Acciones{
    // atributos
    private boolean hojas;
    private boolean fruto;
    private String usoVegetal;
    private String lugarCrecimiento;
    // constructores
    public Vegetal(){
        
    }

    public Vegetal(String nombre, int anosVida, double peso, double tamano) {
        super(nombre, anosVida, peso, tamano);
    }

    public Vegetal(boolean hojas, boolean fruto, String usoVegetal, String lugarCrecimiento, String nombre, int anosVida, double peso, double tamano) {
        super(nombre, anosVida, peso, tamano);
        this.hojas = hojas;
        this.fruto = fruto;
        this.usoVegetal = usoVegetal;
        this.lugarCrecimiento = lugarCrecimiento;
    }

    
    // getters y setters
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
    // metodos
    public boolean hacerFotosintecis(){
        return true;
    }
    public boolean consumirO2(){
        return true;
    }
    public boolean botarCO2(){
        return true;
    }
    // metodo abstracto
    public abstract boolean usarVegetal();
    // toString
    @Override
    public String toString() {
        return super.toString()+ ", Tiene hojas: " + hojas + ", Tiene frutos: " + fruto + ", Uso del Vegetal: " + usoVegetal + ", Lugar de Crecimiento: " + lugarCrecimiento;
    }
    // implementacion de metodos abtractos
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

Clase Pez
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 * Pez
 * @author Edison
 */
public final class Pez extends Animal implements Acciones{
    // atributos
    private double profundidad;
    private int numeroDeAletas;
    private String aguaDulceSalada;
    private String tipoDePez;
    // constructores
    public Pez (){
        
    }

    public Pez(String domesticoSalvaje, String color, String tipoAlimento, boolean capacidadCazar, String nombre, int anosVida, double peso, double tamano) {
        super(domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano);
    }

    public Pez(double profundidad, int numeroDeAletas, String aguaDulceSalada, String tipoDePez, String domesticoSalvaje, String color, String tipoAlimento, boolean capacidadCazar, String nombre, int anosVida, double peso, double tamano) {
        super(domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano);
        this.profundidad = profundidad;
        this.numeroDeAletas = numeroDeAletas;
        this.aguaDulceSalada = aguaDulceSalada;
        this.tipoDePez = tipoDePez;
    }
    
    // getters y setters
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
    // metodos
    public boolean nadar(){
        return true;
    }
    public boolean cazrComida(){
        return true;
    }
    public boolean ponerHuevos(){
        return true;
    }
    // toString
    @Override
    public String toString() {
        return "Pez: "+super.toString()+ ", Profundidad: " + profundidad + ", Numero De Aletas: " + numeroDeAletas + ", Agua Dulce o Salada: " + aguaDulceSalada + ", Tipo De Pez: " + tipoDePez;
    }
    // implementacion de metodos abstractos
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

Clase Ave
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 * Ave
 * @author Edison
 */
public final class Ave extends Animal implements Acciones{
    // atrivutos
    private double maximoAlturaVuelo;
    private double tamanoAlas;
    private boolean volar;
    private boolean nadar;
    // constructores
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

    
    // getters y setters
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
    // metodos
    public boolean volar(){
        return true;
    }
    public boolean cazarComida(){
        return true;
    }
    public boolean ponerHuevos(){
        return true;
    }
    // toString
    @Override
    public String toString() {
        return "Ave: " + super.toString()+ ", Maximo de la Altura de Vuelo: " + maximoAlturaVuelo + ", Tamaño de las Alas: " + tamanoAlas + ", Sabe volar: " + volar + ", sabe nadar: " + nadar;
    }
    // implementacion metodos abstractos
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

Clase Vascular
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 * Vascular
 * @author Edison
 */
public final class Vascular extends Vegetal implements Acciones{
    // atrivutos
    private double tamanoRaiz;
    private double tamanoallo;
    private double tamanoHoja;
    private int cantidadMaximaFrutos;
    // constructores
    public Vascular(){
        
    }

    public Vascular(boolean hojas, boolean fruto, String usoVegetal, String lugarCrecimiento, String nombre, int anosVida, double peso, double tamano) {
        super(hojas, fruto, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano);
    }

    public Vascular(double tamanoRaiz, double tamanoallo, double tamanoHoja, int cantidadMaximaFrutos, boolean hojas, boolean fruto, String usoVegetal, String lugarCrecimiento, String nombre, int anosVida, double peso, double tamano) {
        super(hojas, fruto, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano);
        this.tamanoRaiz = tamanoRaiz;
        this.tamanoallo = tamanoallo;
        this.tamanoHoja = tamanoHoja;
        this.cantidadMaximaFrutos = cantidadMaximaFrutos;
    }
    
    // getters y setters
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
    // metodos
    public boolean hacerFotosintecis(){
        return true;
    }
    public boolean consumirO2(){
        return true;
    }
    public boolean votarCO2(){
        return true;
    }
    // toString
    @Override
    public String toString() {
        return "Vascular: "+super.toString()+ ", Tamaño de la Raiz: " + tamanoRaiz + ", Tamaño del tallo: " + tamanoallo + ", Tamaño de la Hoja: " + tamanoHoja + ", Cantidad Maxima de Frutos: " + cantidadMaximaFrutos;
    }
    // implementacion metodos abstractos
    @Override
    public boolean usarVegetal() {
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

Clase NoVascular
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 * Novascular
 * @author Edison
 */
public final class NoVascular extends Vegetal implements Acciones{
    // atrivutos
    private String tipo;
    private boolean rizoides;
    private boolean escamas;
    private double cantidadEscamas;
    // constructores
    public NoVascular(){
        
    }

    public NoVascular(boolean hojas, boolean fruto, String usoVegetal, String lugarCrecimiento, String nombre, int anosVida, double peso, double tamano) {
        super(hojas, fruto, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano);
    }

    public NoVascular(String tipo, boolean rizoides, boolean escamas, boolean hojas, boolean fruto, String usoVegetal, String lugarCrecimiento, String nombre, int anosVida, double peso, double tamano, double cantidadEscamas) {
        super(hojas, fruto, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano);
        this.tipo = tipo;
        this.rizoides = rizoides;
        this.escamas = escamas;
        this.cantidadEscamas = cantidadEscamas;
    }
    // getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isRizoides() {
        return rizoides;
    }

    public void setRizoides(boolean rizoides) {
        this.rizoides = rizoides;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public double getCantidadEscamas() {
        return cantidadEscamas;
    }

    public void setCantidadEscamas(double cantidadEscamas) {
        this.cantidadEscamas = cantidadEscamas;
    }
    
    // metodos
    public boolean hacerFotosintecis(){
        return true;
    }
    public boolean consumirO2(){
        return true;
    }
    public boolean votarCO2(){
        return true;
    }
    // toString
    @Override
    public String toString() {
        return "No Vascular: "+super.toString() + ", Tipo: " + tipo + ", tiene rizoides: " + rizoides + ", tiene escamas: " + escamas +"Cantidad de escamas: "+ cantidadEscamas;
    }
    
    // implementacion de metodos abstractos
    @Override
    public boolean usarVegetal() {
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

Calse interfaz Acciones
package ec.edu.ups.interfaces;

/**
 *
 * @author Edison
 */
public interface Acciones {
    public abstract boolean nacer();
    public abstract boolean reproducirse();
}
10. Crear una clase “Prueba”, en donde se demostrará el funcionamiento del proyecto. Además, se pide demostrar el uso de downcasting con el operador instanceof. También, se pide demostrar el uso de clases anónimas.

Clase Main
package ec.edu.ups.prueva;

import ec.edu.ups.clases.Ave;
import ec.edu.ups.clases.NoVascular;
import ec.edu.ups.clases.Pez;
import ec.edu.ups.clases.SerVivo;
import ec.edu.ups.clases.Animal;
import ec.edu.ups.clases.Vegetal;
import ec.edu.ups.clases.Vascular;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Edison
 */
public class Main {

    public static void main(String[] args) {

        List<Animal> lista2 = new ArrayList<>();
        List<Vegetal> lista3 = new ArrayList<>();

        Scanner l = new Scanner(System.in);
        Scanner l2 = new Scanner(System.in);
        Scanner l3 = new Scanner(System.in);
        System.out.println("INGRESAR DATOS DEL PEZ:");
        System.out.println("Ingresar nombre");
        String nombre = l.nextLine();
        System.out.println("Ingresar los años de vida");
        int anosVida = l2.nextInt();
        System.out.println("Ingresar el peso");
        double peso = l2.nextDouble();
        System.out.println("Ingresar el tamaño");
        double tamano = l2.nextDouble();
        System.out.println("Ingrese si es domestico o salvaje");
        String domesticoSalvaje = l2.next();
        System.out.println("Ingrese el color");
        String color = l.nextLine();
        System.out.println("Ingrese el tipo de alimento que consume");
        String tipoAlimento = l.nextLine();
        System.out.println("Ingrese si es capaz de casar (true/false)");
        boolean capacidadCazar = l2.nextBoolean();
        System.out.println("Ingrese a que profundidad se encuentra el pez");
        double profundida = l2.nextDouble();
        System.out.println("Ingrese el numero de aletas del pez");
        int aletas = l2.nextInt();
        System.out.println("Ingrese si es de agua dulse o salada");
        String dulceSalada = l2.next();
        System.out.println("Ingrese que tipo de pez es");
        String tipo = l.nextLine();
        Pez pez = new Pez(profundida, aletas, dulceSalada, tipo, domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano);
        System.out.println("INGRESAR DATOS DEL AVE:");
        System.out.println("Ingresar nombre");
        nombre = l.nextLine();
        System.out.println("Ingresar los años de vida");
        anosVida = l2.nextInt();
        System.out.println("Ingresar el peso");
        peso = l2.nextDouble();
        System.out.println("Ingresar el tamaño");
        tamano = l2.nextDouble();
        System.out.println("Ingrese si es domestico o salvaje");
        domesticoSalvaje = l2.next();
        System.out.println("Ingrese el color");
        color = l.nextLine();
        System.out.println("Ingrese el tipo de alimento que consume");
        tipoAlimento = l.nextLine();
        System.out.println("Ingrese si es capaz de casar(true/false)");
        capacidadCazar = l3.nextBoolean();
        System.out.println("Ingres si es capas de volar (true/false)");
        boolean capacidadvolar = l2.nextBoolean();
        System.out.println("Ingrese la maxima altura que puede volar (0 si no vuela)");
        double maximaalturaVuelo = l2.nextDouble();
        System.out.println("Ingresas el tamaño de las alas");
        double tamanoAlas = l2.nextDouble();
        System.out.println("Ingrese si es capaz de nadar (true/false)");
        boolean capacidadNadar = l2.nextBoolean();
        Ave ave = new Ave(maximaalturaVuelo, tamanoAlas, capacidadvolar, capacidadNadar, domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, anosVida, peso, tamano);
        
        System.out.println("INGRESAR DATOS DEL VEGETAL VASCULAR:");
        System.out.println("Ingresar nombre");
        nombre = l.nextLine();
        System.out.println("Ingresar los años de vida");
        anosVida = l2.nextInt();
        System.out.println("Ingresar el peso");
        peso = l2.nextDouble();
        System.out.println("Ingresar el tamaño");
        tamano = l2.nextDouble();
        System.out.println("Ingrese si tiene hojas (true/false)");
        boolean hojas = l2.nextBoolean();
        System.out.println("Ingrese si tiene frutos (true/false)");
        boolean frua = l2.nextBoolean();
        System.out.println("Ingre el uso del vegetal (comida, medicina, etc..)");
        String usoVegetal = l.nextLine();
        System.out.println("Ingres el lugar donde crece");
        String lugarCrecimiento = l.nextLine();
        System.out.println("Ingrese el tamaño aproximado de la raiz");
        double tamanoRaiz = l2.nextDouble();
        System.out.println("Ingrese el tamaño aproximado del tallo");
        double tamanoTallo = l2.nextDouble();
        System.out.println("Ingrese el tamaño aproximado de la hoja");
        double tamanoHoja = l2.nextDouble();
        System.out.println("Ingrese la cantidad maxiam de fruto que produce");
        int cantidadMaximaFrutos = l2.nextInt();
        Vascular vascular = new Vascular(tamanoRaiz, tamanoTallo, tamanoHoja, cantidadMaximaFrutos, hojas, frua, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano);
        
        System.out.println("INGRESAR DATOS DEL VEGETAL NO VASCULAR:");
        System.out.println("Ingresar nombre");
        nombre = l.nextLine();
        System.out.println("Ingresar los años de vida");
        anosVida = l2.nextInt();
        System.out.println("Ingresar el peso");
        peso = l2.nextDouble();
        System.out.println("Ingresar el tamaño");
        tamano = l2.nextDouble();
        System.out.println("Ingrese si tiene hojas (true/false)");
        hojas = l2.nextBoolean();
        System.out.println("Ingrese si tiene frutos (true/false)");
        frua = l2.nextBoolean();
        System.out.println("Ingre el uso del vegetal (comida, medicina, etc..)");
        usoVegetal = l.nextLine();
        System.out.println("Ingres el lugar donde crece");
        lugarCrecimiento = l.nextLine();
        System.out.println("Ingrese el tipo de vegetal no Vascular al que pertenece");
        tipo = l.nextLine();
        System.out.println("Ingrese si tiene rizoides (true/false)");
        boolean rizoides = l2.nextBoolean();
        System.out.println("Ingrese si tiene escamas (true/false)");
        boolean escamas = l2.nextBoolean();
        System.out.println("Ingrese la cantidad de escamas");
        double cantidadEscamas = l2.nextDouble();
        NoVascular noVascular = new NoVascular(tipo, rizoides, escamas, hojas, frua, usoVegetal, lugarCrecimiento, nombre, anosVida, peso, tamano, cantidadEscamas);
        System.out.println(pez);
        System.out.println("Comprovacion de los metodos de la clase Ave:\ncazarComida: "+ave.cazarComida()+", volar: "+ave.volar()+", ponerHuevos: "+ave.ponerHuevos());
        System.out.println(ave);
        System.out.println("Comprovacion de los metodos de la clase Pez:\ncazarComida: "+pez.cazrComida()+", nadar: "+pez.nadar()+", ponerHuevos: "+pez.ponerHuevos());
        System.out.println(vascular);
        System.out.println("Comprovacion de los metodos de la clase Vascular:\nhacerFotosintecis: "+vascular.hacerFotosintecis()+", consumirO2: "+vascular.consumirO2()+", votarCO2: "+vascular.votarCO2());
        System.out.println(noVascular);
        System.out.println("Comprovacion de los metodos de la clase NoVascular:\nhacerFotosintecis: "+noVascular.hacerFotosintecis()+", consumirO2: "+noVascular.consumirO2()+", votarCO2: "+noVascular.votarCO2());
        System.out.println("\n");
        System.out.println("Verificacion del uso de downcasting con el operador instanceof\n");
        lista2.add(ave);
        lista2.add(pez);
        lista3.add(vascular);
        lista3.add(noVascular);

        for (Animal animal : lista2) {
            if (animal instanceof Pez) {
                Pez a1 = (Pez) animal;
                System.out.println("Pez: " + a1);
            } else if (animal instanceof Ave) {
                Ave a2 = (Ave) animal;
                System.out.println("Ave: " + a2);
            }
        }
        for (Vegetal vegetal : lista3) {
            if (vegetal instanceof Vascular) {
                Vascular v1 = (Vascular) vegetal;
                System.out.println("Vascular: " + v1);
            } else if (vegetal instanceof NoVascular) {
                NoVascular v2 = (NoVascular) vegetal;
                System.out.println("NoVascular: " + v2);
            }
        }
        
        System.out.println("Verificacion del uso de la clase anonima");
        SerVivo serVivoAnonimo = new SerVivo("tiburon", 10, 80, 80) {
            @Override
            public boolean vivir() {
                return true;
            }
        };
        System.out.println(serVivoAnonimo);
    }
}


 
11. Desarrollar el diagrama de clases correspondiente usando la herramienta LucidChart.
 

Cuenta de hithub: EdisonAmendano
URL del repositorio: https://github.com/EdisonAmendano/Pr-ctica-02-POO-con-Java.git

RESULTADO(S) OBTENIDO(S):
Poder manejar correctamente las herencias en java y la utilización de los métodos abstractos
CONCLUSIONES:
La herencia en java es muy importante ya que nos ayuda a heredar atributos entra clases 

Nombre de estudiante: Edison Amendaño


Firma de estudiante: 
