public class PaquetePremium extends Paquete{


    private Integer puntosAcumulados;
    private Integer PORCENTAJEPOREXCURSION = 15;
    private boolean voucher;


    public PaquetePremium(Integer identificador, String titulo, Double precioBase, Integer cantidadDias, Integer PORCENTAJEPOREXCURSION, Guia guia) {
        super(identificador, titulo, precioBase, cantidadDias,guia);
        this.PORCENTAJEPOREXCURSION = PORCENTAJEPOREXCURSION;
    }


    //Calcular precio final

    public Integer getPORCENTAJEPOREXCURSION() {
        return PORCENTAJEPOREXCURSION;
    }

    public void setPORCENTAJEPOREXCURSION(Integer PORCENTAJEPOREXCURSION) {
        this.PORCENTAJEPOREXCURSION = PORCENTAJEPOREXCURSION;
    }

    @Override
    public Double CalcularPrecioFinal(Integer numeroExcursiones) {
        return this.getPrecioBase() + numeroExcursiones * PORCENTAJEPOREXCURSION * this.getPrecioBase()/100;
    }
}