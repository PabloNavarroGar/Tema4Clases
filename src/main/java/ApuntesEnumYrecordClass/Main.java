/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ApuntesEnumYrecordClass;

/**
 *
 * @author samue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona.PersonaDTO p1 = new Persona.PersonaDTO("Pablo", "Navarro García", 25);
        
        
        
        
        System.out.println(p1);
        
        System.out.println(p1.edad());
        
    }
    
}
