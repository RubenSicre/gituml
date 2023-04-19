package AlquilerVehiculos;

public class Bus extends VehiculoTransporte{

    public Bus() {
        super();
    }

    public Bus(String matricula, int duracion, int numPlazas) {
        super(matricula, duracion, numPlazas);
    }

    @Override
    public double alquiler() {
        int dias = getDuracion();
        return (50 * dias) + (1.5 * (getNumPlazas()*2) * dias); 
    }
    
    @Override
    public void recibo(){
        System.out.println("--------------------" + "\n" +
                            "BUS" + "\n"+
                            "--------------------");
        super.recibo();
    }

    public static void main(String[] args) {
        Bus b = new Bus("1234AA",9,3);
        b.recibo();
    }
}
