public class PaquetePremium extends Paquete implements Personalizable {


    private Integer puntosAcumulados;
    private Integer PORCENTAJEPOREXCURSION = 15;
    private boolean voucher;


    public PaquetePremium(Integer identificador, String titulo, Double precioBase, Integer cantidadDias, Guia guia) {
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


    //Sobre escritura de Calcular el Precio Final
    @Override
    public Double CalcularPrecioFinal() {
        double valor=this.getPrecioBase() + getExcursiones().size() * (PORCENTAJEPOREXCURSION * this.getPrecioBase()/100);
        System.out.println(valor);
        return valor;

    }

//CODIGO INTERFAZ PERSONALIZACION
@Override
    public String añadirExcursion(String nuevaExcursion) {
        if (getExcursiones().contains(nuevaExcursion)) {
            System.err.println("Esta ya se encuentra en la lista. ");
        } else {
            getExcursiones().add(nuevaExcursion);
        }
        return nuevaExcursion;
    }
}