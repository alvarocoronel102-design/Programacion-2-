package ej1;

public class Furgoneta extends Vehiculo {
    private double capacidadCargaKg;

    public Furgoneta(String marca, String modelo, double tarifaBaseAlquiler, double capacidadCargaKg) {
        super(marca, modelo, tarifaBaseAlquiler);
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public double getCapacidadCargaKg() { return capacidadCargaKg; }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== FURGONETA ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tarifa base: $" + getTarifaBaseAlquiler());
        System.out.println("Capacidad de carga: " + capacidadCargaKg + " kg");
    }
}
