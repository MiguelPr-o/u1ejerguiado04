package Polimorfismo;

public class MainZoologico {

    public static void main(String[] args) {
        
        // Equipo "Booleanos" integrado por:
        // Miguel Angel Hernandez Godinez y
        // Fernando Vega Negrete
        
        // Animales extra escogidos por el equipo: Lobo, León y Tigre
        Animal[] zoo = {
            new Lobo("Colmillo", 4),
            new Leon("Simba", 6),
            new Tigre("Shere Khan", 5)
        };

        // Recorremos el zoológico
        System.out.println("¡Bienvenidos todos al Zoológico Polimórfico de Doleondres!");
        System.out.println("Presentado por el equipo \"Booleanos\" con nuestros tres animales principales (un lobo, un león y un tigre) \n");
        for (Animal animal : zoo) {
            animal.mostrarInfo();
            animal.hacerSonido();
            animal.moverse();
            System.out.println();
        }
    }
    
}
