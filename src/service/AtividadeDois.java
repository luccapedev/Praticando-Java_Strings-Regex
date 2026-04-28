package service;
import java.util.Scanner;

public class AtividadeDois {
    public void executar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = input.nextLine();

        String textoMaisuculo = texto.toUpperCase();
        System.out.println("Texto em maiúsculas: " + textoMaisuculo);

        String textoMinusculo  = texto.toLowerCase();
        System.out.println("Texto em minúsculas: " + textoMinusculo);
    }
}
