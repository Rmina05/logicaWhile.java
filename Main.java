import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroentrada = 0;
        int resultado = 0;
        int control = 1; 

        System.out.print("Ingrese el número que desea calcular: ");
        numeroentrada = scanner.nextInt();

        while (numeroentrada >= control) { 
            resultado += control; 
            control++; 
        }

        System.out.print("La suma de los primeros " + numeroentrada + "naturales es igual a " + resultado);

        scanner.close();
    }
}
