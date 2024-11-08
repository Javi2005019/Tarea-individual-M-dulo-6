import java.util.ArrayList;

public class GestorEmpleados {
    private ArrayList<Empleado> empleados;

    // Constructor
    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    // Método para agregar un empleado
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }

    // Método para mostrar los detalles de los empleados
    public void mostrarEmpleados() {
        System.out.println("Lista de Empleados:");
        for (Empleado empleado : empleados) {
            empleado.imprimirInformacion();
        }
    }
}