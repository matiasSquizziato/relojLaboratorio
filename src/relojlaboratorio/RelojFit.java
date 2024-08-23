

package relojlaboratorio;

import java.util.Scanner;


public class RelojFit extends Reloj{

    private int x1, x2, y1, y2;
    Scanner entrada =new Scanner(System.in);
    
    public RelojFit(String dia, int hora, String modelo, long numeroDeSerie) {
        super(dia, hora, modelo, numeroDeSerie);
     
    }
    
    
            
    
    
    public void cargarPasos(){
        System.out.println("Ingrese la coordenada x1.");
        x1=entrada.nextInt();
        System.out.println("Ingrese la coordenada x2.");
        x2=entrada.nextInt();
        System.out.println("Ingrese la coordenada y1.");
        y1=entrada.nextInt();
        System.out.println("Ingrese la coordenada y2.");
        y2=entrada.nextInt();
    }
    public double cuentaPasos(int x1,int y1, int x2, int y2){
        double pasos = Math.pow((Math.pow(x2-x1,2)+(Math.pow(y2-y1, 2))), 0.5);
        return pasos; 
    }
}
