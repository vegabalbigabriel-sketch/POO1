package ZoologicoVirtual;

public class Elefante extends Mamifero implements Viviparo {



    public Elefante(Integer id, String nombre, Integer edad, Integer cantidadDeCrias) {
        super(id, nombre, edad, cantidadDeCrias);
    }


    @Override
    public void gestar() {
        System.out.println(this.getNombre() + " esta Gestando");
    }

    @Override
    public void parir() {
        System.out.println(this.getNombre() + " ha parido");

    }
}
