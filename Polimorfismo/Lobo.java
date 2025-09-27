package Polimorfismo;

// Animal extra diferente
class Lobo extends Animal {
    public Lobo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Auuuuuuuuuuuuuuu!");
    }

    @Override
    public void moverse() {
        System.out.println("El lobo recorre su recinto y observa atentamente a los visitantes.");
    }
}