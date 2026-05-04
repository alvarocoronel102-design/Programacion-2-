package ej2;

public class PlanBasico extends Suscripcion {
    public PlanBasico(String correo, int numeroCliente, double costoBase) {
        super(correo, numeroCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return getCostoBase();
    }
}