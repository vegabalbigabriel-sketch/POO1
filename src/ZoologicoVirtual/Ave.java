package ZoologicoVirtual;

public class Ave extends Animal implements Oviparo{


    public Ave(Integer id, String nombre, Integer edad) {
        super(id, nombre, edad);
    }

    @Override
    public void comer(String alimento) {

    }

    @Override
    public void ponerHuevos() {
        System.out.println("el ave "+this.getNombre()+" ha puesto huevos");
    }
}
