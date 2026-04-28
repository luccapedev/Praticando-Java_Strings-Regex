package service;
import java.util.Scanner;

public class AtividadeCinco {
    public void executar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = input.nextLine();

        System.out.println("Digite a palavra: ");
        String palavra = input.nextLine();

        if (texto.contains(palavra)) {
            System.out.printf("A palavra %s está presente no texto.\n", palavra);
        } else {
            System.out.printf("A palavra %s não está presente no texto.\n", palavra);
        }
    }
}
