import java.util.TreeSet;

public class AreaComercial extends Cliente {
    /*
    * metodo alta de cliente
     */
    TreeSet listaCliente=new TreeSet();

    // Método para dar de alta un cliente


    public void setListaCliente(TreeSet listaCliente) {
        boolean nuevoCliente;
        if (listaCliente.add(ingresoDatos())) nuevoCliente = true;
        else nuevoCliente = false;


        this.listaCliente = listaCliente;
    }

   // public void darDeAltaCliente(Cliente nuevoCliente) {
    //   nuevoCliente.ingresoDatos();


      //  listaCliente.add(nuevoCliente);

        //return;
      //  System.out.println("Cliente dado de alta: " + listaCliente);
   // }

    // Método para dar de baja

    public void mostrarClientes() {
        System.out.println("Lista de clientes:");
        for (Object cliente : listaCliente) {
            System.out.println(listaCliente);
        }
    }

}