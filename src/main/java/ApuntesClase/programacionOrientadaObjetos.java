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
       vehiculo v1 = new vehiculo();
       //v1 es una instancia del objeto vehiculo, creando v2, v3, se van creando
       //mas vehiculo 
       v1.matricula="12345YUT";
       v1.setColor("negro");
       
        System.out.println(" La matricula de v1 es "+v1.matricula);
        //Creacion de "ferrar" que es el nombre del nuevo objeto
        vehiculo ferrari= new vehiculo();
        
        ferrari.matricula="54321TYU";
        ferrari.setColor("azul");
        ferrari.modelo="Ferrari";
        System.out.println("El color del ferrari es "+ferrari.getColor());
        
        //escribiendo vehiulo y control espacio seleccionaos el contructos vehiculo
        vehiculo mercedes  = new vehiculo("34567UT", "000001", 
                "Mercedes", "A1", "Plata", 80, true);
        
        System.out.println("Mercedes tarifa es: "+mercedes.tarifa);
        
        vehiculo audi = new vehiculo("23456LKJ", "00002", "Blanco");
        //Metodo del get 
        System.out.println("La matricula del audi es "+audi.getMatricula());
        
        audi.setMatricula("2222DBZ");
        
        System.out.println("La  'nueva' matricula del audi es "+audi.getMatricula());
        
        
        System.out.println(mercedes.toString());
        
        
    }
    
    
}
