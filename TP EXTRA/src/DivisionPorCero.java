public class DivisionPorCero {

    public static void main(String[] args) {

        // ─── 1. División entera ───────────────────────────────────────────
        System.out.println("=== ENTEROS ===");
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;            // Lanza excepción
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage()); // / by zero
        }

        // ─── 2. División decimal ──────────────────────────────────────────
        System.out.println("\n=== DECIMALES (double) ===");
        double x = 10.0;
        double y = 0.0;

        double r1 = x / y;    //  positivo / 0.0
        double r2 = -x / y;   // negativo / 0.0
        double r3 = 0.0 / y;  //      0.0 / 0.0

        System.out.println(" 10.0 / 0.0 = " + r1);   // Infinity
        System.out.println("-10.0 / 0.0 = " + r2);   // -Infinity
        System.out.println(" 0.0  / 0.0 = " + r3);   // NaN

        // ─── 3. Verificaciones útiles ─────────────────────────────────────
        System.out.println("\n=== VERIFICACIONES ===");
        System.out.println("¿Es infinito?  " + Double.isInfinite(r1));  // true
        System.out.println("¿Es NaN?       " + Double.isNaN(r3));       // true
        System.out.println("NaN == NaN?    " + (r3 == r3));             // false (!)
    }
}