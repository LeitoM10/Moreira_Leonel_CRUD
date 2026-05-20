public class Persona {
    protected String cedula;
    protected String nombre;
    protected int edad;

    public Persona(String cedula, String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public void mostrarDatos() {
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}