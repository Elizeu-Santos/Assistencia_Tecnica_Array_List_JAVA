import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AssistenciaTecnica assistenciaTecnica = new AssistenciaTecnica();
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println(" ------------- MENU PRINCIPAL ------------- ");
            System.out.println("| 1 - Cadastrar cliente                    |");
            System.out.println("| 2 - Listar clientes                      |");
            System.out.println("| 3 - Cadastrar orçamento para um cliente  |");
            System.out.println("| 4 - Listar orçamentos de um cliente      |");
            System.out.println("| 5 - Sair (Exit)                          |");
            System.out.println(" ------------------------------------------ ");
            System.out.print(  "| Digite uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    assistenciaTecnica.cadastrarCliente();
                    break;
                case 2:
                    assistenciaTecnica.listarClientes();
                    break;
                case 3:
                    assistenciaTecnica.cadastrarOrcamento();
                    break;
                case 4:
                    assistenciaTecnica.listarOrcamentos();
                    break;
                case 5:
                    System.out.println("| Programa encerrado...");
                    break;
                default:
                    System.out.println("| Opcao invalida.");
                    break;
            }
            System.out.println();
        } while (opcao != 5);
    }
}
