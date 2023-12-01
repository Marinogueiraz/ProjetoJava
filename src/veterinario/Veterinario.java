package veterinario;

import bichinhos.Animal;
import java.util.Scanner;

public class Veterinario {
    public void atenderAnimal(Animal animal) {
        System.out.println("\nAtendendo " + animal.getNome() + "...");
        aguardarEntrada();
        System.out.println("Atendendo.\n");
    }

    private void aguardarEntrada() {
        System.out.println("\nPressione Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}