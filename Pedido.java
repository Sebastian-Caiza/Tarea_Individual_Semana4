import java.util.Scanner;

public class Pedido {

    String cliente, plato;
    double precio;
    int cantidad;

    public void ingresarPedido(Scanner sc){

        System.out.print("Nombre del cliente: ");
        cliente = sc.nextLine();
        System.out.print("Pedido: ");
        plato = sc.nextLine();
        System.out.print("Precio: ");
        precio = sc.nextDouble();
        System.out.print("Cantidad: ");
        cantidad = sc.nextInt();
        sc.nextLine();

    }

    public double subtotal(){
        return precio * cantidad;
    }

    public  double descuento(){
        double des = subtotal();

        if (des > 25) {
            return des * 0.10;
        }
        else{
            return 0;
        }
    }

    public  double totalFinal(){
        return subtotal() - descuento();
    }

    public void imprimirPedido(){

        System.out.println("-------------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Plato: " + plato);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal());
        System.out.println("Descuento: " + descuento());
        System.out.println("Total final: " + totalFinal() + "$");

    }
}
