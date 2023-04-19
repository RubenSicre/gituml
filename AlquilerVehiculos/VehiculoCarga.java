package AlquilerVehiculos;

public abstract class VehiculoCarga extends Vehiculo{
    
    private double tara;

    public VehiculoCarga() {
        super();
        this.tara = 0.0;
    }

    public VehiculoCarga(String matricula, int duracion, double tara) {
        super(matricula, duracion);
        this.tara = tara;
    }

    public double getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }   

    public abstract double alquiler();

    @Override
    public void recibo() {
        System.out.println("Matricula: " + getMatricula() +"\n"+
                            "Duración: " + getDuracion() + "\n"+
                            "Tara: " + tara + "\n" +
                            "Importe: "+ alquiler());
    }

}
