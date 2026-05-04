package ej3;

public class TarjetaCredito implements PasarelaPago {
    private String numeroTarjeta;
    private String titular;

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("[TARJETA DE CRÉDITO]");
        System.out.println("Conectando con red bancaria...");
        System.out.println("Validando tarjeta terminada en " + numeroTarjeta.substring(numeroTarjeta.length() - 4));
        System.out.printf("Procesando cargo de $%.2f a nombre de %s%n", monto, titular);
        System.out.println("Pago aprobado ✓");
    }
}
