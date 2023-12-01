package bichinhos;

import java.util.Scanner;

public class Hamster extends Animal {
    public Hamster(String nome, int idade) {
        super(nome, idade);
    }

    public void atendimentohamster() {
        System.out.println("\nAtendendo o hamsterzito " + getNome());
    }

    public void gatito() {
        System.out.println("\nDigite o que ocorreu o hamster " + getNome());
        Scanner scanner = new Scanner(System.in);
        String ocorrencia = scanner.nextLine();
        System.out.println("\nO hamster " + getNome() + " Teve sua ocorência: " + ocorrencia);
        System.out.println("Registramos o que aconteceu com o seu pet o(a) " + getNome() + " teve em sua descrição:" + ocorrencia);
        System.out.println("Encaminharemos sua ocorrencia para um veterinario!");
    }
}