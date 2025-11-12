package ZoologicoVirtual;

public abstract class Animal {

    //si una clase no tiene la palabra abstract no podes tener metodos abstractos

    public Integer id;
    public String nombre;
    public Integer edad;

    public Animal(Integer id, String nombre, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    //Get NOMBRE
    public String getNombre() {
        return nombre;
    }

    //Get ID
    public Integer getId() {
        return id;
    }


    //Set y Get EDAD
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
//Este es metodo abstracto, un contrato para las hijas o subclases
    public abstract void comer (String alimento);


    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
