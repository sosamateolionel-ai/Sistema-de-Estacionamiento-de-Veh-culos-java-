public class estadiaEstacionamiento{

    int costoEstacionamiento;
    int costoEstadia;
    int costoFinal;
    String patente;
    String estadoEstadia;

    void ingresar() {

        this.estadoEstadia = "Activa";

        System.out.println("La estadia ha sido ingresada correctamente.");
        System.out.println("Estado de la estadia: " + this.estadoEstadia);
    }

    void salir() {

        this.estadoEstadia = "Finalizada";

        System.out.println("La estadia ha sido finalizada correctamente.");
        System.out.println("Estado de la estadia: " + this.estadoEstadia);
    }

    void calcularCostoFinal() {
        costoFinal = costoEstacionamiento + costoEstadia;
    }

    public static void main(String[] args) {

        estadiaEstacionamiento estadia = new estadiaEstacionamiento();
        estadia.costoEstacionamiento = 1500;
        estadia.costoEstadia = 5000;
        estadia.patente = "ABC123";
        
        System.out.println("Costo Estadia: " + estadia.costoEstadia);
        System.out.println("Costo Estacionamiento: " + estadia.costoEstacionamiento);
        System.out.println("Patente: " + estadia.patente);
        estadia.ingresar();
        estadia.calcularCostoFinal();
        estadia.salir();
        System.out.println("Costo Final: " + estadia.costoFinal);
        System.out.println("");

        estadiaEstacionamiento estadia2 = new estadiaEstacionamiento();
        estadia2.costoEstacionamiento = 2000;
        estadia2.costoEstadia = 6000;
        estadia2.patente = "XYZ789";

        System.out.println("Costo Estadia: " + estadia2.costoEstadia);
        System.out.println("Costo Estacionamiento: " + estadia2.costoEstacionamiento);
        System.out.println("Patente: " + estadia2.patente);
        estadia2.ingresar();
        estadia2.calcularCostoFinal();
        estadia2.salir();
        System.out.println("Costo Final: " + estadia2.costoFinal);
        System.out.println("");
    }

   
}