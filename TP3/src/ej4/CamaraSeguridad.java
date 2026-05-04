package ej4;

public class CamaraSeguridad extends Dispositivo implements Fotografiable {
    public CamaraSeguridad(String nombre) {
        super(nombre);
    }

    @Override
    public void tomarFotografia() {
        System.out.println("[" + getNombre() + "] Fotografía capturada.");
    }
}