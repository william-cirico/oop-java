public class Conta {
    // Atributos
    public double saldo;
    public int agencia;
    public int conta;
    public Titular titular;

    // Métodos
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        }

        this.saldo -= valor;
        return true;

    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (this.sacar(valor)) {
            this.saldo -= 5;
            contaDestino.depositar(valor);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // Instanciando um objeto da classe Conta
        Conta conta1 = new Conta();
        conta1.saldo = 10000;
        conta1.agencia = 1000;
        conta1.conta = 12909231;
        
        Titular titular1 = new Titular("William", "1231798712", "11111111111", "1111111");
        System.out.println(titular1.getNome());
        System.out.println(titular1.getCpf());
        System.out.println(titular1.getRg());

        // conta1.titular = titular1;

        // System.out.println(conta1.saldo);
        // System.out.println(conta1.agencia);
        // System.out.println(conta1.conta);

        // Conta conta2 = new Conta();
        // conta2.saldo = 5000;
        // conta2.agencia = 1001;
        // conta2.conta = 10000123;

        // Titular titular2 = new Titular();

        // conta2.titular = titular2;
        //
        // System.out.printf("Saldo na conta1: %.2f | Saldo na conta2: %.2f\n",
        // conta1.saldo, conta2.saldo);
        // System.out.println(conta2.agencia);
        // System.out.println(conta2.conta);

        // Utilizando métodos
        // conta1.depositar(1000);
        // System.out.println(conta1.saldo);

        // if (conta1.sacar(11500)) {
        //     System.out.println("Saque bem-sucedido.");
        // } else {
        //     System.out.println("Falha ao sacar.");
        // }

        // System.out.println("Saldo: " + conta1.saldo);

        // if (conta1.transferir(11500, conta2)) {
        //     System.out.println("Transferência bem-sucedida");
        // } else {
        //     System.out.println("Saldo insuficiente");
        // }
        
        // System.out.println("Titular da conta 1: " + conta1.titular.getCpf());
        // System.out.println("Saldo da conta 1: " + conta1.saldo);
        // // System.out.println("Titular da conta 2: " + conta2.titular);
        // System.out.println("Saldo da conta 2: " + conta2.saldo);
    }
}
