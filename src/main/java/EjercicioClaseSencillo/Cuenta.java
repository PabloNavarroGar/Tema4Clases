/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClaseSencillo;


import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author pablo
 */
//Ejercicio Clase cuenta, Atributos= n Cuenta(20digitos)
//NIF cliente,Nombre Cliente, Saldo actual,Interes % (Entre 0.1 y 3)
//Metodos 
//constructor por defecto,nº Cuenta Aleatorio,Constructor parametizado
//Ncuenta aleatorio
//Getter y Setter No HAY SET para numero cuenta
//To String
//CLASE CALCULOSCUENTA
//Metodos
//IngresaarIntereses(Cuenta cuenta), aumentar el saldo de la cuenta
// saldo = saldo+saldo*interes
// IngresarDinero(Cuenta cuenta,double cantidad)
// retirarEfectivo(Cuenta cuenta, double cantidad)Hay que tener en cuenta que no se puede retirar
//mas saldo del que dispones
public class Cuenta {

    String cuenta;
    String nif;
    private String nombreCliente;
    double saldo;
    double interes;

    public Cuenta() {
    }

    public Cuenta(String nombreCliente, double saldo, double interes) {
        this.cuenta = generarCuenta();
        this.nif = generarNIF();
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
        //Puedo poner la condicion en el constructor sin tener que crearlo en metodos
        if (interes < 0.1 || interes > 3) {
            interes = 0.1;
        }
        this.interes = interes;

    }

    private static String generarNIF() {
        //Declaramos los char de las letras

        //Generamos una char poniendo en orden las letras
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        //Usamos las dependecias lag para seleccionar la funcion del  random con 8 digittos
        String nif = RandomStringUtils.randomNumeric(8);
        //Declaramos el nif y numero de letra
        int nifnumero;

        int numeroLetra;
        //System.out.println("El numero generados son: " + numero);
        //Hacemos parse para equivaler el String con el int
        nifnumero = Integer.parseInt(nif);
        //Tengo el nif con el parse del numero
        //division del nif entre 23 
        numeroLetra = nifnumero % 23;

        System.out.println(nifnumero + letras[numeroLetra]);
        //devuelvo el String del numero aleatorio junto con el char letra y el numero de la letra
        return nif + letras[numeroLetra];
    }

    //GENERAR UN NUMERO DE CUENTA ALEATORIO, Privado ya que solo se va a usar en esta clase
    private  String generarCuenta() {
        String cuenta = RandomStringUtils.randomNumeric(20);

        return cuenta;

    }
    //GET Y SETTERS

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        if (interes < 0.1 || interes > 3) {
            interes = 0.1;
        }
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cuenta=" + cuenta + ", nif=" + nif + ", nombreCliente=" + nombreCliente + ", saldo=" + saldo + ", interes=" + interes + '}';
    }
    
   



}
