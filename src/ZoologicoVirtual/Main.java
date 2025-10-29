package ZoologicoVirtual;

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








    }
}
