/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        System.out.println("La hora: " + rolej.mostrarHora() );




    }
    
}
