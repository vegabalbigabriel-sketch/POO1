public class PaqueteSimple extends Paquete{


    private boolean descuento = false;
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
    public Double CalcularPrecioFinal() {
        double valor=this.getPrecioBase() + getExcursiones().size() * (PORCENTAJEPOREXCURSION * this.getPrecioBase()/100);
        if (descuento){
            return valor - (this.getPrecioBase()*0.25);
        }
        System.out.println(valor);
        return valor;

    }
}