package BilleteraVirtual;

public class Cuenta {

//nro cuenta, nombre, dni, saldoInicial, limiteExtraccion, COMISION


    private Integer nroCuenta;
    private String nombre;
    private Integer dni;
    private Double saldo;
    private static Double limiteExtraccion = 50000.0;
    private final static Double COMISION = 0.05;

    //la 12 no es final, se podria modificar. ambas pertenecen a la clase

    public Cuenta (Integer nroCuenta,String nombre,Integer dni,Double saldo) {

        this.nroCuenta = nroCuenta;
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
    }
//retirarDinero

    public Double retirarDinero(Double monto) {
        Double retiro = 0.0;
        if (monto <= 0) {
            System.out.println("ingrese un monto mayor a 0");
        } else if (monto >= limiteExtraccion) {
            System.out.println("Ingrese un monto menor al limite (" + limiteExtraccion + ")");
        } else if (monto > saldo) {
            System.out.println("No posee saldo suficiente");
        } else {
            this.saldo -= monto;
            retiro = monto;
        }
        return retiro;
    }
//transferirDinero


    public void transferirDinero(Cuenta recibe, Double montoTransferido){
        if (montoTransferido< 0 || montoTransferido> this.saldo){
            System.out.println("Monto invalido");
        }
        else if (recibe == null){
            System.out.println("Cuenta invalida");
        }
        else {
            //Modificar con el metodo recibirTransferencia
            this.saldo -= montoTransferido;
            recibe.recibirTransferencia(montoTransferido);
        }

    }


//recibirTransferencia, restar la comision,

    public void recibirTransferencia (Double montoTransferido){
        //Restar la comision al monto
        Double descuento = montoTransferido * COMISION;
        montoTransferido -= descuento;
        //Sumar el monto restante al saldo
        this.saldo += montoTransferido;
    }






//LimiteTrasferencia
//Poder modificar el limite de extraccion para todas las cuentas

    public static void setLimiteExtraccion(Double nuevoLimiteExtraccion){
        if (nuevoLimiteExtraccion <= 0){
            System.out.println("Monto invalido");
        }else{
        limiteExtraccion=nuevoLimiteExtraccion;}
    }


    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }




    public static Double getLimiteExtraccion() {
        return limiteExtraccion;
    }
    //public static void setLimiteSaldoNegativo(Double nuevoLimiteNegativo){
//       limiteSaldoNegativo=nuevoLimiteNegativo;}


    public Double getSaldo() {
        return saldo;
    }

//heredado de la clase object
    @Override
    public String toString() {
        return "Cuenta{" +
                "nroCuenta= " + nroCuenta +
                " nombre= " + nombre +
                " dni= " + dni +
                " saldo= " + saldo +
                '}';
    }


    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }


}