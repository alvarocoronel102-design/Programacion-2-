package ej5;

public abstract class SerVivo extends EntidadEspacial {
    private int puntosDeVida;

    public SerVivo(double x, double y, int puntosDeVida) {
        super(x, y);
        this.puntosDeVida = puntosDeVida;
    }

    public int getPuntosDeVida() { return puntosDeVida; }

    public void recibirDanio(int danio) {
        puntosDeVida -= danio;
        if (puntosDeVida < 0) puntosDeVida = 0;
        System.out.println(getClass().getSimpleName() + " recibió " + danio +
                " de daño. Vida restante: " + puntosDeVida);
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }
}