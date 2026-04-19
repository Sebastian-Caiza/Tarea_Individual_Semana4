import java.util.Scanner;

public class PlantillaLuz {

    String nombreCliente;
    double consumo, costo;

    public void ingresoDatos(Scanner sc){

        System.out.print("Nombre del cliente: ");
        nombreCliente = sc.nextLine();
        System.out.print("Consumo de luz (kW): ");
        consumo = sc.nextDouble();
        System.out.print("Costo por kW: ");
        costo = sc.nextDouble();
        sc.nextLine();
    }

    public double calcularSubtotal(){

        double subtotal = consumo * costo;
        return subtotal;
    }

    public double calcularIva(){

        double iva = calcularSubtotal() * 0.15;
        return iva;

    }

    public double calcularTotal(){

        double total = calcularSubtotal() + (calcularIva() + calcularIva());
        return total;

    }

    public void imprimir(){

        System.out.print("-----------------");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Subtotal: " + String.format("%.2f", calcularSubtotal()));
        System.out.println("IVA: " + String.format("%.2f", calcularIva()));
        System.out.println("Total a pagar: " + String.format("%.2f", calcularTotal()) + "$");
    }



}
