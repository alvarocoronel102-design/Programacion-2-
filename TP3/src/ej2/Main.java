package ej2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Suscripcion> suscripciones = new ArrayList<>();

        suscripciones.add(new PlanBasico("juan@mail.com", 1001, 9.99));
        suscripciones.add(new PlanFamiliar("maria@mail.com", 1002, 9.99, 3, 2.50));
        suscripciones.add(new PlanPremium("carlos@mail.com", 1003, 9.99, 5.00));
        suscripciones.add(new PlanFamiliar("ana@mail.com", 1004, 9.99, 1, 2.50));

        double totalIngresos = 0;
        System.out.println("===== FACTURACIÓN MENSUAL =====");
        for (Suscripcion s : suscripciones) {
            double costo = s.calcularCostoMensual();
            System.out.printf("Cliente %d (%s): $%.2f%n",
                    s.getNumeroCliente(), s.getCorreoTitular(), costo);
            totalIngresos += costo;
        }
        System.out.printf("%nINGRESOS TOTALES: $%.2f%n", totalIngresos);
    }
}