public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Métodos para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    // Métodos para modificar los atributos
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para imprimir la información del empleado
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario);
    }
}