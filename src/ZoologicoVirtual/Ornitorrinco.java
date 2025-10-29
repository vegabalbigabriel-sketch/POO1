package ZoologicoVirtual;

public class Ornitorrinco extends Mamifero implements Oviparo{
    public Ornitorrinco(Integer id, String nombre, Integer edad, Integer cantidadDeCrias) {
        super(id, nombre, edad, cantidadDeCrias);
    }


    @Override
    public void ponerHuevos() {
        System.out.println("el ornitorrinco "+this.getNombre()+" ha puesto huevos");
    }




}
