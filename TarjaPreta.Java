/**
 * A classe TarjaPreta representa um produto com tarja preta,
 * que estende a classe Produto.
 */
public class TarjaPreta extends Produto {

    /**
     * Construtor da classe TarjaPreta.
     * 
     * @param nome O nome do produto.
     * @param preco O preço do produto.
     * @param quantidade A quantidade em estoque do produto.
     */
    public TarjaPreta(String nome, double preco, int quantidade) {
        super(quantidade, nome, preco, quantidade, "Preta");
    }

    /**
     * Obtém a informação específica da tarja preta.
     * 
     * @return Uma string com a informação da tarja preta.
     */
    public String getInformacaoTarja() {
        return "Produto de tarja preta: venda sob prescrição e controle especial.";
    }
}
