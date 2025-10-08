package empleadoLimpieza;

public class Main {

    public static void main(String[] args) {

        EmpleadoLimpiezaGeneral lauren = new EmpleadoLimpiezaGeneral("Lauren",35987467,8000.0,16);
        System.out.println(lauren.calcularSueldoBase());
        lauren.realizarHorasExtras(4);
        System.out.println(lauren.calcularSueldoBase());
        EmpleadoLavaVajilla cobre = new EmpleadoLavaVajilla("Cobre",45987256,8000.3);

        System.out.println(cobre.calcularSueldoBase());
        cobre.vajillaRotaHoy(3);
        System.out.println(cobre.calcularDescuento());
        System.out.println(cobre.calcularSueldoBase());
    //Polimorfismo
        System.out.println("PRACTICAS POLIMORFISMO");
        Empleado jamaica = new EmpleadoLavaVajilla("Jamaica",45956823,80000.0);
        System.out.println(jamaica.calcularSueldoBase());
        ((EmpleadoLavaVajilla)jamaica).vajillaRotaHoy(4);
        System.out.println(jamaica.calcularSueldoBase());

        jamaica=new EmpleadoLimpiezaGeneral("Jamaica",45956823,80000.0,0);

        System.out.println(jamaica.calcularSueldoBase());

    }


}
