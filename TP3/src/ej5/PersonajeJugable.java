package ej5;

public abstract class PersonajeJugable extends SerVivo {
    private String nombrePersonaje;

    public PersonajeJugable(String nombre, double x, double y, int vida) {
        super(x, y, vida);
        this.nombrePersonaje = nombre;
    }

    public String getNombrePersonaje() { return nombrePersonaje; }

    public abstract void interactuarConEntorno();
}

