/**
 * A classe Produto representa um produto com atributos id, nome, preco, quantidade e tarja.
 */
public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private String tarja;

    /**
     * Construtor da classe Produto.
     * 
     * @param id O identificador único do produto.
     * @param nome O nome do produto.
     * @param preco O preço do produto.
     * @param quantidade A quantidade em estoque do produto.
     * @param tarja A tarja do produto.
     */
    public Produto(int id, String nome, double preco, int quantidade, String tarja) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.tarja = tarja;
    }

    /**
     * Obtém o identificador do produto.
     * 
     * @return O identificador do produto.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtém o nome do produto.
     * 
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém o preço do produto.
     * 
     * @return O preço do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Obtém a quantidade em estoque do produto.
     * 
     * @return A quantidade em estoque do produto.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Obtém a tarja do produto.
     * 
     * @return A tarja do produto.
     */
    public String getTarja() {
        return tarja;
    }

    /**
     * Define o identificador do produto.
     * 
     * @param id O novo identificador do produto.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Define o nome do produto.
     * 
     * @param nome O novo nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define o preço do produto.
     * 
     * @param preco O novo preço do produto.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Define a quantidade em estoque do produto.
     * 
     * @param quantidade A nova quantidade em estoque do produto.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Define a tarja do produto.
     * 
     * @param tarja A nova tarja do produto.
     */
    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    /**
     * Retorna uma representação em string do produto.
     * 
     * @return Uma string contendo os detalhes do produto.
     */
    @Override
    public String toString() {
        return "Produto [id= " + id + ", nome= " + nome + ", preco= " + preco + ", quantidade= " + quantidade + ", tarja= " + tarja + "]";
    }
}
