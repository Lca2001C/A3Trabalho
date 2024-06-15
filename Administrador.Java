/**
 * A classe Administrador é uma subclasse de Funcionario que representa um tipo específico de funcionário
 * que tem permissões diferentes, como cadastrar produtos, mas não realizar vendas.
 */
public class Administrador extends Funcionario {

    /**
     * Construtor da classe Administrador.
     * 
     * @param nome O nome do administrador.
     * @param id O ID do administrador.
     */
    public Administrador(String nome, int id) {
        super(nome, id);
    }

    /**
     * Método para cadastrar um produto.
     * Este método imprime uma mensagem indicando que o produto foi cadastrado pelo administrador.
     */
    @Override
    public void cadastrarProduto() {
        System.out.println("Produto cadastrado pelo administrador " + getNome());
    }

    /**
     * Método para realizar uma venda.
     * Este método imprime uma mensagem indicando que o administrador não tem permissão para realizar vendas.
     */
    @Override
    public void realizarVenda() {
        System.out.println("Acesso negado: Administrador não pode realizar vendas.");
    }

    /**
     * Método que retorna o tipo de funcionário.
     * 
     * @return Um inteiro representando o tipo de funcionário. No caso do Administrador, retorna 2.
     */
    @Override
    public int getTipo() {
        return 2;
    }
}
