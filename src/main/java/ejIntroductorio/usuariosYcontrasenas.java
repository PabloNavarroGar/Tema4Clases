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
        //variables para conectar los metodos
        String opcion = "";
        String pin = "";
        String pass = "";
        int pass2=0;
        do {

            opcion = pedirNumeroOpcion();

            switch (opcion) {
                case "1":
                    pin = generarPinAleatorio(pin);

                    System.out.println("-------------------");
                    break;
                case "2":
                    pass = contrasenaOchoDigitos(pass);

                    System.out.println("-------------------");
                    break;
                case "3":
                    pass2 = contrasenaFuerte(pass2);

                    System.out.println("-------------------");
                    break;

            }

        } while (!opcion.equalsIgnoreCase("4"));

    }

    public static String mostrarMenuCodigos() {
        String texto = """
                       Generator 3000 de contraseñas
                       ------------------------------
                       Seleccione el numero de Opcion que quiere realizar
                       __________________________________________________
                       
                           ¿Que quiere hacer?
                       __________________________________________________                    
                       ----------------------------------------
                         [1]Crear un pin para un movil
                       ----------------------------------------
                         [2]Crear  contraseñas con 8 caracteres
                       ----------------------------------------
                         [3]Crear contraseñas con hasta 10 caracteres  
                       ----------------------------------------                     
                         [4]Salir para terminar el programa
                       ----------------------------------------
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

    public static String generarPinAleatorio(String numero) {

        for (int i = 0; i < 10; i++) {
            String pin = RandomStringUtils.randomNumeric(4);

            System.out.println("Los pins generados son: " + pin);

            numero = pin;
        }

        return numero;
    }

    public static String contrasenaOchoDigitos(String numero) {

        //Opcion 2---Pass con letras de 8 
        for (int i = 0; i < 10; i++) {

            String pass = RandomStringUtils.randomAlphabetic(8);

            System.out.println("Las contraseñas generadas son : "+pass);
            numero = pass;
        }
        return numero;
    }

    public static int contrasenaFuerte(int numero) {
        
        char[] conjuntoCaracteres = {'a', 'z', 'b', 'y', 'Ç', 'u', '@', 'M', 'N', 'W'};
        //Si quiero que salga 6 vee spoenmos la variable, si el count lo cambiamos a "i", sale de 1 caracter  hasta 6 en orden descendiente
        do{
        try{
        String numeroString=JOptionPane.showInputDialog(null,"Cuantos caracteres quieres poner en la contraseña?");
        numero=Integer.parseInt(numeroString);
        //se una el NomberFormatException cuando se usa un JOption por su parse
        }catch(NumberFormatException ime){
            JOptionPane.showMessageDialog(null,"numero no valido"); 
            
        }
        
        }while(!(numero >=1 && numero <=10));
        
        
        
        for (int i = 0; i < 8; i++) {
            String password = RandomStringUtils.random(numero, conjuntoCaracteres);
            
         
                //Parse del string a double
            System.out.println("Las contraseñas generadas son : " +password);
        }

        return numero;

    }

}
