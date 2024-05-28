import java.util.Scanner;

public class Matheus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoMenuPrincipal = 99;

        while (opcaoMenuPrincipal != 0) {
            System.out.println("Olá, bem vindo a Biblioteca Uninassau!");
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Usuário");
            System.out.println("2 - Livro");
            System.out.println("3 - Empréstimo");
            System.out.println("0 - Sair");

            System.out.print("Digite a opção: ");
            opcaoMenuPrincipal = scanner.nextInt();

            switch (opcaoMenuPrincipal) {
                case 1:
                    menuUsuario(scanner);
                    break;
                case 2:
                    menuLivro(scanner);
                    break;
                case 3:
                    menuEmprestimo(scanner);
                    break;
                case 0:
                    System.out.println("Adeus, até a próxima!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
        scanner.close();
    }

    private static void menuUsuario(Scanner scanner) {
        int opcaoUsuario = 99;
        while (opcaoUsuario != 0) {
            System.out.println("\nMenu Usuário:");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Buscar Usuário");
            System.out.println("3 - Listar Usuário");
            System.out.println("4 - Deletar Usuário");
            System.out.println("0 - Voltar");

            System.out.print("Digite a opção: ");
            opcaoUsuario = scanner.nextInt();

            switch (opcaoUsuario) {
                case 1:
                    System.out.println("Cadastrar Usuário");
                    // Adicione a lógica de cadastro de usuário aqui
                    break;
                case 2:
                    System.out.println("Buscar Usuário");
                    // Adicione a lógica de busca de usuário aqui
                    break;
                case 3:
                    System.out.println("Listar Usuário");
                    // Adicione a lógica de listagem de usuários aqui
                    break;
                case 4:
                    System.out.println("Deletar Usuário");
                    // Adicione a lógica de deleção de usuário aqui
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }

    private static void menuLivro(Scanner scanner) {
        int opcaoLivro = 99;
        while (opcaoLivro != 0) {
            System.out.println("\nMenu Livro:");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Buscar Livro por Título");
            System.out.println("3 - Listar Livro");
            System.out.println("4 - Deletar Livro");
            System.out.println("0 - Voltar");

            System.out.print("Digite a opção: ");
            opcaoLivro = scanner.nextInt();

            switch (opcaoLivro) {
                case 1:
                    System.out.println("Cadastrar Livro");
                    // Adicionar a lógica de cadastro de livro
                    break;
                case 2:
                    System.out.println("Buscar Livro por Título");
                    // Adicionar a lógica de busca de livro
                    break;
                case 3:
                    System.out.println("Listar Livro");
                    // Adicionar a lógica de listagem de livros
                    break;
                case 4:
                    System.out.println("Deletar Livro");
                    // Adicionar a lógica de deleção de livro
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }

    private static void menuEmprestimo(Scanner scanner) {
        int opcaoEmprestimo = 99;
        while (opcaoEmprestimo != 0) {
            System.out.println("\nMenu Empréstimo:");
            System.out.println("1 - Reservar Livro");
            System.out.println("2 - Realizar Empréstimo");
            System.out.println("3 - Devolver Livro");
            System.out.println("0 - Voltar");

            System.out.print("Digite a opção: ");
            opcaoEmprestimo = scanner.nextInt();

            switch (opcaoEmprestimo) {
                case 1:
                    System.out.println("Reservar Livro");
                    // Adicionar a lógica de reserva de livro
                    break;
                case 2:
                    System.out.println("Realizar Empréstimo");
                    // Adicionar a lógica de realização de empréstimo
                    break;
                case 3:
                    System.out.println("Devolver Livro");
                    // Adicionar a lógica de devolução de livro
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }
}
