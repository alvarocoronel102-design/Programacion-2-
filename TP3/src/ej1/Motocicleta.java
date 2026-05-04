package ej1;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, double tarifaBaseAlquiler, int cilindrada) {
        super(marca, modelo, tarifaBaseAlquiler);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() { return cilindrada; }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== MOTOCICLETA ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tarifa base: $" + getTarifaBaseAlquiler());
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
