package ApuntesClase;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pablo
 */
//definicion de la clase vehiculo
public class vehiculo {

    //atributos de mi clase
    String matricula;
    String bastidor;
    String marca;
    String modelo;
    private String color;
    double tarifa; //alquier diario
    private boolean disponible;

    //DENTRO DE la clase se hacen los constructores con SU MISMO NOMBRE
    //constructores
    //haciendo click derecho//INSERT CODE// GENERATE, LE DAMOS A CONSTRUCTOR GRACIAS NACHO.
    public vehiculo(String matricula, String bastidor, String marca,
            String modelo, String color, double tarifa, boolean disponible) {
        //ROSA CON ROSA NO PUEDE, TIENE QUE SER ROSA CON NEGRO
        // TIENE QUE TENER EL MISMO NOMBRE QUE LA CLASE PUBLICA
        //LO que se escriba en los parametros aunque sea igual es "diferente aunque se llame igual
        //podemos abreviar los nombres.
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    //Para que se solucione que el otro "vehiculo" lo reconozca crear un construtor vacio.
    public vehiculo() {
    }

    public vehiculo(String matricula, String bastidor, String color) {
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.color = color;
    }

    //Metodos Get
    public String getMatricula() {
        return this.matricula;
    }

    //Metodo Set se ponen en void y se actualiza
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    //dandoe a a to String en insert code podemos hace una concatenacion
    @Override
    public String toString() {
        return "vehiculo{" + "La matricula es matricula=" + matricula 
                + ", bastidor=" + bastidor 
                + ", marca=" + marca 
                + ", modelo=" + modelo 
                + ", color=" + color 
                + ", tarifa=" + tarifa 
                + ", disponible=" 
                + disponible + '}';
    }

   

    
}
