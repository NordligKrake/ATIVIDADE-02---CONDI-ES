import java.util.Scanner;

public class ClassificadorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = scanner.nextDouble();

        String classificacao;

        if (temperatura > 30) {
            classificacao = "Quente";
        } else if (temperatura >= 15 && temperatura <= 30) {
            classificacao = "Agradável";
        } else {
            classificacao = "Frio";
        }

        System.out.println("Classificação: " + classificacao);
    }
}