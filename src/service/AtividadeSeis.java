package service;
import java.util.Scanner;

public class AtividadeSeis {
    public void executar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        Float valor = input.nextFloat();

        String valorFormatado = String.format("R$%.2f", valor);
        System.out.println("Valor formatado: " + valorFormatado);
    }
}
