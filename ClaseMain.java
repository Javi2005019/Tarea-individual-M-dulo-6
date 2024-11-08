import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEmpleados gestor = new GestorEmpleados();

        while (true) {
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Mostrar Empleados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del empleado: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el salario del empleado: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();  // Limpiar el buffer
                    Empleado nuevoEmpleado = new Empleado(nombre, edad, salario);
                    gestor.agregarEmpleado(nuevoEmpleado);
                    break;
                case 2:
                    gestor.mostrarEmpleados();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}