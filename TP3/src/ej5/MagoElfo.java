package ej5;

public class MagoElfo extends PersonajeJugable implements Hechicero {
    public MagoElfo(String nombre, double x, double y) {
        super(nombre, x, y, 90);
    }

    @Override
    public void interactuarConEntorno() {
        System.out.println(getNombrePersonaje() + " lee las runas del entorno.");
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(getNombrePersonaje() + " lanza ¡Bola de Fuego! ✨🔥");
    }

    @Override
    public void dibujar() {
        System.out.println("[🧝] Mago Elfo '" + getNombrePersonaje() +
                "' en (" + getX() + ", " + getY() + ") - Vida: " + getPuntosDeVida());
    }
}