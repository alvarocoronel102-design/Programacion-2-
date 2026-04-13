import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la coordenada x (distinta de 0): ");
        int x = sc.nextInt();
        System.out.print("Ingrese la coordenada y (distinta de 0): ");
        int y = sc.nextInt();
        
        if (x > 0 && y > 0) {
            System.out.println("El punto se ubica en el 1° cuadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto se ubica en el 2° cuadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto se ubica en el 3° cuadrante.");
        } else {
            System.out.println("El punto se ubica en el 4° cuadrante.");
        }
    }
}