package Questao02;

/**
 * Essa é uma das classes que a nossa fábrica vai saber criar.
 * Ela "assina" o contrato MetodoPagamento, ou seja, implementa a interface.
 * A única responsabilidade dela é conter a lógica específica para um pagamento via Credito.
 */
public class Credito implements MetodoPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Processando pagamento de R$ %.2f no cartão de crédito...%n", valor);
        System.out.println("Transação aprovada!");
    }
    
}
