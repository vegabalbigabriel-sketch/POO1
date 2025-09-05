import java.util.Arrays;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Clase5 {
    public static void main(String[] args) {

        /*1.4 Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un mensaje.
         */

        String pablo = "Lucrecio";
        String violeta = "Caramelo";
        if (pablo.compareTo(violeta)==0){
            System.out.println("Los nombres son iguales");
        }else {
            System.out.println("Los nombres son diferentes");
        }

        pablo.compareTo(violeta);




        /*2.5 Crea una fecha de nacimiento y calcula la edad. Además imprimí por consola la edad, junto con la fecha formateada de esta forma “YY MM DD”.
*/

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(2000, 9, 25);
        DateTimeFormatter fechaHoraPersonalizada= DateTimeFormatter.ofPattern("yyy MM dd");
        System.out.println(fechaNacimiento.format(fechaHoraPersonalizada));
        System.out.println(fechaActual.getYear()-fechaNacimiento.getYear());





       /*1.6 Crea un array de cuatro películas  e imprimirlas por orden alfabético utilizando for-each.
        */


        String[] peliculas = {"Batman", "Megalopolis", "Mohana", "Atlantis"};
        Arrays.sort(peliculas);
        for (String pelicula : peliculas) {
            System.out.println(pelicula);
        }




        /*2.6Crea un nuevo array que contenga la lista de películas en mayúscula. */


        String[] pelismayuscula = new String [peliculas.length];
        for (int peli = 0; peli <= peliculas.length; peli++) {
            String pelimayus = peliculas[peli].toUpperCase();
            pelismayuscula[peli]=pelimayus;
            System.out.println(pelismayuscula[peli]);
        }







    }
}