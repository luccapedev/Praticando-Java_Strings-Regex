package service;
import java.util.Scanner;

public class AtividadeTres {
    public void executar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = input.nextLine();

        System.out.println("Digite a palavra a ser substituída: ");
        String palavraAntiga = input.nextLine();

        System.out.println("Digite a nova palavra: ");
        String palavraNova = input.nextLine();

        String textoNovo = texto.replace(palavraAntiga, palavraNova);
        System.out.println("Texto modificado: " + textoNovo);
    }
}
