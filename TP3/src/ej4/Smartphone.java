package ej4;

// Smartphone implementa AMBAS interfaces → herencia múltiple de comportamiento
public class Smartphone extends Dispositivo implements Fotografiable, ConectableWifi {
    public Smartphone(String nombre) {
        super(nombre);
    }

    @Override
    public void tomarFotografia() {
        System.out.println("[" + getNombre() + "] Selfie tomada con cámara trasera.");
    }

    @Override
    public void conectarseAWifi(String nombreRed) {
        System.out.println("[" + getNombre() + "] WiFi conectado a: " + nombreRed);
    }
}
