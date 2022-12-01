package ApuntesClase;

import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pablo
 */
//definicion de la clase vehiculo
public class Vehiculo {

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
    public Vehiculo(String matricula, String bastidor, String marca,
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
    public Vehiculo() {
    }

    public Vehiculo(String matricula, String bastidor, String color) {
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
    //copia de un vehiculo
   public Vehiculo(Vehiculo origen){
       this.bastidor= origen.bastidor;
       this.color= origen.color;
       this.disponible=origen.disponible;
       this.marca=origen.marca;
       this.modelo=origen.modelo;
       this.tarifa=origen.tarifa;
       this.matricula=origen.matricula;
   }

    public Vehiculo copiar(){
        Vehiculo aux= new Vehiculo(matricula, bastidor, marca, modelo, color, tarifa, disponible);
        return aux;
    }
    
    
    public static Vehiculo copiar(Vehiculo origen){
        Vehiculo aux= new Vehiculo(origen.matricula, 
                origen.bastidor,origen. marca,
                origen.modelo,origen.color,
                origen.tarifa, origen.disponible);
        return aux;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.matricula);
        hash = 43 * hash + Objects.hashCode(this.bastidor);
        hash = 43 * hash + Objects.hashCode(this.marca);
        hash = 43 * hash + Objects.hashCode(this.modelo);
        hash = 43 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.bastidor, other.bastidor)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }
    
    
    
    
}
