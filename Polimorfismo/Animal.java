package Polimorfismo;


public abstract class Animal {
    protected String nombre;
    protected byte edad;
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = (byte)edad;
    }
    
    public abstract void hacerSonido();
    public abstract void moverse();
    
    public void mostrarInfo() {
        System.out.println("Soy un " + this.getClass().getSimpleName() +
                " llamado \"" + nombre + "\", tengo " + edad + " años.");
    }

}