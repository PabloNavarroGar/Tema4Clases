/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ApuntesClase;

/**
 *
 * @author pablo
 */
public class MisSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Serie Simpsons = new Serie("Simspsons","Comedia", "......."
                ,"Disney", 34,14005);
        Serie Simpsons2 = ServicioSerie.copiar(Simpsons);
        System.out.println("Son iguales los simpsons que Simpsons2"+Simpsons.equals(Simpsons2));
        System.out.println("El haschode se simpsons"+Simpsons.hashCode());
         System.out.println("El haschode se simpsons2"+Simpsons2.hashCode());
        
        
        System.out.println(Simpsons);
        
        Serie House = new Serie();
        System.out.println(House);//No enseña nada porque el construtor que hemos puesto esta vacio
        System.out.println("Son iguales los simpsons que house"+Simpsons.equals(House));
       
        Serie PrisonBreak = new Serie("PrisonBreak", "Accion", "...", "HBO", 0, 0);
        System.out.println(PrisonBreak);
        //Comando para llamar al hashcose
        
        System.out.println("Haschode PrisonbReak"+PrisonBreak.hashCode());
        //Crear serie a partir del teclado del servicioSerie
        //No se le pone new porque ya esta en la clase de ServicioSerie
//        Serie Futurama = ServicioSerie.leerTecladoSerie();
//        //se muestra darle datos a futurama
//        System.out.println(Futurama);
        
        ServicioSerie.darLike(Simpsons);
        
        
    }
    
}
