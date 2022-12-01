/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ApuntesClase;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class programacionOrientadaObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instalado de teclado en el main
       Scanner teclado = new Scanner(System.in);
       //Acceder a la clase poniendo su nombre
       //todo lo new es un objeto
       Vehiculo v1 = new Vehiculo();
       //v1 es una instancia del objeto vehiculo, creando v2, v3, se van creando
       //mas vehiculo 
       v1.matricula="12345YUT";
       v1.setColor("negro");
       
        System.out.println(" La matricula de v1 es "+v1.matricula);
        //Creacion de "ferrar" que es el nombre del nuevo objeto
        Vehiculo ferrari= new Vehiculo();
        
        ferrari.matricula="54321TYU";
        ferrari.setColor("azul");
        ferrari.modelo="Ferrari";
        System.out.println("El color del ferrari es "+ferrari.getColor());
        
        //escribiendo vehiulo y control espacio seleccionaos el contructos vehiculo
        Vehiculo mercedes  = new Vehiculo("34567UT", "000001", 
                "Mercedes", "A1", "Plata", 80, true);
        
        System.out.println("Mercedes tarifa es: "+mercedes.tarifa);
        
        Vehiculo audi = new Vehiculo("23456LKJ", "00002", "Blanco");
        //Metodo del get 
        System.out.println("La matricula del audi es "+audi.getMatricula());
        
        audi.setMatricula("2222DBZ");
        
        System.out.println("La  'nueva' matricula del audi es "+audi.getMatricula());
        
        
        System.out.println(mercedes.toString());
        
        
        //copia por referencia
        
        Vehiculo copiaMercedes= new Vehiculo(mercedes);
        
        System.out.println("-----------------------");
        System.out.println(mercedes);
        System.out.println(copiaMercedes);
        
        //Copia con el metodo copiar
        Vehiculo mercedes2= new Vehiculo(mercedes);
        System.out.println(mercedes2);
        
        
        System.out.println("===========HASHCODES============");
        System.out.println("---------------------------------");
        System.out.println(" El vehiculo mercedes tiene el hascode " +mercedes.hashCode());
        System.out.println(" El vehiculo mercedes2 tiene el hascode " +mercedes2.hashCode());
        System.out.println("El audi tiene el hashcode " +audi.hashCode());
        System.out.println("El ferrari tiene el hashcode "+ferrari.hashCode());
        System.out.println(" ¿Son iguales los vehiculos merceces y ferrari? " +mercedes.equals(ferrari));
        System.out.println(" ¿Son iguales los vehiculos merceces 1 y 2? " +mercedes.equals(mercedes2));
        System.out.println("¿Son iguales los vehiculos audi y ferrari? " +ferrari.equals(audi));
    }   
    
    
}
