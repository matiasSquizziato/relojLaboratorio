
package relojlaboratorio;


import java.time.LocalTime;

public class Persona {


    private String name;
    private String apellido;
    private int edad;
    private int altura;
    private Reloj relojN;

    public Persona(String name, String apellido, int edad, int altura, Reloj relojN) {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.relojN = relojN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Reloj getRelojN() {
        return relojN;
    }

    public void setRelojN(Reloj relojN) {
        this.relojN = relojN;
    }

    //Metodos

    public void decirHora(){

        if (relojN != null){
            System.out.println("La hora actual es: " + relojN.getHora());
        }else {
            System.out.println("No tengo reloj");
        }

    }

    public void metodComer(LocalTime nHora) {
        if (nHora.getHour() == 12 || nHora.getHour() == 23) {
            System.out.println("COMER!!");
        } else {
            System.out.println("seguir trabajando...  :( ");
        }
    }

}
