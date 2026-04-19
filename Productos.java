import java.util.Scanner;

public class Productos {

    String nombre;
    double precio;
    int cantidad;

    public void ingresarDatos(Scanner sc){

        System.out.println("-------------------");
        System.out.print("Ingrese el nombre del producto: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el precio: ");
        precio = sc.nextDouble();
        System.out.print("Ingrese la cantidad: ");
        cantidad = sc.nextInt();
        sc.nextLine();
    }

    public void mostrarDatos(){

        double total = precio * cantidad;

        if (total > 1000 ){

            total = total -(total * 0.10);
        }

        System.out.println("----------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println();
        System.out.println("Total: " + total);

    }
}
