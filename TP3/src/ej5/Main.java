package ej5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EntidadEspacial> entidades = new ArrayList<>();

        GuerreroHumano guerrero = new GuerreroHumano("Aragorn", 0, 0);
        MagoElfo mago = new MagoElfo("Gandalf", 1, 2);
        Orco orco = new Orco(5, 5);
        Dragon dragon = new Dragon(10, 10);

        entidades.add(guerrero);
        entidades.add(mago);
        entidades.add(orco);
        entidades.add(dragon);

        System.out.println("===== RENDERIZANDO MUNDO =====");
        for (EntidadEspacial e : entidades) {
            e.dibujar();
        }

        System.out.println("\n===== ACTUALIZANDO COORDENADAS =====");
        for (EntidadEspacial e : entidades) {
            e.actualizarCoordenadas(e.getX() + 1, e.getY() + 1);
        }

        System.out.println("\n===== CALCULANDO SUPERVIVENCIA =====");
        guerrero.recibirDanio(50);
        dragon.recibirDanio(200);
        for (EntidadEspacial e : entidades) {
            if (e instanceof SerVivo) {
                SerVivo sv = (SerVivo) e;
                System.out.println(e.getClass().getSimpleName() +
                        " está " + (sv.estaVivo() ? "VIVO ✓" : "MUERTO ✗"));
            }
        }

        System.out.println("\n===== ATAQUES MÁGICOS (solo hechiceros) =====");
        for (EntidadEspacial e : entidades) {
            if (e instanceof Hechicero) {
                ((Hechicero) e).lanzarHechizo();
            }
        }
    }
}