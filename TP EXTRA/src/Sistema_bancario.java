import java.util.ArrayList;
import java.util.List;

// ─── Clase abstracta base ───────────────────────────────────────────────────
abstract class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método abstracto: cada subclase define su propia lógica
    public abstract void aplicarCargosMensuales();

    // Getters y setters
    public String getTitular() { return titular; }
    public double getSaldo()   { return saldo; }

    protected void setSaldo(double saldo) { this.saldo = saldo; }

    @Override
    public String toString() {
        return String.format("Titular: %s | Saldo: $%.2f", titular, saldo);
    }
}

// ─── Caja de ahorro: aplica interés del 2% ──────────────────────────────────
class CajaDeAhorro extends Cuenta {

    private static final double TASA_INTERES = 0.02;

    public CajaDeAhorro(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void aplicarCargosMensuales() {
        double interes = getSaldo() * TASA_INTERES;
        setSaldo(getSaldo() + interes);
        System.out.printf("[CajaDeAhorro] Interés acreditado: $%.2f%n", interes);
    }
}

// ─── Cuenta corriente: comisión fija del 5%, permite saldo negativo ─────────
class CuentaCorriente extends Cuenta {

    private static final double COMISION = 0.05;

    public CuentaCorriente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void aplicarCargosMensuales() {
        double cargo = getSaldo() * COMISION;
        // Permite saldo negativo: se descuenta sin validación
        setSaldo(getSaldo() - cargo);
        System.out.printf("[CuentaCorriente] Comisión cobrada: $%.2f%n", cargo);
    }
}

// ─── Cuenta de inversión: comisión variable según lo invertido ───────────────
class CuentaInversion extends Cuenta {

    private double montoInvertido;
    private double tasaComision;

    public CuentaInversion(String titular, double saldoInicial,
                           double montoInvertido, double tasaComision) {
        super(titular, saldoInicial);
        this.montoInvertido = montoInvertido;
        this.tasaComision   = tasaComision;
    }

    private double calcularComision() {
        return montoInvertido * tasaComision;
    }

    @Override
    public void aplicarCargosMensuales() {
        double comision = calcularComision();
        setSaldo(getSaldo() - comision);
        System.out.printf("[CuentaInversion] Comisión variable cobrada: $%.2f "
                        + "(%.1f%% sobre $%.2f invertidos)%n",
                          comision, tasaComision * 100, montoInvertido);
    }

    public void setMontoInvertido(double monto) { this.montoInvertido = monto; }
    public void setTasaComision(double tasa)    { this.tasaComision   = tasa;  }
}

// ─── Programa principal ──────────────────────────────────────────────────────
public class Sistema_bancario { 

    public static void main(String[] args) {

        // Polimorfismo: todas las cuentas se tratan como Cuenta
        List<Cuenta> cuentas = new ArrayList<>();

        cuentas.add(new CajaDeAhorro("Ana García", 10_000));
        cuentas.add(new CuentaCorriente("Luis Pérez", 5_000));
        cuentas.add(new CuentaInversion("Marta López", 20_000, 8_000, 0.015));

        System.out.println("=== ESTADO INICIAL ===");
        cuentas.forEach(System.out::println);

        System.out.println("\n=== PROCESANDO CARGOS MENSUALES ===");
        cuentas.forEach(Cuenta::aplicarCargosMensuales);   // polimorfismo

        System.out.println("\n=== ESTADO FINAL ===");
        cuentas.forEach(System.out::println);
    }
}