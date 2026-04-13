import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número entre 1 y 99: ");
        int numero = sc.nextInt();
        
        if (numero >= 1 && numero <= 9) {
            System.out.println("El número tiene 1 dígito.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El número tiene 2 dígitos.");
        } else {
            System.out.println("El número ingresado no está en el rango válido.");
        }
    }
}