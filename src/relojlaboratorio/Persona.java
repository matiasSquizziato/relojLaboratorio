
package relojlaboratorio;


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



}
