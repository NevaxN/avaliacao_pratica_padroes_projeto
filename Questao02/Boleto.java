package Questao02;

/**
 * Essa é uma das classes que a nossa fábrica vai saber criar.
 * Ela "assina" o contrato MetodoPagamento, ou seja, implementa a interface.
 * A única responsabilidade dela é conter a lógica específica para um pagamento via Boleto.
 */
public class Boleto implements MetodoPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Boleto no valor de R$ %.2f gerado com sucesso.%n", valor);
        System.out.println("Linha digitável: 1234.5678.9012.3456...");
    }
    
}
