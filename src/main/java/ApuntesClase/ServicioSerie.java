/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApuntesClase;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ServicioSerie {

    public static Scanner teclado = new Scanner(System.in);

    //crear el dato que vamos a devolver
    public static Serie leerTecladoSerie() {
        //creamos objeto de tipo serie

        Serie serie;
        
        //Leer por teclado e instanciar
        System.out.println("Nombre de la serie");
        String nombreSerie = teclado.nextLine();
        System.out.println("Genero de la serie");
        String generoSerie = teclado.nextLine();
        System.out.println("Sipnonsis de la serie");
        String sipnosisSerie = teclado.nextLine();
        System.out.println("Productora de la serie");
        String productorSerie = teclado.nextLine();
        System.out.println("Numero Temporadas de la serie");
        int temporadas = teclado.nextInt();

        System.out.println("Numero Likes de la serie");
        int numeroLikesSerie = teclado.nextInt();
        teclado.nextLine();
        //Instancias el objeto
        
        serie = new Serie(nombreSerie, generoSerie, sipnosisSerie,
                productorSerie, temporadas, numeroLikesSerie);
        
        //Devolvemos el tipo serie
        return serie;
    }
    
    
    
    public static void darLike(Serie serie){
        System.out.println("Te a gustado la serie "+serie.getTitulo()+"?");  
        
        String respuesta = teclado.nextLine();
        
        if(respuesta.equalsIgnoreCase("si")){
            serie.darLike();//se enlaca con el dar Like de la clase Serie
        } else{
            
            
        }
        
        
    }
    
    
    public static Serie copiar(Serie origen){
        Serie aux = new Serie(origen.getTitulo()
                ,origen.getGenero(),origen.getSipnosis()
                ,origen.getProductor(),origen.getNumeroDeTemporadas(),origen.getNumeroLikes());
        
        return aux;
    }
}
