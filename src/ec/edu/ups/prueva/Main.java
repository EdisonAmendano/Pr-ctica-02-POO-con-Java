/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        System.out.println(ave);
        System.out.println(vascular);
        System.out.println(noVascular);
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
