public class Prestamo {

    private Estudiante estudiante;
    private Equipo equipo;
    private int diasRetraso;

    private static int totalPrestamos = 0;

    public Prestamo(Estudiante estudiante, Equipo equipo, int diasRetraso) {
        this.estudiante = estudiante;
        this.equipo = equipo;
        this.diasRetraso = diasRetraso;
        totalPrestamos++;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getDiasRetraso() {
        return diasRetraso;
    }

    public void setDiasRetraso(int diasRetraso) {
        this.diasRetraso = diasRetraso;
    }

    public static int getTotalPrestamos() {
        return totalPrestamos;
    }

    public double calcularPenalidad() {
        return diasRetraso * equipo.getPenalidad();
    }

    public boolean tieneRetraso() {
        return diasRetraso > 0;
    }

    public void mostrar() {
        estudiante.mostrar();
        System.out.println("Equipo: " + equipo.getNombre());
        System.out.println("Retraso: " + diasRetraso);
        System.out.println("Penalidad: " + calcularPenalidad());
    }
}