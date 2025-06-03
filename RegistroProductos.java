import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RegistroProductos {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Ingrese el ID del producto:");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la marca del producto:");
            String marca = scanner.nextLine();

            System.out.println("Ingrese el precio del producto:");
            double precio = Double.parseDouble(scanner.nextLine());

            Producto producto = new Producto(id, nombre, marca, precio);
            productos.add(producto);

            System.out.println("¿Desea agregar otro producto? (s/n):");
            continuar = scanner.nextLine().toLowerCase();
        } while (continuar.equals("s"));

        // Mostrar productos usando Iterator
        System.out.println("\nProductos registrados:");
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto p = iterator.next();
            System.out.println(p);
        }

        scanner.close();
    }
}
