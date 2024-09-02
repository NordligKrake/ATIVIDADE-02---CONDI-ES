import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = scanner.next();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        if (operador.equals("+")) {
            resultado = num1 + num2;
        } else if (operador.equals("-")) {
            resultado = num1 - num2;
        } else if (operador.equals("*")) {
            resultado = num1 * num2;
        } else if (operador.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Divisão por zero!");
                return;
            }
        } else {
            System.out.println("Erro: Operador inválido!");
            return;
        }

        System.out.println("Resultado: " + resultado);
    }
}