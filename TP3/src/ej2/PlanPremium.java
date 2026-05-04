package ej2;

public class PlanPremium extends Suscripcion {
    private double cargoExtra4KOffline;

    public PlanPremium(String correo, int numeroCliente, double costoBase, double cargoExtra4KOffline) {
        super(correo, numeroCliente, costoBase);
        this.cargoExtra4KOffline = cargoExtra4KOffline;
    }

    @Override
    public double calcularCostoMensual() {
        return getCostoBase() + cargoExtra4KOffline;
    }
}
