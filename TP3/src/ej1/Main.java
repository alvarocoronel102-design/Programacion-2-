package ej1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> flota = new ArrayList<>();

        flota.add(new Furgoneta("Ford", "Transit", 150.0, 1200.0));
        flota.add(new Furgoneta("Mercedes", "Sprinter", 200.0, 1800.0));
        flota.add(new Motocicleta("Honda", "CB500", 80.0, 500));
        flota.add(new Motocicleta("Yamaha", "MT-07", 95.0, 689));

        System.out.println("===== REPORTE DE FLOTA =====");
        for (Vehiculo v : flota) {
            v.mostrarInformacion();
            System.out.println();
        }
    }
}

