import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalPrestamos = 0;
        int totalRetrasos = 0;
        double totalPenalidades = 0;

        String[] opcionesMenu = {
            "Hacer prestamo",
            "Salir"
        };

        int opcion;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            for (int i = 0; i < opcionesMenu.length; i++) {
                System.out.println((i + 1) + ". " + opcionesMenu[i]);
            }
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion < 1 || opcion > opcionesMenu.length) {
                System.out.println("Opcion invalida. Intente de nuevo.");
                continue;
            }

            switch (opcion) {

                case 1:
                    System.out.print("Nombre estudiante: ");
                    String nombre = sc.nextLine();

                    System.out.print("Carrera: ");
                    String carrera = sc.nextLine();

                    Estudiante e = new Estudiante(nombre, carrera);

                    System.out.print("Nombre equipo: ");
                    String eq = sc.nextLine();

                    System.out.print("Penalidad por dia: ");
                    double pen = sc.nextDouble();
                    sc.nextLine();

                    Equipo equipo = new Equipo(eq, pen);

                    String estado = equipo.isDisponible() ? "Disponible" : "No disponible";
                    System.out.println("Estado: " + estado);

                    if (equipo.isDisponible()) {
                        equipo.prestar();

                        System.out.print("Dias de retraso: ");
                        int retraso = sc.nextInt();
                        sc.nextLine();

                        Prestamo p = new Prestamo(e, equipo, retraso);

                        double penalidad = p.calcularPenalidad();

                        totalPrestamos++;
                        totalPenalidades += penalidad;

                        if (p.tieneRetraso()) {
                            totalRetrasos++;
                        }

                        p.mostrar();
                    } else {
                        System.out.println("Equipo no disponible para prestamo.");
                    }

                    break;

                case 2:
                    System.out.println("Saliendo del sistema...");
                    break;
            }

        } while (opcion != 2);

        System.out.println("\n========== RESUMEN FINAL ==========");
        System.out.println("Total prestamos procesados: " + totalPrestamos);
        System.out.println("Total penalidades acumuladas: $" + totalPenalidades);
        System.out.println("Prestamos con retraso: " + totalRetrasos);
        System.out.println("Estudiantes registrados: " + Estudiante.getTotalEstudiantes());
        System.out.println("Equipos registrados: " + Equipo.getTotalEquipos());
    }
}