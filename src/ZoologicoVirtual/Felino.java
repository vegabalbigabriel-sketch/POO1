package ZoologicoVirtual;
//Esta clase seria abstracta, puma es la instancia
public class Felino extends Mamifero implements Viviparo{



    public Felino(Integer id, String nombre, Integer edad, Integer cantidadDeCrias) {
        super(id, nombre, edad, cantidadDeCrias);
    }


    @Override
    public void gestar() {
        System.out.println(this.getNombre()+" esta Gestando");
    }

    @Override
    public void parir() {
        System.out.println(this.getNombre()+" ha parido");
    }
}
