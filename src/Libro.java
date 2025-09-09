public class Libro {

    private String titulo;
    private String autor;
    private int stock;
    private double costo;
    private double venta;
    private char sector;
    private int codigounico;

//constructor
    public Libro (String nuevoTitulo, String autor, int stock, double costo, double venta, char sector, int codigo){
        this.titulo=nuevoTitulo;
        this.autor=autor;
        this.stock=stock;
        this.costo=costo;
        this.venta=venta;
        this.sector=sector;
        this.codigounico=codigo;

    }

    //consultar y modificar nombre
    public String getTitulo(){return this.titulo;}

    public void setTitulo(String nuevoTitulo){this.titulo=nuevoTitulo;}


// precio venta

    public Double venta() {
        return venta;
    }
    public void setVenta(Double nuevoPrecio){
        if(nuevoPrecio <= 0 ){
            System.out.println("ingrese un valor válido");
        }else{
            this.venta=nuevoPrecio;
            System.out.println(venta);
        }


    }
















}
