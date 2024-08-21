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

        System.out.println("Hoy es: " + rolej.mostrarDia());
        System.out.println("La hora: " + rolej.mostrarHora() + "hs" );

        //Incremento de dias
        System.out.println("El reloj incrementa en 1 dia");
        rolej.incrementarDia(1);



    }




}
