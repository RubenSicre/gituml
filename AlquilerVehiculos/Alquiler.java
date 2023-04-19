package AlquilerVehiculos;

import java.util.List;
import java.util.Scanner;

//Al poner final no permitimos que nadie herede de ella
public final class Alquiler implements Exportable{

    private Vehiculo[] pedido;
    private String empresa;

    public Alquiler(int numVehiculos, String empresa){
        Scanner sc = new Scanner(System.in);
        this.pedido = new Vehiculo[numVehiculos];
        this.empresa = empresa;
        
        for(int i = 0;i<numVehiculos;i++){
            System.out.println("Introduce el vehiculo "+(i+1)+" (Tipo C, B, F o T): ");
            String tipo = sc.next();
            System.out.println("Introduce matrícula: ");
            String matricula = sc.next();
            System.out.println("Introduce duración del alquiler: ");
            int duracion = sc.nextInt();
            sc.nextLine();

            int numPlazas = 0;
            double tara = 0.0;

            Vehiculo vehiculo = null;
            switch(tipo){
                case "C":
                    System.out.println("Introduce el número de plazas: ");
                    numPlazas = sc.nextInt();
                    vehiculo = new Coche(matricula,duracion,numPlazas);
                    break;
                case "B":
                    System.out.println("Introduce el número de plazas: ");
                    numPlazas = sc.nextInt();
                    vehiculo = new Bus(matricula,duracion,numPlazas);
                    break;
                case "F":
                    System.out.println("Introduce la tara: ");
                    tara = sc.nextDouble();
                    vehiculo = new Furgoneta(matricula,duracion,tara);
                    break;
                case "T":
                    System.out.println("Introduce la tara: ");
                    tara = sc.nextDouble();
                    vehiculo = new Camion(matricula,duracion,tara);
                    break;
                default:
                    System.out.println("El tipo introducido es incorrecto");
                    i--;
                    break;
            }

            if(vehiculo != null)
                pedido[i] = vehiculo;
        }
    }

    public double importeTotal(){
        double total = 0.0;
        for(Vehiculo vehiculo : pedido){
            total += vehiculo.alquiler();
        }

        return total;
    }

    public double importe(int pos){
        return pedido[pos].alquiler();
    }

    @Override
    public void mostrar(){
        System.out.println("Total alquiler: "+importeTotal() +"€");
        System.out.println("----------------------------------");
        System.out.println("DETALLE");
        System.out.println("----------------------------------");

        for(int i=0;i<pedido.length;i++){
            System.out.println("VEHÍCULO "+(i+1));
            pedido[i].recibo();
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo....");
    }
    
}
