package BilleteraVirtual;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // lista de cuentas estatica
    static ArrayList<Cuenta> cuentas = new ArrayList<>();

    public static void main(String[] args) {
        //Probando metodos estaticos
        System.out.println(Cuenta.getLimiteExtraccion());
        Cuenta.setLimiteExtraccion(7080.0);
        System.out.println(Cuenta.getLimiteExtraccion());
        //
        Cuenta cuenta1 = new Cuenta(12345678, "Pantufla", 34567890, 25000.5);
        Cuenta cuenta2 = new Cuenta(45677443,"Pitufo",45687874, 2560.0);
        //
        System.out.println("Probando ingresar valores validos e invalidos al retirar dinero "+cuenta1.retirarDinero(1000.0));
        System.out.println("Probando ingresar valores validos e invalidos al retirar dinero "+cuenta1.retirarDinero(-20.0));

        //Prueba de transferencia entre cuenta 1 y 2
        System.out.println("Saldo cuenta 1 = "+ cuenta1.getSaldo() + " Saldo cuenta 2 = "+cuenta2.getSaldo());
        cuenta1.transferirDinero(cuenta2,3000.0);
        System.out.println("Saldo cuenta 1 = "+ cuenta1.getSaldo() + " Saldo cuenta 2 = "+cuenta2.getSaldo());

        //    Agregar, consultar y eliminar cuentas
        agregarCuenta(cuenta1);
        agregarCuenta(cuenta2);
        consultarCuentas();
        eliminarCuenta(cuenta2);
        consultarCuentas();
        //
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
        //Boton para saber si continuar
        boolean cargar = true;
        //Creo la instancia/objeto scanner
        Scanner scanner= new Scanner(System.in);
        while ( cargar ) {
            System.out.println("Ingrese las caracteristicas separadas por una coma");
            System.out.println("En este orden: nro de cuenta, nombre, dni, saldo");
            //Capturar la informacion que ingresa
            String informacionIngresada = scanner.nextLine();
            //genera un array con los elementos separados por "," SPLIT
            String[] datosSeparados = informacionIngresada.split(",");
            //El metodo ValueOf transforma
            Integer nroCuenta = Integer.valueOf(datosSeparados[0]);
            String nombre = datosSeparados[1];
            Integer dni = Integer.valueOf(datosSeparados[2]);
            Double saldo = Double.valueOf(datosSeparados[3]);

//Creo una nueva instancia de cuenta con los datos ingresados
            Cuenta cuentaCreada = new Cuenta(nroCuenta, nombre, dni, saldo);
            System.out.println("Creado");
            //Agregando cuenta creada a la array list Cuentas que es Estatica
            agregarCuenta(cuentaCreada);
            System.out.println("Queres sumar otra cuenta?");
            cargar = scanner.nextBoolean();
            scanner.nextLine();
        }
        for (Cuenta cadaCuenta:cuentas) {
            System.out.println(cadaCuenta.toString());

        }

    }














}