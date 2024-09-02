import java.util.Scanner;

public class verificacaoescolar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a média final do aluno: ");
        double media = scanner.nextDouble();

        if (media >= 6) {
            System.out.println("Aprovado!");
        } else if (media >= 5 && media < 6) {
            System.out.println("Recuperação!");
        } else if (media < 5) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Média inválida. Por favor, digite um valor entre 0 e 10.");
        }
    }
}