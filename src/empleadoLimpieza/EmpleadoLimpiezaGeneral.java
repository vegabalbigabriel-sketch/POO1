package empleadoLimpieza;

public class EmpleadoLimpiezaGeneral extends Empleado {


    private Integer cantidadHorasExtra;
    private static final Integer HORASEXTRAMAXIMA = 20;
    private static Double precioHoraExtra = 3500.0;

    public EmpleadoLimpiezaGeneral(String nombre, Integer dni, Double sueldoBase, Integer cantidadHorasExtra) {
        super(nombre, dni, sueldoBase);
        this.cantidadHorasExtra = cantidadHorasExtra;
    }


    // Calcular adicional por horas extra Double

    public Double calcularAdicional() {
        return cantidadHorasExtra * precioHoraExtra;

    }

    @Override
    public Double calcularSueldoBase() {
        return this.sueldoBase + calcularAdicional();

    }

    ;


    // Realizar horas extra Double

    public void realizarHorasExtras(Integer horasARealizar){
        Integer horasAcumuladas=horasARealizar+cantidadHorasExtra;
        if (horasAcumuladas > HORASEXTRAMAXIMA){
            System.out.println("Maximo de horas extras alcanzado, Permiso denegado");
        }else {
            this.cantidadHorasExtra+=horasARealizar;
        }
    }






}
