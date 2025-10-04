package Questao02;

/**
 * Essa é uma das classes que a nossa fábrica vai saber criar.
 * Ela "assina" o contrato MetodoPagamento, ou seja, implementa a interface.
 * A única responsabilidade dela é conter a lógica específica para um pagamento via Pix.
 */
public class Pix implements MetodoPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f via Pix confirmado.%n", valor);
        System.out.println("Gerando QR Code e aguardando confirmação...");
    }
    
}
