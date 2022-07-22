public class Gerente extends Funcionario implements Autenticacao {
    private Autenticavel autenticavel;

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario, senha);
        this.autenticavel = new Autenticavel(senha);
    }

    // Bonificação: Salário + 25%
    @Override
    public double getBonificacao() {
        return this.getSalario() * 1.25;
    }

    public void dizOi() {
        System.out.println("Oi do gerente!");
    }

    @Override
    public boolean autentica(String senha) {
        return this.autenticavel.autentica(senha);
    }
}
