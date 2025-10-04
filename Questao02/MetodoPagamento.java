package Questao02;

/**
 * A interface garante que toda classe de pagamento que eu criar no futuro (Pix, Boleto, etc.)
 * terá, com certeza, um método chamado processarPagamento().
 *
 * Isso é essencial para o cliente, que vai poder usar qualquer objeto recebido
 * da fábrica da mesma forma, sem se preocupar com os detalhes.
 */
public interface MetodoPagamento {
    void processarPagamento(double valor);
}
