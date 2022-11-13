/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajas;

/**
 *
 * @author samue
 */
public class TestCajaCarton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CajaCarton cajaGrande = new CajaCarton("250mm", "400mm", "500mm", "200gr");

        CajaCarton cajaChica = new CajaCarton("25mm", "30mm", "15mm", "17gr");
        
        CajaCarton cajaGrande2;

        
        cajaGrande2=cajaGrande;
        //cajaGrande: ancho 250mm, alto 400mm, largo 500mm. Peso 200gr.
        //cajaChica: ancho 25mm, alto 30mm, largo 15mm. Peso 17gr.
        
        
        
//        cajaGrande.setAncho("250mm");
//        cajaGrande.setAlto("400mm");
//        cajaGrande.setLargo("500mm");
//        cajaGrande.setPeso("200gr");
//
//        cajaChica.setAncho("25mm");
//        cajaChica.setAlto("30mm");
//        cajaChica.setLargo("15mm");
//        cajaChica.setPeso("17gr");
        
        //PARTE C 
        System.out.println("-----------------Caja Grande-------------------");
        
        System.out.println("El ancho de la caja mide " + cajaGrande.getAncho());

        System.out.println("El alto de la caja mide "+cajaGrande.getAlto());
        
        System.out.println("El Largo de la caja mide "+cajaGrande.getLargo());
        
        System.out.println("El Peso de la caja mide "+cajaGrande.getPeso());
        
        System.out.println("-----------------Caja Pequeña-------------------");
        
        System.out.println("El ancho de la caja mide " + cajaChica.getAncho());

        System.out.println("El alto de la caja mide "+cajaChica.getAlto());
        
        System.out.println("El Largo de la caja mide "+cajaChica.getLargo());
        
        System.out.println("El Peso de la caja mide "+cajaChica.getPeso());
        
        System.out.println("---------------------ToString-------------------");
        
        System.out.println(cajaGrande.toString());
        
        System.out.println("------------------------------------------------");
        
        System.out.println(cajaChica.toString());

        System.out.println("--------------------ALIAS-----------------");
        
        
        
        System.out.println("La segunda  caja grande ha tomado los valores de la primera que son "+cajaGrande2.toString());
        
        System.out.println("----------------CAJA GRANDE 2 -------------------");
         System.out.println("El ancho de la caja mide " + cajaGrande2.getAncho());

        System.out.println("El alto de la caja mide "+cajaGrande2.getAlto());
        
        System.out.println("El Largo de la caja mide "+cajaGrande2.getLargo());
        
        System.out.println("El Peso de la caja mide "+cajaGrande2.getPeso());
        
        
        
    }

}
