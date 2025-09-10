//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Libro libro1= new Libro("Melifluo", "Melina",13,1500,2500,'c',1470214567);
        System.out.println(libro1.getTitulo());
libro1.setTitulo("Otro Titulo");
        System.out.println(libro1.getTitulo());




        Libro libro2= new Libro("Patata", "Luis",17,5000,7000,'c',777776667);
        System.out.println(libro2.getTitulo()+"\n"+libro2.calcularPrecioFinal());
    }




}