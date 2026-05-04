package ej3;

public class Criptomoneda implements PasarelaPago {
    private String walletDestino;
    private String tipoCripto;

    public Criptomoneda(String walletDestino, String tipoCripto) {
        this.walletDestino = walletDestino;
        this.tipoCripto = tipoCripto;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("[CRIPTOMONEDA - " + tipoCripto + "]");
        System.out.println("Conectando con blockchain...");
        System.out.println("Wallet destino: " + walletDestino);
        System.out.printf("Convirtiendo y enviando $%.2f en %s%n", monto, tipoCripto);
        System.out.println("Transacción confirmada en blockchain ✓");
    }
}
