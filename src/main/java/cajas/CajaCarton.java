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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        
    }
    
     private String ancho; 
     private String alto; 
     private String largo; 
     private String  peso;
     //Generacion de Gets, en encasulamiento para que se crrer una a una
     //Parte B
    public String getAncho() {
        return ancho;
    }

    public String getAlto() {
        return alto;
    }

    public String getLargo() {
        return largo;
    }

    public String getPeso() {
        return peso;
    }
    //declaracion de Sets

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    
    
    //Parte C

    public CajaCarton(String ancho, String alto, String largo, String peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
    }

  
    
    public static void abrir(){
        
        
    }
    public static void cerrar(){
        
        
    }

    public CajaCarton() {
    }
    
    @Override
    public String toString(){
        
        return "Caja: La anchura de la caja es  "+ancho
                +" La altura de la caja es  "+alto
                +" El largo de la caja es "+largo
                +" El peso es de "+peso;
    }
    
    
    
//    ¿Qué pasa si objeto se declara pero no se instancia?
//     Que no va a poder tomar los atributos de la clase
// ¿Qué es un alias? Implementa el ejemplo de la clase Vehiculo que hay en los apuntes (págs 14 y 15)
//
// ¿Para qué se utiliza el puntero ‘this’?
    //para indicar que los parametros y los atributos se llaman igual
    
    

}
