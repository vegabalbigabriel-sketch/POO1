package empleadoLimpieza;

public class Empleado {

    private String nombre;
    private Integer dni;
    protected Double sueldoBase;


    public Empleado (String nombre, Integer dni, Double sueldoBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBase = sueldoBase;
    }


    //calcular sueldo Double

    public Double calcularSueldoBase (){

        return this.sueldoBase;

    };



    // visualizar informacion


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", sueldoBase=" + sueldoBase +
                '}';

    }




}
