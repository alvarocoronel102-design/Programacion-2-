package ej3;

public class Main {
    public static void main(String[] args) {
        // El carrito solo conoce la interfaz, no le importa qué pasarela es
        PasarelaPago pago1 = new TarjetaCredito("4111111111111234", "Juan Pérez");
        PasarelaPago pago2 = new PayPal("juan@paypal.com");
        PasarelaPago pago3 = new Criptomoneda("0xABCD1234EF", "Bitcoin");

        System.out.println("===== PROCESANDO COMPRAS =====\n");

        procesarCompra(pago1, 250.00);
        System.out.println();
        procesarCompra(pago2, 89.99);
        System.out.println();
        procesarCompra(pago3, 499.50);
    }

    // Método polimórfico: no sabe ni le importa qué tipo de pasarela recibe
    public static void procesarCompra(PasarelaPago pasarela, double monto) {
        System.out.println("Iniciando cobro por $" + monto);
        pasarela.procesarPago(monto);
    }
}