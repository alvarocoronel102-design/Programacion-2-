import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese nota del parcial 1: ");
        int p1 = sc.nextInt();
        System.out.print("Ingrese nota del parcial 2: ");
        int p2 = sc.nextInt();
        System.out.print("Ingrese nota del parcial 3: ");
        int p3 = sc.nextInt();
        
        double promedio = (p1 + p2 + p3) / 3.0;
        System.out.println("Promedio: " + promedio);
        
        if (promedio >= 8) {
            System.out.println("El alumno está promocionado.");
        } else {
            System.out.println("El alumno NO está promocionado.");
        }
    }
}