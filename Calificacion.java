import java.util.Scanner;

public class Calificacion {

    String nombre;
    double[] nota = new double[3];

    public void ingreso(Scanner sc) {

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese sus notas");
        for (int x = 0; x < 3; x++) {
            System.out.print(x+1 + ") ");
            nota[x]= sc.nextDouble();
        }
        sc.nextLine();
    }

    public double calcularPromedio(){

        double suma = 0;
        for(int x=0; x<3; x++){
            suma += nota[x];
            }

        double promedio = suma / 3;
        return promedio;
    }

    public String estado(){

        double promedio = calcularPromedio();

        if (promedio >= 7 ){
            return "Aprobado";
        }
        else{
            return "Reprobado";
        }
    }

    public void mostrar(){

        System.out.println("--------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + String.format("%.2f", calcularPromedio()));
        System.out.println("Estado: " + estado());

    }
}

