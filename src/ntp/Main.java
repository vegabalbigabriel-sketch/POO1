package ntp;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // lista de cuentas
    static ArrayList<Cuenta> cuentas = new ArrayList<>();

    public static void main(String[] args) {
        //
        Cuenta cuenta1 = new Cuenta(12345678, "Pantufla", 34567890, 25000.5);
        Cuenta cuenta2 = new Cuenta(45677443,"Pitufo",45687874, 2560.0);
        System.out.println(cuenta1.retirarDinero(1000.0));
        agregarCuenta(cuenta1);
        agregarCuenta(cuenta2);
        consultarCuentas();
        eliminarCuenta(cuenta2);
        consultarCuentas();
        Cuenta.setLimiteExtraccion(500.0);
        Cuenta.getLimiteExtraccion();
        System.out.println(Cuenta.getLimiteExtraccion());
        agregarCuentasScanner();
    }

    //Consultar y Agregar Cuentas
    private static void consultarCuentas() {
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta.toString());
        }
    }

    private static void agregarCuenta(Cuenta cuenta) {
        if (cuentas.contains(cuenta)) {
            System.out.println("Ya esta registrado");
        } else {
            cuentas.add(cuenta);
        }
    }

    // Eliminar Cuentas

    public static void eliminarCuenta(Cuenta cuenta) {
        if (cuentas.contains(cuenta)) {
            cuentas.remove(cuenta);
            System.out.println("La cuenta fue eliminada");
        }
        else {
            System.out.println("La cuenta no esta registrada");
        }


    }




    //Array que se repite cuantas veces quiera el usuario

    public static void agregarCuentasScanner(){
        boolean cargar = true;
        Scanner scanner= new Scanner(System.in);
        while ( cargar ) {
            System.out.println("Ingrese las caracteristicas separadas por una coma");
            System.out.println("En este orden: nro de cuenta, nombre, dni, saldo");
            String informacionIngresada = scanner.nextLine();
            //genera un array con los elementos separados por ","
            String[] datosSeparados = informacionIngresada.split(",");
            Integer nroCuenta = Integer.valueOf(datosSeparados[0]);
            String nombre = datosSeparados[1];
            Integer dni = Integer.valueOf(datosSeparados[2]);
            Double saldo = Double.valueOf(datosSeparados[3]);


            Cuenta cuentaCreada = new Cuenta(nroCuenta, nombre, dni, saldo);
            System.out.println("Creado");
            agregarCuenta(cuentaCreada);
            System.out.println("Queres sumar otra cuenta?");
            cargar = scanner.nextBoolean();
            scanner.nextLine();
        }

    }














}