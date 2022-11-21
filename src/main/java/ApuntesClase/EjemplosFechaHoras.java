/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ApuntesClase;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author pablo
 */
public class EjemplosFechaHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Clase que guarda fechas
        //Importar la clase
        //Estamos usando un objeto static, porque lo estamos llamando
        LocalDate fechaHoy = LocalDate.now();
        //==============================
        System.out.println("Año : " + fechaHoy.getYear());

        System.out.println("Mes :" + fechaHoy.getMonthValue());
        //Objeto de mes
        Month mesActual = fechaHoy.getMonth();

        System.out.println("Month" + mesActual);

        //Fechas Concretas
        LocalDate fecha = LocalDate.of(2000, 11, 21);

        System.out.println("fecha = " + fecha);
        //Toma el objeto mesActual, se puede cambiar por el objeto Month
        LocalDate fecha2 = LocalDate.of(2022, Month.NOVEMBER, 21);

        System.out.println("fecha " + fecha2);

        //Son iguales?
        if (fecha.equals(fecha2)) {

            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }

        // Anterior y posterior
        if (fecha.isBefore(fecha2)) {
            System.out.println(" fecha es anterior a fecha 2");
        } else {
            System.out.println(" fecha es posterior a fecha 2");
        }

        if (fecha.isAfter(fecha2)) {
            System.out.println("fecha es posterior a fecha 2");
        }

        //Clase para guardar mes y dia (no el año)
        MonthDay nocheVieja = MonthDay.of(Month.DECEMBER, 31);

        System.out.println("Noche vieja es en " + nocheVieja);
        //Clase de año mes
        YearMonth añoMes = YearMonth.of(2023, 5);

        System.out.println("La tarjeta caduca el : " + añoMes);

        //OJITO EXAMEN
        //Operaciones con fechas
        //Esto es muy util para ejercicios de alquier como el del coche
        System.out.println("Hoy :" + fechaHoy);
        System.out.println("Despues de 100 dias" + fechaHoy.plusDays(100));
        System.out.println("Hoy " + fechaHoy);

        LocalDate sumarMeses = fechaHoy.plusMonths(13);
        System.out.println("Despues de 13 meses" + sumarMeses);

        //Usar chronounit
        LocalDate dosSiglosDespues = sumarMeses.plus(2, ChronoUnit.CENTURIES);

        System.out.println(sumarMeses);

        long diferenciaDias = ChronoUnit.DAYS.between(fecha, fecha2);

        System.out.println("Los dias entre fecha y fecha2 son :" + diferenciaDias);

        long diferenciasAnios = ChronoUnit.YEARS.between(fecha, fecha2);

        System.out.println("Los años entre fecha y fecha2  =" + diferenciasAnios);

        //Devuelve si el año es bisiesto o no
        boolean esBisiesto = fechaHoy.isLeapYear();

        System.out.println("Dias del mes actual: " + fechaHoy.lengthOfMonth());

        Locale configLocal = Locale.getDefault();
        //OBTENER EL DIA DE LA SEMANA EN ESPAÑOL
        System.out.println("Fecha de hoy dia " + fechaHoy.getDayOfWeek().getDisplayName(TextStyle.FULL, configLocal));

        System.out.println("Fecha hoy Mes : " + mesActual.getDisplayName(TextStyle.FULL, Locale.CHINESE));

        
        
        //FORMATEAR LAS FECHAS 
        
        //dd dias con dos numeritos
        //mm mes con 2  numeritos
        //yyyy año
        DateTimeFormatter formatofechas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String fechaFormateada = fechaHoy.format(formatofechas);
        
        
        System.out.println("Fecha formateada "+fechaFormateada);
    }

}
