import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.git
public class Main {
    public static void main(String[] args) {

        Guia martinCirio = new Guia("MartinCirio", 13475243, 1);
        Guia lucasSanchez = new Guia ("LucasSanchez", 93153803,2);
        Guia matiasSapia = new Guia ("MatiasSapia",24486966,3);
        PaqueteSimple paqueteSimple1 = new PaqueteSimple(1, "Mardel", 1000.0, 3, martinCirio);
        PaqueteSimple paqueteSimple3 = new PaqueteSimple(3, "Mendoza", 20000.0, 7, martinCirio);
        PaqueteSimple paqueteSimple2 = new PaqueteSimple(2, "Tigre", 1200.0, 5, martinCirio);
        PaquetePremium paquetePremium1 = new PaquetePremium(1,"Hawaii",1000000.0,7,lucasSanchez);





        //Orden Map, encontrar paquete por el numero identificador
        HashMap<Integer, Guia> guias = new HashMap<Integer, Guia>();
        //.put(Object key, Object value) Agrega un elemento.*
        guias.put(martinCirio.getDni(), martinCirio);
        guias.put(lucasSanchez.getDni(), lucasSanchez);
        guias.put(matiasSapia.getDni(), matiasSapia);
        //Consultar la lista
        System.out.println("Key 2 corresponde a "+guias.get(93153803));


        //Ordenar paquetes por precio

        List<Paquete> paquetePrecios = new ArrayList<>();
        paquetePrecios.addAll(Arrays.asList(paqueteSimple1, paqueteSimple2, paqueteSimple3));
        paquetePrecios.forEach(paquete -> System.out.println(paquete));


        //Calcular el precio final de cada paquete

        paqueteSimple1.CalcularPrecioFinal();


        paqueteSimple2.CalcularPrecioFinal();


        paquetePremium1.CalcularPrecioFinal();



        //manejar las excursiones, sumar, confirmar y eliminar

        paqueteSimple2.Añadir("Congreso Nacional");
        paqueteSimple2.Consultar("Congreso Nacional");
        //paqueteSimple2.Eliminar("Congreso Nacional");
        paqueteSimple2.Consultar("Congreso Nacional");
        paqueteSimple2.Añadir("Parque Nacional");
        paqueteSimple2.Añadir("Juegos Didacticos");
        paqueteSimple2.Lista();
        paquetePremium1.Añadir("Niagara");
        //Implementando Interfaz
        paquetePremium1.añadirExcursion("Congreso Nacional");
        paquetePremium1.añadirExcursion("Tandil");



        //A continuación debe solicitarse a un usuario que ingrese un index para traer la información del
        // paquete correspondiente, en caso de que sea inexistente manejar el error para no interrumpir la ejecución.

        Scanner scanner = new Scanner (System.in);
        try{
            System.out.println("Ingresar un Index");
            Integer index = scanner.nextInt();
            System.out.println(paquetePrecios.get(index));
        } catch (IndexOutOfBoundsException|InputMismatchException e) {
            System.err.println(e);
        }
        System.out.println("El programa sigue");








    }
}