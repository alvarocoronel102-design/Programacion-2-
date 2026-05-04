package ej5;

public class Orco extends MonstruoHostil {
    public Orco(double x, double y) {
        super("Orco", x, y, 120);
    }

    @Override
    public void atacar() {
        System.out.println("El Orco golpea brutalmente con su maza. 💥");
    }

    @Override
    public void dibujar() {
        System.out.println("[👹] Orco en (" + getX() + ", " + getY() +
                ") - Vida: " + getPuntosDeVida());
    }
}
