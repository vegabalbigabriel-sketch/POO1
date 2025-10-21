package Editorial;

public class Boletin extends Publicación{

    //atributos de boletin

    private String sector;




    //construcor con los atributos de publicacion padre
    public Boletin(String nombre, Integer codigoUnico, String frecuencia, String sector) {
        super(nombre, codigoUnico, frecuencia);
        this.sector = sector;
    }








}
