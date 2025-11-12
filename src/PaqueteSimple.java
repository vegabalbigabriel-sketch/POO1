public class PaqueteSimple extends Paquete{


    private Integer codigoDescuento;
    private Integer PORCENTAJEPOREXCURSION = 10;


    public PaqueteSimple(Integer identificador, String titulo, Double precioBase, Integer cantidadDias) {
        super(identificador, titulo, precioBase, cantidadDias);
        this.PORCENTAJEPOREXCURSION = PORCENTAJEPOREXCURSION;
    }
}