/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClaseSencillo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class CalculosCuenta {

    public static Scanner teclado = new Scanner(System.in);

    //CLASE CALCULOSCUENTA
//Metodos
//IngresaarIntereses(Cuenta cuenta) 
    //aumentar el saldo de la cuenta
// saldo = saldo+saldo*interes
// IngresarDinero(Cuenta cuenta,double cantidad)
// retirarEfectivo(Cuenta cuenta, double cantidad)Hay que tener en cuenta que no se puede retirar
//mas saldo del que dispones
    //crear el objeto cuenta a traves dela clase Cuenta
    public static Cuenta leerCuentaTeclado() {
        //Creo objeto del tipo cienta
        Cuenta cuenta;

        //numero de cuenta
        //Se genera automatico en en el constructor, se le quita en Perona.constructor
        //EL DNI LO MISMO
        //metodo pedir Interes
        //Pedir nombre cliente
        System.out.println("Como se llama la persona");

        String nombrePersona = teclado.nextLine();
        //Metodo pedir Saldo
        double pedirSaldo = saldoCuenta();
        //Metodo pedir Interes
        double pedirInteres = darInteres();

        cuenta = new Cuenta(nombrePersona, pedirSaldo, pedirInteres);

        return cuenta;
    }

    public static double darInteres() {

        double interes = 0;

        do {
            try {

                System.out.println("Introduzca el Interes de la cuenta (0.1% a 3%)");

                interes = teclado.nextDouble();

            } catch (InputMismatchException ime) {
                System.out.println("Dato Invalido,vuelva a introducirlo");
                teclado.nextLine();
            }
        } while (!(interes >= 0.1 && interes <= 3));
        return interes;
    }

    //INTRODUCIR UN NUMERO POR CONSOLA 
    public static double saldoCuenta() {

        // si se crea el teclado ya en el objeto se elimina
        double saldo = 0;

        try {

            System.out.println("Introduzca el saldo que empieza la cuenta");

            saldo = teclado.nextDouble();

            

        } catch (InputMismatchException ime) {
            System.out.println("Dato Invalido,vuelva a introducirlo");
            teclado.nextLine();
        }

        return saldo;
    }

    public void ingresarDinero(Cuenta cuenta, double cantidad) {
        double saldo = cuenta.getSaldo();
        System.out.println("¿Cuanta cantidad quieres ingresar?");

        cantidad = teclado.nextDouble();

        saldo += cantidad;
        System.out.println("tu saldo era de " + saldo + " has ingreado " + cantidad);
    }

    public void retirarEfectivo(Cuenta cuenta, double cantidad) {

        double saldo = cuenta.getSaldo();
        System.out.println("¿Cuanta cantidad quieres retirar?, tienes ");

        cantidad = teclado.nextDouble();

        saldo -= cantidad;

        System.out.println("has sacado " + cantidad + " tu saldo actual es de " + saldo);
    }

    public void consultarSaldo(Cuenta cuenta) {

        System.out.println("Saldo ="
                + cuenta.getSaldo());
    }

//    public static double filtradoSaldoInteres(double saldo,double interes) {
//        
//         double saldoFinal= saldoCuenta()+(saldoCuenta()*darInteres());
//        return saldoFinal;
//    }

}
