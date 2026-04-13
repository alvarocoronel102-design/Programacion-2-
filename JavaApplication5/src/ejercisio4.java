import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();
        
        System.out.println("Fecha ingresada: " + dia + "/" + mes + "/" + anio);
        
        if (mes >= 1 && mes <= 3) {
            System.out.println("Corresponde al primer trimestre (enero, febrero, marzo).");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("Corresponde al segundo trimestre (abril, mayo, junio).");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("Corresponde al tercer trimestre (julio, agosto, septiembre).");
        } else {
            System.out.println("Corresponde al cuarto trimestre (octubre, noviembre, diciembre).");
        }
    }
}