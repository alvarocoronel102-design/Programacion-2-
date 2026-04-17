public class Cuenta_Bancaria {

    private String numero_Cuenta;
    private String titular;
    private double saldo;

    public Cuenta_Bancaria(String numero, String nombre, double saldoInicial) {
        numero_Cuenta = numero;
        titular = nombre;
        saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Deposito exitoso. Saldo actual: " + saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Error: Saldo Insuficiente");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        }
    }

    public double consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
        return saldo;
    }

    public static void main(String[] args) {
        Cuenta_Bancaria miCuenta = new Cuenta_Bancaria("12345", "Juan Perez", 1000);

        miCuenta.depositar(500);
        miCuenta.retirar(200);
        miCuenta.consultarSaldo();
        miCuenta.retirar(2000);
    }
}