import java.util.Scanner;

public class Servicio<duracion> {

private String descripcion;
Scanner leer= new Scanner(System.in).useDelimiter("\n");
    private int duracion;
    // metodo Resolucion Tiempo

    public void setDuracion(int duracion) {
        if (duracion<60){
            System.out.println("Solucion Rapida");
        } else if (duracion>=60) {
            System.out.println("Solucion prolongacion de tiempo");
        }
        this.duracion = duracion;
    }

    public void descripcion(){
        System.out.println("Ingresemos la descripcion");
        descripcion= leer.next();

    }


}
