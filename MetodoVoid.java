import java.util.Scanner;

public class Estudiante {

    String nombre;
    int edad;
    String carrera;

    public void registrarDatos(Scanner sc){

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingresa la carrera: ");
        carrera = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine();

    }

    public void imprimirDatos(){

        System.out.println("-----------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Edad: " + edad);

    }

}
