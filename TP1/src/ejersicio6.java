import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos triángulos desea ingresar? ");
        int n = sc.nextInt();
        
        int cantEquilatero = 0;
        int cantIsosceles = 0;
        int cantEscaleno = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("-- Triángulo " + i + " --");
            System.out.print("Lado 1: ");
            int l1 = sc.nextInt();
            System.out.print("Lado 2: ");
            int l2 = sc.nextInt();
            System.out.print("Lado 3: ");
            int l3 = sc.nextInt();
            
            if (l1 == l2 && l2 == l3) {
                System.out.println("Es un triángulo EQUILÁTERO.");
                cantEquilatero++;
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Es un triángulo ISÓSCELES.");
                cantIsosceles++;
            } else {
                System.out.println("Es un triángulo ESCALENO.");
                cantEscaleno++;
            }
        }
        
        System.out.println("\n--- Resumen ---");
        System.out.println("Equiláteros: " + cantEquilatero);
        System.out.println("Isósceles:   " + cantIsosceles);
        System.out.println("Escalenos:   " + cantEscaleno);
        
        // Tipo con menor cantidad
        int menorCant = cantEquilatero;
        String tipoMenor = "Equilátero";
        
        if (cantIsosceles < menorCant) {
            menorCant = cantIsosceles;
            tipoMenor = "Isósceles";
        }
        if (cantEscaleno < menorCant) {
            tipoMenor = "Escaleno";
        }
        
        System.out.println("Tipo con menor cantidad: " + tipoMenor);
    }
}