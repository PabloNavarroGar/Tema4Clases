/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioClaseSencillo;

/**
 *
 * @author pablo
 */
public class PruebaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta c1 = new Cuenta( "Gustavo", 100, 1);
       
        //System.out.println(c1.nif);
        System.out.println(c1.toString());
        
        //LLegar a la clase de Calculos Cuenta
//        Cuenta c2 =CalculosCuenta.leerCuentaTeclado();
//        
//        System.out.println(c2.toString());
        
        
        
        
        Cuenta c3 = new Cuenta("Samu", 0, 0.1);
        
        System.out.println(c3);
        System.out.println("El saldo actual de la cuenta es de "+c3.getSaldo());
        CalculosCuenta.ingresarDinero(c3, 200);
        
        
        System.out.println("El saldo actual de la cuenta es de "+c3.getSaldo());
        
        CalculosCuenta.retirarDinero(c3, 100);
        
        System.out.println("El sa.do actual de la cuenta es de "+c3.getSaldo());
      
    }
    
}
