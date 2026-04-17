public class Gestor_de_empleados {

    private static int contadorLegajos = 100;
    private String legajo;
    private String nombre;
    private double salario;

    public Gestor_de_empleados(String nombre, double salario) {
        this.legajo = "CE04" + (contadorLegajos++);
        this.nombre = nombre;
        this.salario = salario;
    }

    public void aumentarPorPorcentaje(double porcentaje, String motivo) {
        salario += salario * (porcentaje / 100);
        System.out.println("Aumento por porcentaje aplicado. Motivo: " + motivo);
        System.out.println("Nuevo salario: " + salario);
    }

    public void aumentarPorMonto(double monto, String motivo) {
        salario += monto;
        System.out.println("Aumento por monto fijo aplicado. Motivo: " + motivo);
        System.out.println("Nuevo salario: " + salario);
    }

    public void mostrarInformacion() {
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("-------------------");
    }

    public static int getCantidadEmpleados() {
        return contadorLegajos - 100;
    }

    public static void main(String[] args) {
        Gestor_de_empleados emp1 = new Gestor_de_empleados("Juan Perez", 50000);
        Gestor_de_empleados emp2 = new Gestor_de_empleados("Maria Garcia", 60000);
        Gestor_de_empleados emp3 = new Gestor_de_empleados("Carlos Lopez", 55000);

        emp1.mostrarInformacion();
        emp2.mostrarInformacion();
        emp3.mostrarInformacion();

        emp1.aumentarPorPorcentaje(10, "Buen desempenio");
        emp2.aumentarPorMonto(5000, "Antiguedad");

        System.out.println("Total de empleados: " + getCantidadEmpleados());
    }
}