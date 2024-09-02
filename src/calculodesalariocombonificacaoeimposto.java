import java.util.Scanner;

public class calculodesalariocombonificacaoeimposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o número de anos que o funcionário trabalhou na empresa: ");
        int anosDeTrabalho = scanner.nextInt();

        double bonus = 0;
        if (anosDeTrabalho > 10) {
            bonus = salarioBruto * 0.10;
        } else if (anosDeTrabalho >= 5 && anosDeTrabalho <= 10) {
            bonus = salarioBruto * 0.05;
        }

        double imposto = 2;
        if (salarioBruto > 5000) {
            imposto = salarioBruto * 0.27;
        } else if (salarioBruto >= 3000 && salarioBruto <= 4999.99) {
            imposto = salarioBruto * 0.18;
        } else if (salarioBruto < 3000) {
            imposto = salarioBruto * 0.10;
        }

        double salarioLiquido = salarioBruto + bonus - imposto;

        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Bônus recebido: R$ " + bonus);
        System.out.println("Imposto descontado: R$ " + imposto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}