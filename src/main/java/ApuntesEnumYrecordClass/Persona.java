/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApuntesEnumYrecordClass;

/**
 *
 * @author samue
 */
public class Persona {
    //No tiene getter ni setter, ni metodos para cambiar, es FInal, no se puede cambiar y lo que se escriba 
    //se quedara tal cual
    public record  PersonaDTO (String nombre,String apellidos,int edad){}
    
}
