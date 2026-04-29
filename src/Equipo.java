public class Equipo {

    private String nombre;
    private boolean disponible;
    private double penalidad;

    private static int totalEquipos = 0;

    public Equipo(String nombre, double penalidad) {
        this.nombre = nombre;
        this.penalidad = penalidad;
        this.disponible = true;
        totalEquipos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getPenalidad() {
        return penalidad;
    }

    public void setPenalidad(double penalidad) {
        this.penalidad = penalidad;
    }

    public static int getTotalEquipos() {
        return totalEquipos;
    }

    public String getEstado() {
        return disponible ? "Disponible" : "No disponible";
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }
}