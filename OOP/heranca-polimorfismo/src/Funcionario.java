// Classes abstratas não podem ser instanciadas (criar um objeto) - Servem como um modelo para as outras classes
abstract public class Funcionario {
    // Atributos: nome, cpf e salario
    private String nome; // getter e setter
    private String cpf; // getter
    private double salario;

    // Apenas as classes que herdam de funcionario podem acessar esse atributo
    // protected double salario; // getter e setter


    // Construtor
    public Funcionario(String nome, String cpf, double salario, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // Getters / Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método abstrato -> Método que as classes filhas devem implementar
    abstract public double getBonificacao();
}
