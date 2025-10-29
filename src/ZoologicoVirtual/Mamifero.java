package ZoologicoVirtual;

public class Mamifero extends Animal {

    private Integer cantidadDeCrias;

    public Mamifero(Integer id, String nombre, Integer edad, Integer cantidadDeCrias) {
        super(id, nombre, edad);
        this.cantidadDeCrias = cantidadDeCrias;
    }

    @Override
    public void comer(String alimento) {
        System.out.println("Comio "+ alimento);
    }

    public void amamantar (){
        System.out.println("Amamanta a sus crias");
    }



}