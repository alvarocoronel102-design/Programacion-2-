package ej5;

public abstract class MonstruoHostil extends SerVivo {
    private String especie;

    public MonstruoHostil(String especie, double x, double y, int vida) {
        super(x, y, vida);
        this.especie = especie;
    }

    public String getEspecie() { return especie; }

    public abstract void atacar();
}