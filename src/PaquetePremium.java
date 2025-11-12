public class PaquetePremium extends Paquete{


    private Integer puntosAcumulados;
    private Integer PORCENTAJEPOREXCURSION = 15;
    private boolean voucher;


    public PaquetePremium(Integer identificador, String titulo, Double precioBase, Integer cantidadDias, Integer PORCENTAJEPOREXCURSION) {
        super(identificador, titulo, precioBase, cantidadDias);
        this.PORCENTAJEPOREXCURSION = PORCENTAJEPOREXCURSION;
    }
}