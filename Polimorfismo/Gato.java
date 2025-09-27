
package Polimorfismo;

public class Gato extends Animal implements Mascota{

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Miau miau!");
    }

    @Override
    public void moverse() {
        System.out.println("Estoy saltando.");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " juega con un ovillo de lana.");
    }    
}
