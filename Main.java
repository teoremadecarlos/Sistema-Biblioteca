import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcaoMenu = 99;

        System.out.println("Olá, seja bem vindo a biblioteca!");

        while (opcaoMenu != 0) {
        
            System.out.println("  Aqui está seu menu: ");
            System.out.println("1 - Usuário");
            System.out.println("2 - Livro");
            System.out.println("3 - Empréstimo");
            System.out.println("0 - SAIR");
            System.out.print("Escolha sua opção: ");

            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
                case 1 -> {
                    
                    System.out.println("\n  *Opção 1 - Usuário selecionada*  ");
                    int opcaoSubMenu = 99;
                    while (opcaoSubMenu != 0) {

                        System.out.println("1 - Cadastrar usuário");
                        System.out.println("2 - Buscar usuário");
                        System.out.println("3 - Listar usuário");
                        System.out.println("4 - Deletar usuário");
                        System.out.println("0 - VOLTAR");
                        System.out.print("Escolha sua opção: ");

                        opcaoSubMenu = sc.nextInt();

                        switch (opcaoSubMenu) {
                            case 1:
                                System.out.println("Opção cadastrar usuário selecionada");
                                /*cadastrarUsuario(); */

                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("Opção buscar usuário selecionada");
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("Opção listar usuário selecionada");
                                System.out.println("");
                                break;
                            case 4:
                                System.out.println("Opção deletar usuário selecionada");
                                System.out.println("");
                                break;
                            case 0:
                                System.out.println("voltando para o menu principal");
                                System.out.println("");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    }
                }
                case 2 -> {
        
                    System.out.println("\n  Opção 2 - Livro selecionada  ");
                    int opcaoSubMenu = 99;
                    while (opcaoSubMenu != 0) {

                        System.out.println("1 - Cadastrar livro");
                        System.out.println("2 - Buscar livro");
                        System.out.println("3 - Listar livro");
                        System.out.println("4 - Deletar livro");
                        System.out.println("0 - VOLTAR");
                        System.out.print("Escolha sua opção: ");

                        opcaoSubMenu = sc.nextInt();

                        switch (opcaoSubMenu) {
                            case 1:
                                System.out.println("Opção cadastrar livro selecionada");
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("Opção buscar livro selecionada");
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("Opção listar livro selecionada");
                                System.out.println("");
                                break;
                            case 4:
                                System.out.println("Opção deletar livro selecionada");
                                System.out.println("");
                                break;
                            case 0:
                                System.out.println("Voltando para o menu principal");
                                System.out.println("");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                System.out.println("");
                                break;
                        }
                    }
                }
                case 3 -> {
                    
                    System.out.println("\n *Opção 3 - Empréstimo selecionada* ");
                  
                    int opcaoSubMenu = 99;
                    while (opcaoSubMenu != 0) {

                        System.out.println("1 - Cadastrar empréstimo");
                        System.out.println("2 - Buscar empréstimo");
                        System.out.println("3 - Listar empréstimo");
                        System.out.println("4 - Deletar empréstimo");
                        System.out.println("0 - VOLTAR");
                        System.out.print("Escolha sua opção: ");

                        opcaoSubMenu = sc.nextInt();

                        switch (opcaoSubMenu) {
                            case 1:
                                System.out.println("Opção cadastrar empréstimo selecionada");
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("Opção buscar empréstimo selecionada");
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("Opção listar empréstimo selecionada");
                                System.out.println("");
                                break;
                            case 4:
                                System.out.println("Opção deletar empréstimo selecionada");
                                System.out.println("");
                                break;
                            case 0:
                                System.out.println("Voltando para o menu principal");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                System.out.println("");
                                break;
                        }
                    }
                }
                case 0 -> System.out.println("Até mais!");
                default -> System.out.println("Opção Inválida!");
            }
        }
    }

    /*private static void cadastrarUsuario() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o nome do usuário");
        String nome = sc.next();

        System.out.println("Escreva a idade do usuário");
        int idade = sc.nextInt();

    }*/

}


/*public boolean verificarDisponibilidade() {
    return this.livro.getStatus().equals("Disponível");
}

public void reservarLivro() {
    if (verificarDisponibilidade()) {
        this.livro.setStatus("Reservado");
        System.out.println("Livro reservado com sucesso!");
    } else {
        System.out.println("Livro indisponível para reserva!");
    }import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoMenu = -1;

        while (opcaoMenu < 0) {
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
                    System.out.println("\nOpção 1 selecionada!");
                    System.out.println("Aqui está o menu usuário: ");
                    System.out.println("1 - Cadastrar Usuário ");
                    System.out.println("2 - Buscar Usuário ");
                    System.out.println("3 - Listar Usuário ");
                    System.out.println("4 - Deletar Usuário ");
                    System.out.println("0 - Voltar");
                    System.out.print("Escolha a opção: ");
                    int menuUsuario = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("\nOpção 2 selecionada!");
                    System.out.println("Aqui está o menu livro: ");
                    System.out.println("1 - Cadastrar Livro");
                    System.out.println("2 - Buscar Livro por Título");
                    System.out.println("3 - Listar Livro");

}

public void realizarEmprestimo() {
    if (this.livro.getStatus().equals("Reservado") && this.livro.getUsuario().equals(this.usuario)) {
        this.livro.setStatus("Emprestado");
        System.out.println("Empréstimo realizado com sucesso!");
    } else {
        System.out.println("Empréstimo não permitido! Verifique a reserva ou disponibilidade do livro.");
    }
}

public void devolverLivro() {
    this.livro.setStatus("Disponível");
    this.dataDevolucaoReal = new Date();
    this.situacao = "Devolvido";
    System.out.println("Livro devolvido com sucesso!");
}*/
