// Herança: Desenvolvedor é um funcionário
public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    // Construtor
    public Desenvolvedor(String nome, String cpf, double salario, String linguagem, String senha) {
        super(nome, cpf, salario, senha);
        this.linguagem = linguagem;
    }
    
    @Override
    public double getBonificacao() {
        return this.getSalario() * 1.15;
    }
}
