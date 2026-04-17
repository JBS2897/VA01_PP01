
    public class Produto {
        String nome;
        double preco;
        int quantidade;

        void exibirDados() {
            System.out.println("Produto: " + nome);
            System.out.printf("Preço: R$ %.2f\n", preco);
            System.out.println("Estoque: " + quantidade + " unidades");
        }
    }

