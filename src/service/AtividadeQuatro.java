package service;
import java.util.Scanner;

public class AtividadeQuatro {
    public void executar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String nomeArquivo = input.nextLine();

        String nomeArquivoSemExtensao = nomeArquivo.substring(0, nomeArquivo.lastIndexOf('.'));
        System.out.println("Nome do arquivo sem extensão: " + nomeArquivoSemExtensao);
    }
}
