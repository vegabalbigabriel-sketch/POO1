package empleadoLimpieza;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        EmpleadoLimpiezaGeneral lauren = new EmpleadoLimpiezaGeneral("Lauren", 35987467, 8000.0, 16);
        System.out.println(lauren.calcularSueldoBase());
        lauren.realizarHorasExtras(4);
        System.out.println(lauren.calcularSueldoBase());
        EmpleadoLavaVajilla cobre = new EmpleadoLavaVajilla("Cobre", 45987256, 8000.3);

        System.out.println(cobre.calcularSueldoBase());
        cobre.vajillaRotaHoy(3);
        System.out.println(cobre.calcularDescuento());
        System.out.println(cobre.calcularSueldoBase());
        //Polimorfismo
        System.out.println("PRACTICAS POLIMORFISMO");
        Empleado jamaica = new EmpleadoLavaVajilla("Jamaica", 35987467, 80000.0);
        System.out.println(jamaica.calcularSueldoBase());
        ((EmpleadoLavaVajilla) jamaica).vajillaRotaHoy(4);
        System.out.println(jamaica.calcularSueldoBase());

        Empleado raul = new EmpleadoLavaVajilla("Raul", 25874435, 3400.0);
        raul.registrarEntradaSalida();
        ((EmpleadoLavaVajilla) raul).vajillaRotaHoy(3);


        //REGISTRO ENTRADA Y SALIDA
        lauren.registrarEntradaSalida();


        //Metodos Clase Object
        System.out.println(lauren.equals(jamaica));


        jamaica = new EmpleadoLimpiezaGeneral("Jamaica", 35987467, 80000.0, 0);

        System.out.println(jamaica.calcularSueldoBase());

        //Conbinar clase Object con Array

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(jamaica);
        empleados.add(raul);
        empleados.add(cobre);
        empleados.add(lauren);
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println(empleados.get(i).toString());
        }
        for (Empleado empleado :empleados) {
            System.out.println(empleado.toString());
        }


        //En empleados esta dentro de un empleado
        System.out.println(jamaica.equals(lauren)+ " " +
                empleados.contains(lauren));

        //ordenar con compareto en orden de dni
        Collections.sort(empleados);
        empleados.forEach(empleado -> System.out.println(empleado));


        lauren.transferir("A");
        //cobre.transferir("B"); NO ES POSIBLE





    }


}
