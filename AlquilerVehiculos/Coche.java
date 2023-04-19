package AlquilerVehiculos;

public class Coche extends VehiculoTransporte{

    public Coche() {
        super();
    }

    public Coche(String matricula, int duracion, int numPlazas) {
        super(matricula, duracion, numPlazas);
    }

    @Override
    public double alquiler() {
        int dias = getDuracion();
        return (50 * dias) + (1.5 * getNumPlazas() * dias);
    }

    @Override
    public void recibo(){
        System.out.println("--------------------" + "\n" +
                            "COCHE" + "\n"+
                            "--------------------");
        super.recibo();
    }

    public static void main(String[] args) {
        Coche c = new Coche("1234AA",9,3);
        c.recibo();
    }
    
}
