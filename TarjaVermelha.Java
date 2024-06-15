/**
 * A classe TarjaVermelha representa um produto com tarja vermelha,
 * que estende a classe Produto.
 */
public class TarjaVermelha extends Produto {

    /**
     * Construtor da classe TarjaVermelha.
     * 
     * @param nome O nome do produto.
     * @param preco O preço do produto.
     * @param quantidade A quantidade em estoque do produto.
     */
    public TarjaVermelha(String nome, double preco, int quantidade) {
        super(quantidade, nome, preco, quantidade, "Vermelha");
    }

    /**
     * Obtém a informação específica da tarja vermelha.
     * 
     * @return Uma string com a informação da tarja vermelha.
     */
    public String getInformacaoTarja() {
        return "Produto de tarja vermelha: venda sob prescrição médica.";
    }
}
