/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejIntroductorio;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;//control espacio para ir poniendo en enlace

/**
 *
 * @author pablo
 */
public class usuariosYcontrasenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String opcion="";

          do{
              
              opcion=pedirNumeroOpcion();
              
              
              
          }while(!opcion.equalsIgnoreCase("4"));


    }

    public static String mostrarMenuCodigos() {
        String texto = """
                       Generator 3000 de contraseñas
                       ------------------------------
                       Escriba que tipo de contraseña 
                           ¿Que quiere hacer?
                                           
                       ------------------------------------
                         1.Crear un pin para un movil
                       ------------------------------------
                         2.Crear  contraseñas con 8 caracteres
                       ------------------------------------
                         3.Crear 6 contraseñas con signos  
                       ------------------------------------                     
                         4.Salir para terminar el programa
                       """;
        String opcion = JOptionPane.showInputDialog(texto);
        return opcion;
    }

    public static String pedirNumeroOpcion() {
        String codigo;
        do {
            codigo = mostrarMenuCodigos();
        } while (!esCodigoProductoValido(codigo));
        return codigo;
    }

    public static boolean esCodigoProductoValido(String codigo) {
    
        return (codigo.equalsIgnoreCase("1") || codigo.equalsIgnoreCase("2")
                || codigo.equalsIgnoreCase("3") || codigo.equalsIgnoreCase("4"));
    }

    
    
    //        for (int i = 0; i < 10; i++) {
//             String pin = RandomStringUtils.randomNumeric(4);
//        
//                System.out.println(pin);
//        }
//        
//        
//        
//        
//        System.out.println("-----------------------");
//        
//        //Opcion 2---Pass con letras de 8 
//        for (int i = 0; i < 10; i++) {
//            
//            String pass = RandomStringUtils.randomAlphabetic(8);
//            
//            System.out.println(pass);
//            
//        }
//        
//         System.out.println("-----------------------");
//        //Opcion 3
//        char [] conjuntoCaracteres = { 'a','z','b','y','Ç'};
//        //Si quiero que salga 6 vee spoenmos la variable, si el count lo cambiamos a "i", sale de 1 hasta 6
//        int numero = 6;
//        for (int i = 0; i < 10; i++) {
//             String password = RandomStringUtils.random(i,conjuntoCaracteres);
//        
//                System.out.println(password);
//        }
}
