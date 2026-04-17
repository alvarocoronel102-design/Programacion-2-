import java.util.Scanner;

public class Calculadora {

    public double sumar(double a, double b) { return a + b; }
    public double restar(double a, double b) { return a - b; }
    public double multiplicar(double a, double b) { return a * b; }
    public double dividir(double a, double b) {
        if (b == 0) { System.out.println("Error: no se puede dividir por cero"); return 0; }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Ingresa el primer numero: ");
        double a = scanner.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        double b = scanner.nextDouble();

        System.out.println("Suma:        " + calc.sumar(a, b));
        System.out.println("Resta:       " + calc.restar(a, b));
        System.out.println("Multiplicar: " + calc.multiplicar(a, b));
        System.out.println("Division:    " + calc.dividir(a, b));
    }
}