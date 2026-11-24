import java.util.Scanner;

public class CadastroUsuario {

    private static final int IDADE_MINIMA = 18;

    public static void cadastrarUsuario(String nome, int idade) throws IdadeInvalidaException {
        if (idade < IDADE_MINIMA) {
            throw new IdadeInvalidaException(
                    "O usuário precisa ser maior de idade (18 anos ou mais) para se cadastrar.");
        }
        System.out.println("usuário " + nome + ", foi cadastrado com sucesso.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        String entradaIdade = scanner.nextLine().trim();

        try {
            int idade = Integer.parseInt(entradaIdade);
            cadastrarUsuario(nome, idade);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro no cadastro: a idade deve ser um número inteiro.");
        } finally {
            System.out.println("Processo de cadastro finalizado.");
        }

        scanner.close();
    }
}