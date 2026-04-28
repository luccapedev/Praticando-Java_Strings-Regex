package service;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AtividadeOito {
    public void executar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o CPF: ");
        String cpf = input.nextLine();

        Pattern pattern = Pattern.compile("^\\d{3}.\\d{3}.\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(cpf);

        if (matcher.matches()) {
            System.out.printf("O CPF %s está no formato válido.\n", cpf);
        } else {
            System.out.printf("O CPF %s está no formato inválido.\n", cpf);
        }
    }
}
