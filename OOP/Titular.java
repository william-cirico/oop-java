public class Titular {
    private String nome;
    private String telefone;
    private String cpf;
    private String rg;

    // Constructor - Define os valores que o objeto vai ter na sua criação
    public Titular(String nome, String telefone, String cpf, String rg) {
        this.nome = nome;
        this.telefone = telefone;
        // Verificação para saber se o cpf válido
        this.cpf = cpf;
        this.rg = rg;
    }

    // Getters e Setters
    // Getter -> Obtém a propriedade
    // Setter -> Modifica a propriedade
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
}
