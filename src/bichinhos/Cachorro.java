package bichinhos;

import java.util.Scanner;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void atendimentocachorro() {
        System.out.println("\nAtendendo o doguinho " + getNome());
    }

    public void dog() {
        System.out.println("\nDigite o que ocorreu o doguinho " + getNome());
        Scanner scanner = new Scanner(System.in);
        String ocorrencia = scanner.nextLine();
        System.out.println("\nO cachorro " + getNome() + " Teve sua ocorência: " + ocorrencia);
        System.out.println("Registramos o que aconteceu com o seu pet o(a) " + getNome() + " teve em sua descrição:" + ocorrencia);
        System.out.println("Encaminharemos sua ocorrencia para um veterinario");
    }
}