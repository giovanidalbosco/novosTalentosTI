import introducao.bichos.Animal;
import introducao.bichos.Cachorro;
import introducao.bichos.Mamifero;
import introducao.bichos.Gato;

public class App2 {
    public static void main(String[] args) {
        //SUPERCLASSE
        Animal animal = new Animal();
        animal.setSexo("feminino");
        System.out.println(animal.getClass());
        System.out.println(animal.hashCode());

        //SUBCLASSE
        Mamifero mamifero = new Mamifero();
        mamifero.setSexo("masculino");
        mamifero.setGeraLeite(false);
        System.out.println(mamifero.getSexo());
        System.out.println(mamifero.getClass());
        System.out.println(mamifero.hashCode());

        Animal animal2 = mamifero;
        animal2.setSexo("feminino");
        System.out.println(animal2.getSexo());
        System.out.println(animal2.getClass());
        System.out.println(animal2.hashCode());
        //Cast - Conversão
        System.out.println(((Mamifero)animal2).isGeraLeite());

        Cachorro cachorro = new Cachorro();
        cachorro.setSexo("masculino");
        Gato gato = new Gato();
        gato.setSexo("feminino");
        

        

        System.out.println(mamifero.getSexo());
    }
}
