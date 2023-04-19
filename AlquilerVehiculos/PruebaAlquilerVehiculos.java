package AlquilerVehiculos;

public class PruebaAlquilerVehiculos {
    public static void main(String[] args) {
        System.out.println("¿Cuántos vehículos quiere alquilar?");

        Alquiler a1 = new Alquiler(3,"ALSA");

        a1.mostrar();
        a1.imprimir();
    }
    
}
