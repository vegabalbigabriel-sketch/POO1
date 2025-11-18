public class PaqueteSimple extends Paquete{


    private Integer codigoDescuento;
    private Integer PORCENTAJEPOREXCURSION = 10;


    public PaqueteSimple(Integer identificador, String titulo, Double precioBase, Integer cantidadDias, Guia guia) {
        super(identificador, titulo, precioBase, cantidadDias, guia);
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