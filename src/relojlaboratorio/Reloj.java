package relojlaboratorio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reloj {

    private String dia;
    private int hora;
    private String modelo;
    private long numeroDeSerie;

   

    public Reloj(String dia, int hora, String modelo, long numeroDeSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(long numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    @Override
    public String toString() {
        return "Reloj{" +
                "dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public static void seteoHoraDia(Reloj reloj){
        LocalDate fechaAct = LocalDate.now();
        LocalTime horaAct = LocalTime.now();

        reloj.setDia(fechaAct.getDayOfWeek().name());
        reloj.setHora(horaAct.getHour());


    }

    public String mostrarDia(){
        LocalDate hoy = LocalDate.now();
        return dia + " | " + hoy;
    }

    public void mostrarHora(){
        LocalTime horaAct = LocalTime.now();
        LocalTime localTime = horaAct.plusHours(0);

        System.out.println(horaAct);

    }

    public void incrementarDia(int incrementoDia) {
        LocalDate fechaAct = LocalDate.now();
        System.out.println(fechaAct.plusDays(incrementoDia));
    }

    public LocalTime incrementarHoras(int inrementoHoras){

        LocalTime horaAct = LocalTime.now();
        LocalTime horaPlusPlus = horaAct.plusHours(inrementoHoras);

       return horaPlusPlus;

    }



}


