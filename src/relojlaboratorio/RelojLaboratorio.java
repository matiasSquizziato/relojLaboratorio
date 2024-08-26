package relojlaboratorio;

import java.time.LocalTime;

/**
 *
 * @author matiSqui
 */
public class RelojLaboratorio {

    public static void main(String[] args) {

        Reloj rolej = new Reloj("lll",00,"n3541", 123456789);

        Persona pers = new Persona("Matias", "Squi", 24, 170,rolej);

        Reloj.seteoHoraDia(rolej);

        pers.setRelojN(rolej);

        System.out.println("Persona dice hora");
        pers.decirHora();
        System.out.println("-------------------------------------");

        //Get dia y hora
        System.out.println("Hoy es: " + rolej.mostrarDia());
        System.out.println("La hora: ");
        rolej.mostrarHora();
        System.out.println("-------------------------------------");

        //Incremento de dias
        System.out.println("El reloj incrementa en 1 dia");
        rolej.incrementarDia(1);
        System.out.println("-------------------------------------");

        //Incremento de horas
        System.out.println("Las horas se incrementaron en 1");
        System.out.println(rolej.incrementarHoras(1));
        System.out.println("-------------------------------------");

        //Metodo comer
        //Para pasar por parametro el incremento de horas para poder comer
        //Debemos incrementamos las horas y se podra comer (no se permiten numeros negativos)
        LocalTime Hora = rolej.incrementarHoras(1);
        System.out.println("es momento para..");
        pers.metodComer(Hora);
        

        //Reloj Fir
    RelojFit myFit = new RelojFit("222", 11, "Xiaomi", 23456789);
        myFit.cargarPasos();
        double pasos = myFit.cuentaPasos(2, 2, 5, 6);
        System.out.println("La cantidad de pasos es: " + pasos);
        
    }

    


}
