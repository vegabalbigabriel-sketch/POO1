//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(Quico (20,20));
        System.out.println(Quico(54,4));
        String nombre = "Pablito";
        String apellido = "Gonza";
        int edad = 24;
        double peso = 80;
        double altura = 1.85;

        if (nombre.equals(apellido))
        System.out.println("Nombre y apellido son iguales");

        else {
            System.out.println("Nombre y apellido difieren");
        }

/* punto 8, cantidad de letras del nombre y cuales son */
        char inicial = nombre.charAt(0);
        System.out.println(inicial);
        System.out.println("La cantidad de letras del nombre es "+nombre.length());
        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);
            System.out.println(letra);
        }
        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("La vocal " + letra);
            }
        }



/*contar las vocales*/









/*un programa que sume los multiplos de 5 en el rango del 5 al 30 e imprima el total

 */

        int suma=0;
        for (int contador=5; contador <= 30; contador++) {
            if (contador%5==0){
                suma += contador;
                System.out.println("el multiplo es"+contador);
            }
        }
        System.out.println(suma+" es el total");


        }

        // decir si el primer numero es divisible por el segundo

     public static boolean Quico(int n1,int n2){
        return n1%n2==0;

     }




    }



