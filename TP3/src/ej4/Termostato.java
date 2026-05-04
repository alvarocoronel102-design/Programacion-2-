package ej4;

public class Termostato extends Dispositivo implements ConectableWifi {
    public Termostato(String nombre) {
        super(nombre);
    }

    @Override
    public void conectarseAWifi(String nombreRed) {
        System.out.println("[" + getNombre() + "] Conectado a la red: " + nombreRed);
    }
}
