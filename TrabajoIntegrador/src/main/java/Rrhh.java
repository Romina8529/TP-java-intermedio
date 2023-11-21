public class Rrhh extends Tecnico {

// metodo de dar alta al tecnico
    // metodo es emitir el informe de trabajo


    @Override
    public Object datosTecnico() {
        super.datosTecnico();
        return null;
    }

    @Override
    public void resolucionTrabajo(int cantidad) {
        super.resolucionTrabajo(cantidad);
    }



    public void altaTecnico(String alta){
        if (alta.equals(datosTecnico())){
            System.out.println("se encuentra en el sistema");
        }else {
            System.out.println("baja del sistema");
        }
    }

    public void informeTrabajo(String informe){
        if (informe.equals(resolucionTrabajo())){
            System.out.println(" Informe es Positivo");
        } else{
            System.out.println("Informe es Negativo");
        }
    }

    private String resolucionTrabajo() {
    return resolucionTrabajo();}
}
