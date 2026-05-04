package ej2;

public abstract class Suscripcion {
    private String correoTitular;
    private int numeroCliente;
    private double costoBase;

    public Suscripcion(String correoTitular, int numeroCliente, double costoBase) {
        this.correoTitular = correoTitular;
        this.numeroCliente = numeroCliente;
        this.costoBase = costoBase;
    }

    public String getCorreoTitular() { return correoTitular; }
    public int getNumeroCliente() { return numeroCliente; }
    public double getCostoBase() { return costoBase; }

    public abstract double calcularCostoMensual();
}
