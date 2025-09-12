import java.util.Scanner;

public class Calculadora {
    private static final Double NUMERO_PI= Math.PI;
    public static Double elevarPotencia(Double numero1, Double numero2){
    Double resultado = Math.pow(numero1, numero2);
    return resultado;
    }

//Obtener el mínimo entre dos números ingresados

    public static Double obtenerMinimo(Double numero1, Double numero2){
        Double resultado=Math.min(numero1,numero2);
        return resultado;
    }


    //Calcular la circunferencia de un círculo (perímetro) al ingresar el radio. --> 2 * PI * radio.


    public static Double calcularCircunferencia(Double radio1){
        Double resultado = 2*NUMERO_PI*radio1;
        return resultado;

    }

//Permitir al usuario adivinar un número aleatorio del 1 al 10 teniendo la posibilidad de ingresar tres intentos.

    public static String adivinarNumero(){
        Double numeroAleatorio = Math.random()*10;
        Double numeroRedondeado = (double) Math.round(numeroAleatorio);
        //Scanner ingresar numero
        Scanner scanner = new Scanner(System.in);
        Double numeroIngresado = scanner.nextDouble();
        System.out.println(numeroIngresado);

        //comparar numero ingresado con numero generado


    }











}
