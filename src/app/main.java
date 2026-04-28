package app;

import service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = "Digite o número da funcionalidade que deseja testar:\n" +
                "1 - Removendo espaços em branco\n" +
                "2 - Convertendo para maiúsculas e minúsculas\n" +
                "3 - Substituindo parte de uma String\n" +
                "4 - Extraindo parte de uma string\n" +
                "5 - Verificando se uma String contém uma Substring\n" +
                "6 - Formatando números\n" +
                "7 - Validando códigos de referência\n" +
                "8 - Validando CPFn\n" +
                "9 - Extraindo hashtags de um texto\n" +
                "10 - Validando senhas com Regex\n" +
                "0 - Sair";

        System.out.println(menu);

        int escolha = -1;

        while (escolha != 0) {

            System.out.println(menu);
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Não existe nenhuma funcionalidade com esse número!");
            }
        }

        scanner.close();
    }
}