import java.util.HashSet;

public class Paquete {

    //atributos identificador, titulo, precio base, cantidad de dias, nombre irrepetible de excursion

    private Integer identificador;
    private String titulo;
    private Double precioBase;
    private Integer cantidadDias;
    private HashSet <String> nombreExcursion = new HashSet();

    //constructor

    public Paquete(Integer identificador, String titulo, Double precioBase, Integer cantidadDias) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.precioBase = precioBase;
        this.cantidadDias = cantidadDias;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "identificador=" + identificador +
                ", titulo='" + titulo + '\'' +
                ", precioBase=" + precioBase +
                ", cantidadDias=" + cantidadDias +
                ", nombreExcursion=" + nombreExcursion +
                '}';
    }


    //Añadir o eliminar excursiones








}
