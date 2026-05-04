package ej2;

public class PlanFamiliar extends Suscripcion {
    private int perfilesAdicionales;
    private double recargoPorPerfil;

    public PlanFamiliar(String correo, int numeroCliente, double costoBase,
                        int perfilesAdicionales, double recargoPorPerfil) {
        super(correo, numeroCliente, costoBase);
        this.perfilesAdicionales = perfilesAdicionales;
        this.recargoPorPerfil = recargoPorPerfil;
    }

    @Override
    public double calcularCostoMensual() {
        return getCostoBase() + (perfilesAdicionales * recargoPorPerfil);
    }
}