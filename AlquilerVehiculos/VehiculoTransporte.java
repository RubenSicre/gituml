package AlquilerVehiculos;

public abstract class VehiculoTransporte extends Vehiculo{
    public int numPlazas;
    
    public VehiculoTransporte() {
        super();
        this.numPlazas = 0;
    }

    public VehiculoTransporte(String matricula, int duracion, int numPlazas) {
        super(matricula, duracion);
        this.numPlazas = numPlazas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    
    public abstract double alquiler();

    @Override
    public void recibo() {
        System.out.println("Matricula: " + getMatricula() +"\n"+
                            "Duración: " + getDuracion() + "\n"+
                            "Plazas: " + numPlazas + "\n" +
                            "Importe: "+ alquiler());
    }


    
}
