public class Tesoureiro extends Funcionario {

    public Tesoureiro(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario, senha);
    }

    // Bonificação: metade do salário
    @Override
    public double getBonificacao() {
        return this.getSalario() / 2;
    }
    
}
