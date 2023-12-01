package bichinhos;

import java.util.Scanner;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    public void atendimentogato() {
        System.out.println("\nAtendendo a gatito " + getNome());
    }

    public void gatito() {
        System.out.println("\nDigite o que ocorreu a gatito " + getNome());
        Scanner scanner = new Scanner(System.in);
        String ocorrencia = scanner.nextLine();
        System.out.println("\nO gatito " + getNome() + " Teve sua ocorência: " + ocorrencia);
        System.out.println("Registramos o que aconteceu com o seu pet o(a) " + getNome() + " teve em sua descrição:" + ocorrencia);
        System.out.println("Encaminharemos sua ocorrencia para um veterinario!");
    }
}