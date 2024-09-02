import java.util.Scanner;

public class descontoprogressivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorOriginal = scanner.nextDouble();

        double valorDesconto = 0;
        double percentualDesconto = 0;

        if (valorOriginal > 500) {
            percentualDesconto = 30;
            valorDesconto = valorOriginal * (percentualDesconto / 100);
        } else if (valorOriginal >= 200 && valorOriginal <= 500) {
            percentualDesconto = 10;
            valorDesconto = valorOriginal * (percentualDesconto / 100);
        } else if (valorOriginal >= 100 && valorOriginal < 200) {
            percentualDesconto = 5;
            valorDesconto = valorOriginal * (percentualDesconto / 100);
        }

        double valorFinal = valorOriginal - valorDesconto;

        System.out.println("Valor original: R$ " + valorOriginal);
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
        System.out.println("Valor descontado: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);
    }
}