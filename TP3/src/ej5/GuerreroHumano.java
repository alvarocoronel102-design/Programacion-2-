package ej5;

public class GuerreroHumano extends PersonajeJugable {
    public GuerreroHumano(String nombre, double x, double y) {
        super(nombre, x, y, 150);
    }

    @Override
    public void interactuarConEntorno() {
        System.out.println(getNombrePersonaje() + " inspecciona el área con su escudo.");
    }

    @Override
    public void dibujar() {
        System.out.println("[🗡] Guerrero Humano '" + getNombrePersonaje() +
                "' en (" + getX() + ", " + getY() + ") - Vida: " + getPuntosDeVida());
    }
}
