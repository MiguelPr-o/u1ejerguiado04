
package Polimorfismo;

public class Delfin extends Animal {

    public Delfin(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Click click!");
    }

    @Override
    public void moverse() {
        System.out.println("Estoy nadando velozmente.");
    }
}
