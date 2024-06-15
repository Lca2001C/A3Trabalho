/**
 * A classe abstrata Funcionario representa um funcionário genérico com atributos nome e id,
 * e métodos abstratos para cadastro de produto, realização de venda e obtenção do tipo de funcionário.
 */
public abstract class Funcionario {
    private String nome;
    private int id;

    /**
     * Construtor da classe Funcionario.
     * 
     * @param nome O nome do funcionário.
     * @param id O identificador único do funcionário.
     */
    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    /**
     * Obtém o nome do funcionário.
     * 
     * @return O nome do funcionário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém o identificador do funcionário.
     * 
     * @return O identificador do funcionário.
     */
    public int getId() {
        return id;
    }

    /**
     * Método abstrato para cadastrar um produto.
     * Implementações específicas de funcionários devem definir o comportamento deste método.
     */
    public abstract void cadastrarProduto();

    /**
     * Método abstrato para realizar uma venda.
     * Implementações específicas de funcionários devem definir o comportamento deste método.
     */
    public abstract void realizarVenda();

    /**
     * Método abstrato para obter o tipo do funcionário.
     * Implementações específicas de funcionários devem definir o comportamento deste método.
     * 
     * @return O tipo do funcionário como um inteiro.
     */
    public abstract int getTipo();
}
