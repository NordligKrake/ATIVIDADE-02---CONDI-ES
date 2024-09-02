import java.util.Scanner;

public class verificadordesinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String mensagem;

        if (numero > 0) {
            mensagem = "O número é positivo.";
        } else if (numero < 0) {
            mensagem = "O número é negativo.";
        } else {
            mensagem = "O número é zero.";
        }

        System.out.println(mensagem);
    }
}