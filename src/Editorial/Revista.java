package Editorial;

import java.util.ArrayList;

public class Revista extends Publicación{

//lista de suscripciones y ediciones

    private ArrayList<Suscriptor> suscriptores = new ArrayList<Suscriptor>();





    public Revista(String nombre, Integer codigoUnico, String frecuencia) {
        super(nombre, codigoUnico, frecuencia);
    }
//desarrollar metodos agregar, consultar y eliminar suscriptor

}
