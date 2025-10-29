package empleadoLimpieza;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Empleado implements Comparable<Empleado>{

    private String nombre;
    private Integer dni;
    protected Double sueldoBase;


    public Empleado (String nombre, Integer dni, Double sueldoBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBase = sueldoBase;
    }


    //calcular sueldo Double

    public abstract Double calcularSueldoBase();


    // visualizar informacion


    //Registrar Entrada y Salida
    public final void registrarEntradaSalida (){
        System.out.println("Fichó en este horario" + LocalDateTime.now());
    }

//devuelve la informacion del objeto como un texto
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", sueldoBase=" + sueldoBase +
                '}';
    }

    @Override
    public boolean equals (Object O){
        if (O == null || ! (O instanceof Empleado)){
            return false;
        }
        //Casting
        Empleado empleadoTransformado = (Empleado) O;
        return Objects.equals(empleadoTransformado.dni, this.dni);

    }

// Si es falso que el objeto que recibo es una instancia de la clase empleado retorna falso, no son iguales.



//Hashcode transforma el objeto en un numero para ordenar en estructura y encontrarlo
    @Override
    public int hashCode (){
        return Objects.hash(dni,nombre);
    }



    //Orden por dni
    @Override
    public int compareTo (Empleado o){
        return dni.compareTo(o.dni);
    }




}











