import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Reloj {

    private int hora;
    private int minutos;
    private int segundos;

    public void establecerHora(int h, int m, int s) {
        hora = h;
        minutos = m;
        segundos = s;
    }

    public void establecerHoraActual() {
        ZonedDateTime ahora = ZonedDateTime.now(ZoneId.of("America/Argentina/Buenos_Aires"));
        hora = ahora.getHour();
        minutos = ahora.getMinute();
        segundos = ahora.getSecond();
    }

    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d%n", hora, minutos, segundos);
    }

    public void avanzarSegundo() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                hora++;
                if (hora == 24) hora = 0;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Reloj miReloj = new Reloj();
        miReloj.establecerHoraActual();

        // 3 minutos = 180 segundos
        for (int i = 0; i < 180; i++) {
            miReloj.mostrarHora();
            Thread.sleep(1000); // espera 1 segundo real
            miReloj.avanzarSegundo();
        }
    }
}