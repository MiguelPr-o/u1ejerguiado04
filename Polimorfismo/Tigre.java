package Polimorfismo;

// Animal extra diferente
public class Tigre extends Animal {
    public Tigre(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Grrr grrr!");
    }

    @Override
    public void moverse() {
        System.out.println("El tigre nada un rato en la piscina de su recinto y luego trepa a una roca para vigilar.");
    }
}