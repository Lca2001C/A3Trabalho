/**
 * A classe TarjaAmarela representa um produto com tarja amarela,
 * que estende a classe Produto.
 */
public class TarjaAmarela extends Produto {

    /**
     * Construtor da classe TarjaAmarela.
     * 
     * @param nome O nome do produto.
     * @param preco O preço do produto.
     * @param quantidade A quantidade em estoque do produto.
     */
    public TarjaAmarela(String nome, double preco, int quantidade) {
        super(quantidade, nome, preco, quantidade, "Amarela");
    }

    /**
     * Obtém a informação específica da tarja amarela.
     * 
     * @return Uma string com a informação da tarja amarela.
     */
    public String getInformacaoTarja() {
        return "Produto de tarja amarela: venda sob retenção de receita.";
    }
}
