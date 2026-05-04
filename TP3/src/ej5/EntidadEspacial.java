package ej5;

public abstract class EntidadEspacial {
    private double x;
    private double y;

    public EntidadEspacial(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public void actualizarCoordenadas(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println(getClass().getSimpleName() + " se movió a (" + x + ", " + y + ")");
    }

    public abstract void dibujar();
}
