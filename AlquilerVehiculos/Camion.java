package AlquilerVehiculos;

public class Camion extends VehiculoCarga{

    private final static double PLUS_CAMION = 40.0; 

    public Camion(){
        super();
    }

    public Camion(String matricula, int duracion, double tara) {
        super(matricula, duracion, tara);
    }


    @Override
    public double alquiler() {
        int dias = getDuracion();
        return (50 * dias) + (20 * getTara()) + PLUS_CAMION; 
    }

    @Override
    public void recibo(){
        System.out.println("--------------------" + "\n" +
                            "CAMIÓN" + "\n"+
                            "--------------------");
        super.recibo();
    }
}
