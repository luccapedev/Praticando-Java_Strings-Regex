package service;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AtividadeSete {
    public void executar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o código de referência: ");
        String codigo = input.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(codigo);

        if (matcher.matches()) {
            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("O código de referência está inválido");
        }
    }
}
