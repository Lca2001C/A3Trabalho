import java.util.*;

/**
 * A classe Estoque gerencia a lista de produtos disponíveis em estoque, permitindo adicionar, remover,
 * listar produtos, buscar produtos por tarja ou nome, e realizar vendas.
 */
public class Estoque {
    private List<Produto> produtos;

    /**
     * Construtor da classe Estoque.
     * Inicializa a lista de produtos como uma ArrayList vazia.
     */
    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    /**
     * Adiciona um produto ao estoque.
     * 
     * @param produto O produto a ser adicionado.
     */
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    /**
     * Remove um produto do estoque.
     * 
     * @param produto O produto a ser removido.
     */
    public void removerProduto(Produto produto) {
        if (produtos.remove(produto)) {
            System.out.println("Produto removido: " + produto.getNome());
        } else {
            System.out.println("Produto não encontrado: " + produto.getNome());
        }
    }

    /**
     * Lista todos os produtos disponíveis no estoque.
     * Exibe uma mensagem se o estoque estiver vazio.
     */
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Info: " + produto.getTarja());
            }
        }
    }

    /**
     * Busca produtos no estoque por tipo de tarja.
     * 
     * @param tipoTarja O tipo de tarja a ser buscado.
     */
    public void buscarPorTarja(String tipoTarja) {
        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.getTarja().contains(tipoTarja)) {
                System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Info: " + produto.getTarja());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum produto encontrado com a tarja: " + tipoTarja);
        }
    }

    /**
     * Busca um produto no estoque pelo nome.
     * 
     * @param nome O nome do produto a ser buscado.
     * @return O produto encontrado ou null se não encontrado.
     */
    public Produto buscarPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    /**
     * Realiza a venda de um produto, atualizando a quantidade em estoque.
     * 
     * @param nome O nome do produto a ser vendido.
     * @param quantidade A quantidade do produto a ser vendida.
     */
    public void realizarVenda(String nome, int quantidade) {
        Produto produto = buscarPorNome(nome);
        if (produto != null) {
            if (produto.getQuantidade() >= quantidade) {
                produto.setQuantidade(produto.getQuantidade() - quantidade);
                System.out.println("Venda realizada. Quantidade restante do produto " + nome + ": " + produto.getQuantidade());
            } else {
                System.out.println("Quantidade insuficiente em estoque.");
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
