
package Polimorfismo;

public class Perro extends Animal implements Mascota{

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Guau guau!");
    }

    @Override
    public void moverse() {
        System.out.println("Estoy corriendo.");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " está jugando a traer la pelota.");
    }
}