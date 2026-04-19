import java.util.Scanner;

public class HorasTrabajadas {

    String nombre;
    int horas;
    double pagoHora;

    public void ingresoDatos(Scanner sc){

        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el numero de horas: ");
        horas = sc.nextInt();
        System.out.print("Pago por hora: ");
        pagoHora = sc.nextDouble();
        sc.nextLine();

    }

    public double sueldoBase(){
        return horas * pagoHora;
    }

    public double bono(){

        double extra = sueldoBase() * 0.15;
        return extra;
    }

    public double sueldoFinal(){
        return sueldoBase() + bono();
    }

    public void imprimir(){

        System.out.println("------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + sueldoBase());
        System.out.println("Bono: " + bono());
        System.out.println("Sueldo final: " + sueldoFinal() + "$");
    }
}
