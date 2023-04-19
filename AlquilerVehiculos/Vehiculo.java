package AlquilerVehiculos;

public abstract class Vehiculo {
    private String matricula;
    private int duracion;

    public Vehiculo(){
        this("",0);
    }

    public Vehiculo(String matricula, int duracion) {
        this.matricula = matricula;
        this.duracion = duracion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public abstract double alquiler();

    public abstract void  recibo();
}
