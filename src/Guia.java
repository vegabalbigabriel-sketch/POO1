public class Guia {
    //atributos nombre, dni y matricula

    private String nombre;
    private Integer dni;
    private Integer matricula;

    //constructor

    public Guia(String nombre, Integer dni, Integer matricula) {
        this.nombre = nombre;
        this.dni = dni;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Guia{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", matricula=" + matricula +
                '}';
    }
}
