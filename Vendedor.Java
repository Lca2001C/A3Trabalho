/**
 * A classe Vendedor representa um tipo de funcionário que pode realizar vendas,
 * estendendo a classe abstrata Funcionario.
 */
public class Vendedor extends Funcionario {

    /**
     * Construtor da classe Vendedor.
     * 
     * @param nome O nome do vendedor.
     * @param id O identificador único do vendedor.
     */
    public Vendedor(String nome, int id) {
        super(nome, id);
    }

    /**
     * Sobrescrita do método para cadastrar produto da classe Funcionario.
     * Não implementado para vendedores.
     */
    @Override
    public void cadastrarProduto() {
        System.out.println("Acesso negado: Vendedor não pode cadastrar produtos.");
    }

    /**
     * Sobrescrita do método para realizar venda da classe Funcionario.
     * Mostra uma mensagem indicando que a venda foi realizada pelo vendedor.
     */
    @Override
    public void realizarVenda() {
        System.out.println("Venda realizada pelo vendedor " + getNome());
    }

    /**
     * Sobrescrita do método para obter o tipo de funcionário.
     * 
     * @return O tipo do funcionário, que para vendedores é 1.
     */
    @Override
    public int getTipo() {
        return 1;
    }
}
