package ntp;

public class Clase1 {


    /* jaja holaaaa

     */
    public static void main(String[] args) {

        /*Creando las primeras variables en Java. En este caso serán cinco: nombre,
apellido,edad,peso y altgitura. Asignaremos un valor acorde a su tipo y se
visualizará por consola.
         */

        String nombre = "Gabriel";
        String apellido = "Vega";
        int edad = 21;
        double peso = 95.5;
        double altura = 1.73;
        System.out.println("Los datos del alumno son:\n"+nombre+"\n"+apellido+"\n"+edad+"\n"+peso+"\n"+altura);




        /*En este caso necesitamos calcular el IMC de la persona( peso/altura^2), almacenar
el resultado con decimales y que se visualice en consola como un entero.

         */

       double imc = peso/(altura*altura);
        System.out.println("El imc de "+nombre+" equivale a "+Math.round(imc));





        /*Utiliza una estructura if para comprobar si la edad es par y múltiplo de 4.
        edad
         */

        if (edad%2==0 && edad%4==0){
            System.out.println("Edad es par y multuplo de 4");
        }else if (edad%2 !=0){
        System.out.println("La edad no es par ni multiplo de 4");}



        /*Creando las primeras variables en Java. En este caso serán cinco: nombre,
                apellido,edad,peso y altura. Asignaremos un valor acorde a su tipo y se
visualizará por consola*/

        String nom = "Gabriel";
        String ap = "Vega";
        int ed = 40;
        double pes = 50.5;
        double alt = 1.60;

        System.out.println("El nombre es "+nom+", de apellido " +ap+ ".");

        /* En este caso necesitamos calcular el IMC de la persona( peso/altura^2), almacenar
el resultado con decimales // y que se visualice en consola como un entero.
         */




/*Utiliza una estructura if para comprobar si la edad es par y múltiplo de 4. Si es multiplo de 4, es par.
*/
        if (ed%4==0) {
            System.out.println("Edad es multiplo de 4 y par");
        }
        else {
            System.out.println("Edad NO es multiplo de 4 e impar");
        }


/* Escribí un programa que multiplique todos los números divisibles por 3 en el
rango del 1 al 20.
 */
        int numerito = 1;
        int resultado = 1;
        while (numerito <=20)
        {
            if (numerito%3==0) {
            resultado*=numerito;



        }
          numerito ++;
            }

        System.out.println(resultado);



















    }

}
