import java.util.Scanner;

public class Cliente {
    private int cuit, telefono;
    private String razonSocial, email, servicioContratado;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cliente() {

    }


    public Object ingresoDatos() {//metodo llenado de dato del cliente
        System.out.println("Ingresemos cuit del cliente");
        cuit = leer.nextInt();
        System.out.println("Ingresemos razon social");
        razonSocial = leer.next();
        System.out.println("ingresemos el telefono del cliente");
        telefono = leer.nextInt();
        System.out.println("ingresemos el email del cliente");
        email = leer.next();
        System.out.println("Ingresmos el servicio solicitado");
        servicioContratado = leer.next();


        return null;
    }







    public void servi() {
        System.out.println("ingresamos el servicio contratado");
        servicioContratado = leer.next();

    }

}