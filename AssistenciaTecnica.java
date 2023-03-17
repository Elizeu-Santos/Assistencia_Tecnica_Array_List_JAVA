import java.util.ArrayList;
import java.util.Scanner;

class AssistenciaTecnica {
    
    private ArrayList<Cliente> clientes;

    public AssistenciaTecnica() {
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("| Digite o nome do cliente: ");
        String nome = sc.nextLine();
        Cliente cliente = new Cliente(nome);
        clientes.add(cliente);
        System.out.println("| Cliente cadastrado com sucesso.");
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("| Nao ha clientes cadastrados no momento.");
        } else {
            System.out.println("| Clientes cadastrados: ");
            for (Cliente cliente : clientes) {
                System.out.println("- " + cliente.getNome());
            }
        }
    }

    public void cadastrarOrcamento() {
        Scanner sc = new Scanner(System.in);
        System.out.print("| Digite o nome do cliente: ");
        String nome = sc.nextLine();
        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                cliente = c;
                break;
            }
        }
        if (cliente == null) {
            System.out.println("| Cliente nao encontrado.");
        } else {
            System.out.print("| Digite o valor do orcamento: ");
            double valor = sc.nextDouble();
            sc.nextLine();
            System.out.print("| Digite a descricao do orcamento: ");
            String descricao = sc.nextLine();
            Orcamento orcamento = new Orcamento(valor, descricao);
            cliente.adicionarOrcamento(orcamento);
            System.out.println("| Orcamento cadastrado com sucesso para o cliente " + cliente.getNome() + ".");
        }
    }

    public void listarOrcamentos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("| Digite o nome do cliente: ");
        String nome = sc.nextLine();
        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                cliente = c;
                break;
            }
        }
        if (cliente == null) {
            System.out.println("| Cliente nao encontrado.");
        } else {
            ArrayList<Orcamento> orcamentos = cliente.getOrcamentos();
            if (orcamentos.isEmpty()) {
                System.out.println("| O cliente: " + cliente.getNome() + " nao possui orcamentos cadastrados.");
            } else {
                System.out.println("| Orcamentos cadastrados para o cliente " + cliente.getNome() + ":");
                for (Orcamento orcamento : orcamentos) {
                    System.out.println("| - Descricao: " + orcamento.getDescricao());
                    System.out.println("| - Valor: " + orcamento.getValor());
                }
            }
        }
    }
}