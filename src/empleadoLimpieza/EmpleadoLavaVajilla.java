package empleadoLimpieza;

public class EmpleadoLavaVajilla extends Empleado {


    public Integer contadorVajillaRota = 0;
    private static Double precioVajillaRota = 2000.0;

    public EmpleadoLavaVajilla(String nombre, Integer dni, Double sueldoBase) {
        super(nombre, dni, sueldoBase);
    }


    //* Acá iba a hacer como un scanner donde se ingresaba la vajilla rota, para luego sumarlo

    public void vajillaRotaHoy(Integer cantidadVajillaRota) {
        System.out.println("¿Cuanta vajilla se rompió hoy?");
        contadorVajillaRota = contadorVajillaRota + cantidadVajillaRota;
    }

    //Primero calcular la cantidad de vajilla rota por el valor de la vajilla

    public Double calcularDescuento() {
        double descuento = contadorVajillaRota * precioVajillaRota - precioVajillaRota;
        if (descuento<0){
            return 0.0;
        }
        return descuento;



    }

    //Restar el valor por de la vajilla al sueldo
    @Override
    public Double calcularSueldoBase (){
        return sueldoBase-calcularDescuento();
    }



}
