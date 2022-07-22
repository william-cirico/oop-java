public class App {
    public static void main(String[] args) throws Exception {
        // Criando um objeto
        Titular titular1 = new Titular("William", "1231231", "11123123", "123123123", "123456");
        System.out.println("Nome do titular: " + titular1.getNome());

        Diretor diretor = new Diretor("João", "11234212310", 30000, "123456");
        Gerente gerente = new Gerente("Maria", "11234212300", 20000, "123");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro", "112312212312", 12000, "Java", "senha123");

        System.out.println("Bonificação do diretor: " + diretor.getBonificacao());
        System.out.println("Bonificação do gerente: " + gerente.getBonificacao());
        System.out.printf("Bonificação do desenvolvedor: %.2f\n", desenvolvedor.getBonificacao());    
        
        // Utilizando um método especifico da classe gerente
        gerente.dizOi();    

        if (diretor.autentica("123456")) {
            System.out.println("Diretor conseguiu logar no sistema.");
        } else {
            System.out.println("Diretor não conseguiu logar no sistema.");
        }

        if (titular1.autentica("123456")) {
            System.out.println("Titular conseguiu logar no sistema.");
        } else {
            System.out.println("Titular não conseguiu logar no sistema.");
        }
    }
}
