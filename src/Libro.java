import java.security.PublicKey;

public class Libro {

    private String titulo;
    private String autor;
    private int stock;
    private double costo;
    private double venta;
    private char sector;
    private int codigounico;
    private static final double COMISION_PORCENTAJE = 0.05;

    //constructor
    public Libro(String nuevoTitulo, String autor, int stock, double costo, double venta, char sector, int codigo) {
        this.titulo = nuevoTitulo;
        this.autor = autor;
        this.stock = stock;
        this.costo = costo;
        this.venta = venta;
        this.sector = sector;
        this.codigounico = codigo;

    }

    //consultar y modificar nombre
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }


// precio getventa

    public Double getVenta() {
        return venta;
    }

    public void setVenta(Double nuevoPrecio) {
        if (nuevoPrecio <= 0) {
            System.out.println("ingrese un valor válido");
        } else {
            this.venta = nuevoPrecio;
        }
    }

    // conseguir el codigo
    public String getParteCodigo() {
        String codigoTexto = Integer.toString(this.codigounico);
        String ultimos3Digitos = codigoTexto.substring(7);
        return "*******" + ultimos3Digitos;
    }

    // Hay Stock?
    public boolean hayStock() {
        if (stock > 0) {
            return true;
        } else {
            return false;
        }

    }

    // Hay descuento?

    public boolean tieneDescuento() {
        if (sector == 'c') {
            return true;
        } else {
            return false;
        }
    }

    // calcular precio final y la ganancia
    public double calcularPrecioFinal() {
        if (this.tieneDescuento()) {
            double descuento = this.venta * 0.1;
            return this.venta - descuento;
        } else {
            return this.venta;
        }


    }

    public double calcularGanancia(){
        if (this.tieneDescuento()){
            return this.venta - this.costo - 0.1*this.venta;
        }
        else {
            return this.venta - this.costo;
        }

    }

    //La librería aplica un porcentaje del 5% de comisión sobre cada libro, por el momento no se modifica.
    // restar 5% a la ganancia

    public double calcularComision(){
        return COMISION_PORCENTAJE * this.venta;
    }

    //Se establece un stock mínimo recomendado de 5 unidades para todos los libros que puede actualizarse a nivel general.





}













