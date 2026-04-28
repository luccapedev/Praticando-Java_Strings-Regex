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
                "8 - Validando CPF\n" +
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
                    AtividadeUm atividadeUm = new AtividadeUm();
                    atividadeUm.executar();
                    break;
                case 2:
                    AtividadeDois atividadeDois = new AtividadeDois();
                    atividadeDois.executar();
                    break;
                case 3:
                    AtividadeTres atividadeTres = new AtividadeTres();
                    atividadeTres.executar();
                    break;
                case 4:
                    AtividadeQuatro atividadeQuatro = new AtividadeQuatro();
                    atividadeQuatro.executar();
                    break;
                case 5:
                    AtividadeCinco atividadeCinco = new AtividadeCinco();
                    atividadeCinco.executar();
                    break;
                case 6:
                    AtividadeSeis atividadeSeis = new AtividadeSeis();
                    atividadeSeis.executar();
                    break;
                case 7:
                    AtividadeSete atividadeSete = new AtividadeSete();
                    atividadeSete.executar();
                    break;
                case 8:
                    AtividadeOito atividadeOito = new AtividadeOito();
                    atividadeOito.executar();
                    break;
                case 9:
                    AtividadeNove atividadeNove = new AtividadeNove();
                    atividadeNove.executar();
                    break;
                case 10:
                    AtividadeDez atividadeDez = new AtividadeDez();
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