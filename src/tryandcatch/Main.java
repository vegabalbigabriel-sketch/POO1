package tryandcatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//Ejercicio 1, division , try and catch
        int numero1, numero2;
        Scanner scanner = new Scanner (System.in);

        try {
            System.out.println("Ingrese dos numeros enteros sin coma y separados.");
            numero1=scanner.nextInt();
            numero2=scanner.nextInt();

            System.out.println(numero1/numero2);
        }
        catch (ArithmeticException | InputMismatchException exception){
            System.err.println("Ocurrió el siguiente error: " + exception.getMessage());
        }
        finally {
            System.out.println("Esto se ejecuta igualmente");
            scanner.nextLine();
        }
        System.out.println("El programa continua");

//Ejercicio 2, usuario ingresa 1 numero como cadena, luego convertir esa cadena a un numero entero.
//con try-catch maneja la excepcion  NumberFormatException que ocurre cuando se ingresa un numero invalido.
//Mostrar un mensaje de error en caso de que falle.

        System.out.println("Ingresa un numero");
        try {
            String numeroCadena = scanner.nextLine();
            Integer.valueOf(numeroCadena);
        }
        catch (NumberFormatException exception){
            System.err.println("Ocurrió el siguiente error: " + exception.getMessage());
            //throw exception;
        }
        finally {
            System.out.println("Esto se ejecuta tambien");
        }

        System.out.println("Fin del ejercicio");



//Ejercicio 3, Agrega una excepción personalizada al ejercicio de la clase anterior o crea una nueva lista
// ¿Qué pasa si buscamos un index fuera del rango en la colección List?










    }

}
