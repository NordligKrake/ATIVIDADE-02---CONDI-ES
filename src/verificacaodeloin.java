import java.util.Scanner;

public class verificacaodeloin {
    public static void main(String[] args) {
        // 1. Crie duas variáveis para armazenar o nome de usuário e a senha corretos.
        String nomeUsuarioCorreto = "Joao Coronetti";
        String senhaCorreta = "60300153";

        // 2. Peça ao usuário para inserir um nome de usuário e uma senha.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (nomeUsuario.equals(nomeUsuarioCorreto) && senha.equals(senhaCorreta)) {

            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
        }
    }
}