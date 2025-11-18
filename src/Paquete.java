import java.util.HashSet;

public abstract class Paquete {

    //atributos identificador, titulo, precio base, cantidad de dias, nombre irrepetible de excursion

    private Integer identificador;
    private String titulo;
    private Double precioBase;
    private Integer cantidadDias;
    private Guia guia;
    private HashSet <String> excursiones = new HashSet();

    //constructor

    public Paquete(Integer identificador, String titulo, Double precioBase, Integer cantidadDias, Guia guia) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.precioBase = precioBase;
        this.cantidadDias = cantidadDias;
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "identificador=" + identificador +
                ", titulo='" + titulo + '\'' +
                ", precioBase=" + precioBase +
                ", cantidadDias=" + cantidadDias +
                ", nombreExcursion=" + excursiones +
                '}';
    }


    //Set y Get del precio base, para calcular el precio final
    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    //Cantidad de excursiones

    public abstract Double CalcularPrecioFinal (Integer numeroExcursiones);


    //Añadir, confirmar o eliminar excursiones

//Añadir

    public void Añadir (String nombreExcursion) {
        if (excursiones.contains(nombreExcursion)) {
            System.err.println("El nombre ya se encuentra en la lista. ");
        }else{
            excursiones.add(nombreExcursion);
        }
    }

    //Consultar

    public void Consultar (String nombreExcursion) {
        if (excursiones.contains(nombreExcursion)) {
            System.err.println("El nombre ya se encuentra en la lista. ");
        } else {
            System.out.println("El nombre no se encuentra en la lista");
        }
    }
// Eliminar
//
     public void Eliminar (String nombreExcursion) {
         if (excursiones.contains(nombreExcursion)) {
             //Eliminar
             excursiones.remove(nombreExcursion);
             System.err.println("El nombre sera eliminado");
         } else {
             System.out.println("El nombre no esta en la lista");
         }
        }

        //Consultar toda la lista

    public void Lista (){
       for(String excursion : this.excursiones)
       {
           System.out.println(excursion);
       }
    }





}
