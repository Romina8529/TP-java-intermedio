import java.util.Scanner;

public class Tecnico {
    private String nombreTecnico, especialidad;
    private int duracionTrabajo;//realizado
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
    * metodo de datos del tecnico
     */

    public Object datosTecnico(){
        System.out.println("ingresamos el nombre del tecnico");
        nombreTecnico= leer.nextLine();
        System.out.println("Ingresemos la especialidad del tecnico");
        especialidad= leer.nextLine();
        return null;
    }




    /*
     * metodo resolucion trabajo
     */
    public void resolucionTrabajo(int cantidad) {// cantidad trabajo realizado
        System.out.println("Ingresemos cantidad de trabajo realizado");
        duracionTrabajo = leer.nextInt();
        if (cantidad==duracionTrabajo){
               if(cantidad>=150){
                   System.out.println("Trabajo Logrado");
               } else if (duracionTrabajo<=150) {
                   System.out.println("Trabajo No Logrado");
               }
        }

    }
}