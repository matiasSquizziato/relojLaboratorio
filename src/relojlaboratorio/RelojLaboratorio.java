package relojlaboratorio;

/**
 *
 * @author matiSqui
 */
public class RelojLaboratorio {

    public static void main(String[] args) {

        Reloj rolej = new Reloj("lll",00,"n3541");

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
        rolej.incrementarHoras(1);
        System.out.println("-------------------------------------");

       


    }



}
