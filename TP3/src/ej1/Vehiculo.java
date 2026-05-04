package ej1;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private double tarifaBaseAlquiler;

    public Vehiculo(String marca, String modelo, double tarifaBaseAlquiler) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaBaseAlquiler = tarifaBaseAlquiler;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getTarifaBaseAlquiler() { return tarifaBaseAlquiler; }

    public abstract void mostrarInformacion();
}
