package ej5;

public class Dragon extends MonstruoHostil implements Hechicero {
    public Dragon(double x, double y) {
        super("Dragón", x, y, 300);
    }

    @Override
    public void atacar() {
        System.out.println("El Dragón ataca con sus garras. 🐉");
    }

    @Override
    public void lanzarHechizo() {
        System.out.println("El Dragón lanza ¡Aliento de Fuego Ancestral! 🔥🐉");
    }

    @Override
    public void dibujar() {
        System.out.println("[🐉] Dragón en (" + getX() + ", " + getY() +
                ") - Vida: " + getPuntosDeVida());
    }
}
