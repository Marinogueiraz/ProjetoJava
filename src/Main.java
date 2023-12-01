import bichinhos.*;
import veterinario.Veterinario;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Diana", 3);
        Cachorro cachorro = new Cachorro("Jujuba", 5);
        Hamster hamster = new Hamster("Hantaro", 1);

        Veterinario veterinario = new Veterinario();

        veterinario.atenderAnimal(gato);
        gato.atendimentogato();
        gato.gatito();

        veterinario.atenderAnimal(cachorro);
        cachorro.atendimentocachorro();
        cachorro.dog();

        veterinario.atenderAnimal(hamster);
        hamster.atendimentohamster();
    }
}