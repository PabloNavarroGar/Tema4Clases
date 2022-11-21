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
    //Usar setSaldo, y en sus parentesis hacer la operacion, hay que ser unos SETS,
    //cuando nos piden que hagamos cosas en los metodos de una clase.
    public static void darInteres(Cuenta cuenta) {

        cuenta.setSaldo(cuenta.getSaldo() + cuenta.getSaldo() * cuenta.getInteres());

    }

    public static void ingresarDinero(Cuenta cuenta, double cantidad) {
        //Math.abs devuelveun valor absoluto, muy necesario en operaciones bancarias
        cantidad = Math.abs(cantidad);
        cuenta.setSaldo(cuenta.getSaldo() + cantidad);
    }

    public static void retirarDinero(Cuenta cuenta, double cantidad) {
        cantidad = Math.abs(cantidad);

        if (cuenta.getSaldo() < cantidad) {

        } else {
            //Hay que poner el resto de la cantida en este sitio
            cuenta.setSaldo(cuenta.getSaldo() - cantidad);

        }

    }

    //Otra forma de hacer el control de X cantidad, se puede hacer en un static boolean
    // con 2 return
    public static boolean retirarDinero2(Cuenta cuenta, double cantidad) {
        cantidad = Math.abs(cantidad);

        if (cuenta.getSaldo() < cantidad) {
            return false;
        } else {
            //Hay que poner el resto de la cantida en este sitio
            cuenta.setSaldo(cuenta.getSaldo() - cantidad);

        }
        return true;
    }
}
