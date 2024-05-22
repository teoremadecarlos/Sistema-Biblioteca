import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoMenu = 99;

        while (opcaoMenu != 0) {
            System.out.println("Olá, bem vindo a Biblioteca Uninassau!");
            System.out.println("Escolha uma das opções: ");

            System.out.println("1 - Usuário ");
            System.out.println("2 - Livro ");
            System.out.println("3 - Empréstimo ");
            System.out.println("0 - Sair ");

            System.out.print("Digite a opção: ");
            opcaoMenu = scanner.nextInt();
        

        switch (opcaoMenu) {
            case 1:
                System.out.println("Opção 1 selecionada!");

                System.out.println("Aqui está o menu: ");

                System.out.println("1 - Cadastrar Usuário ");
                System.out.println("2 - Buscar Usuário ");
                System.out.println("3 - Listar Usuário ");
                System.out.println("4 - Deletar Usuário ");
                System.out.println("0 - Voltar");

                break;
            case 2:
                System.out.println("Opção 2 selecionada!");

                System.out.println("Aqui está o menu: ");

                System.out.println("1 - Cadastrar Livro");
                System.out.println("2 - Buscar Livro por Título");
                System.out.println("3 - Listar Livro");
                System.out.println("4 - Deletar Livro");
                System.out.println("0 - Voltar");

                System.out.print("Escolha a opção: ");

                break;
            case 3:

                break;
            case 0:
                System.out.println("Adeus, até a próxima!");
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
        scanner.close();
    }
    }
}
