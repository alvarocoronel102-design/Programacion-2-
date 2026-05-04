package ej3;

public class PayPal implements PasarelaPago {
    private String cuentaPayPal;

    public PayPal(String cuentaPayPal) {
        this.cuentaPayPal = cuentaPayPal;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("[PAYPAL]");
        System.out.println("Iniciando sesión en PayPal API...");
        System.out.println("Cuenta origen: " + cuentaPayPal);
        System.out.printf("Transfiriendo $%.2f mediante PayPal%n", monto);
        System.out.println("Transferencia completada ✓");
    }
}
