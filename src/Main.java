import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.git
public class Main {
    public static void main(String[] args) {

        Guia martinCirio = new Guia("MartinCirio", 13475243, 0001);
        PaqueteSimple paqueteSimple1 = new PaqueteSimple(1, "Mardel", 1000.0, 3,martinCirio);
        PaqueteSimple paqueteSimple3 = new PaqueteSimple(3,"Mendoza",20000.0,7,martinCirio);
        PaqueteSimple paqueteSimple2 = new PaqueteSimple(2,"Tigre",1200.0,5,martinCirio);


        //Ordenar paquetes por precio

        List<Paquete> paquetePrecios = new ArrayList<>();
        paquetePrecios.addAll (Arrays.asList(paqueteSimple1,paqueteSimple2,paqueteSimple3));
        paquetePrecios.forEach(paquete -> System.out.println(paquete));


        //Calcular el precio final de cada paquete

        paqueteSimple1.CalcularPrecioFinal(4);
        System.out.println(paqueteSimple1.CalcularPrecioFinal(4));


        //manejar las excursiones, sumar, confirmar y eliminar

        paqueteSimple2.Añadir("Congreso Nacional");
        paqueteSimple2.Consultar("Congreso Nacional");
        //paqueteSimple2.Eliminar("Congreso Nacional");
        paqueteSimple2.Consultar("Congreso Nacional");
        paqueteSimple2.Añadir("Parque Nacional");
        paqueteSimple2.Añadir("Juegos Didacticos");
        paqueteSimple2.Lista();

//Interfaz Comparable

        //Consultar Guia por DNI





    }}