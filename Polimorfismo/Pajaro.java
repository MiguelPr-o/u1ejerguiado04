
package Polimorfismo;

public class Pajaro extends Animal {

   public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Pío pío!");
    }

    @Override
    public void moverse() {
        System.out.println("Estoy volando por el cielo.");
    }
    
}
