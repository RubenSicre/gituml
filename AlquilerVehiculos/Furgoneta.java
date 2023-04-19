package AlquilerVehiculos;

public class Furgoneta extends VehiculoCarga{

    public Furgoneta() {
        super();
    }

    public Furgoneta(String matricula, int duracion, double tara) {
        super(matricula, duracion, tara);
    }

    @Override
    public double alquiler() {
        int dias = getDuracion();
        return (50 * dias) + (20 * getTara());
    }

    @Override
    public void recibo(){
        System.out.println("--------------------" + "\n" +
                            "FURGONETA" + "\n"+
                            "--------------------");
        super.recibo();
    }

}
