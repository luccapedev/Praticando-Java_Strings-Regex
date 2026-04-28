package service;
import java.util.Scanner;

public class AtividadeUm {
    public AtividadeUm() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = input.nextLine();

        String nomeFormatado = nome.trim();
        System.out.println("Nome formatado: " + nomeFormatado);
        input.close();
    }
}
