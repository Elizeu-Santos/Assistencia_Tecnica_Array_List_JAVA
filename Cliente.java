import java.util.ArrayList;

public class Cliente {
    
    private String nome;
    private ArrayList<Orcamento> orcamentos;

    public Cliente(String nome) {
        this.nome = nome;
        this.orcamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    public void adicionarOrcamento(Orcamento orcamento) {
        orcamentos.add(orcamento);
    }
}