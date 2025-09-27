package Polimorfismo;

// Animal extra diferente
class Leon extends Animal {
    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Roaaarrr!");
    }

    @Override
    public void moverse() {
        System.out.println("El león se estira perezosamente y luego se acerca al vidrio para mirar al público.");
    }
}
