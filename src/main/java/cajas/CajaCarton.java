/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajas;

/**
 *
 * @author samue
 */
public class CajaCarton {

    private double ancho;
    private double alto;
    private double largo;
    private double peso;
    //Generacion de Gets, en encasulamiento para que se crear una a una
    //Parte B

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }

    public double getPeso() {
        return peso;
    }
    //declaracion de Sets

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Parte C
    public CajaCarton(double ancho, double alto, double largo, double peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
    }
    //Nunca poner Static los metodos de las clases, solo cuando no se USEN con this

    public void abrir() {

    }

    public void cerrar() {

    }

    public CajaCarton() {
    }

    @Override
    //Metodo sobreescritco,aquel que esta en una clase superior, 
    //y estamos cambiando su comportamiento con un codigo diferente.
    public String toString() {

        return "Caja: La anchura de la caja es  " + ancho
                + " La altura de la caja es  " + alto
                + " El largo de la caja es " + largo
                + " El peso es de " + peso;
    }

    //--Todo objeto tiene una identidad(Nombre),un estado(valores de los atritutos),
    // y el comportamiento (Metodos)
    //
//    ¿Qué pasa si objeto se declara pero no se instancia?
//     Que no va a poder reservarse en la memoria, y no podra usar los atributos de la clase.
    //y saldra nullpointerException
// ¿Qué es un alias? Implementa el ejemplo de la clase Vehiculo que hay en los apuntes (págs 14 y 15)
// Consiste en que en vez de generar un arhivo en memoria con las mismas caracteristicas de otro,
    //se declaran como iguales ahorrando memoria.
// ¿Para qué se utiliza el puntero ‘this’?
    //para indicar que los parametros y los atributos se llaman igual
}
