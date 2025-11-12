package ZoologicoVirtual;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) {

        Mamifero perry = new Ornitorrinco(4975,"Perry",4,3);
        Animal doggo = new Pez(1427,"Doggo",10);
       //metodo comer que sobreescribe mamifero de la clase animal
        perry.comer("Crustaceos");
        //Casteo para acceder al metodo de la interface
        ((Oviparo)perry).ponerHuevos();
        doggo.comer("Camaron");
        ((Oviparo)doggo).ponerHuevos();
        perry.amamantar();


        //Prueba de interfaz viviparo
        Mamifero paulo = new Felino(2853,"Paulo",6,0);
        paulo.amamantar();
        ((Viviparo)paulo).gestar();
        ((Viviparo)paulo).parir();

        //GENERAR GET Y SET !!!!!!!!!!!!!!


//
// Lista Hashset con animales irrepetibles
        HashSet<Animal> animales= new HashSet<>();
        animales.add(perry);
        animales.add(doggo);
        animales.add(paulo);
        animales.forEach(animal -> System.out.println(animal));

        //Preguntar si hay mamiferos en la lista
        //animales.stream().anyMatch(animal -> animal.getClass().equals(perry.getClass()));
        System.out.println("Hay mamiferos en la lista? "+animales.stream().anyMatch(animal -> animal.getClass().equals(perry.getClass())));

        //tambien se podria hacer:
        System.out.println(animales.stream().anyMatch(animal -> animal instanceof Mamifero));
        Stream<Animal> mamiferos=animales.stream().filter(animal -> animal instanceof Mamifero);
        Set<Animal> mamiferos2 = mamiferos.collect(Collectors.toSet());
        System.out.println(mamiferos2);



//Se puede diferenciar aninal y ornitorrinco para no mezclar
        //Lista de ornitorrincos array
        Animal gregorio = new Ornitorrinco(1746, "Gregorio", 15,0);
        Animal fausto = new Ornitorrinco(0646, "Fausto", 4,0);
        Animal martin = new Ornitorrinco(2547, "Martin", 6,3);

        //ARRAY
//"Animal" tambien puede ser ornitorrinco
        List<Animal> ornitorrincosOrdenados=new ArrayList<>();
        ornitorrincosOrdenados.addAll (Arrays.asList(gregorio,fausto,martin));

        //







        //Lista de aves HashMap para identificarlas con un id
        Ave sahumerio = new Ave(4826,"Sahumerio", 9);
        Ave darla = new Ave(2326,"Darla", 2);
        Ave manuel = new Ave(4856,"Manuel", 3);

        HashMap<Integer, Ave> aves = new HashMap<>();
        aves.put(sahumerio.getId(),sahumerio);
        aves.put(darla.getId(),darla);
        aves.put(manuel.getId(),manuel);


        for (Integer iD : aves.keySet()) {
            System.out.println(aves.get(iD));
        }





    }

}
