package ZoologicoVirtual;

public class Pez extends Animal implements Oviparo{


    public Pez(Integer id, String nombre, Integer edad) {
        super(id, nombre, edad);
    }

    @Override
    public void comer(String alimento) {

    }


    @Override
    public void ponerHuevos() {
        System.out.println("el pez "+this.getNombre()+" ha puesto huevos");
    }
}
