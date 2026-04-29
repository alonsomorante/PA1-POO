public class Estudiante {

    private String nombre;
    private String carrera;

    private static int totalEstudiantes = 0;

    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
        totalEstudiantes++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
    }
}