package ej4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(new CamaraSeguridad("Cámara Entrada"));
        dispositivos.add(new Termostato("Termostato Sala"));
        dispositivos.add(new Smartphone("Smartphone Dueño"));

        System.out.println("===== CONECTANDO DISPOSITIVOS WIFI =====");
        for (Dispositivo d : dispositivos) {
            // Solo los que implementan ConectableWifi se conectan
            if (d instanceof ConectableWifi) {
                ((ConectableWifi) d).conectarseAWifi("CasaHogar_5G");
            }
        }

        System.out.println("\n===== TOMANDO FOTOGRAFÍAS =====");
        for (Dispositivo d : dispositivos) {
            if (d instanceof Fotografiable) {
                ((Fotografiable) d).tomarFotografia();
            }
        }
    }
}