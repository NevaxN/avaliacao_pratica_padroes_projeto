package Questao02;

public class Credito implements MetodoPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Processando pagamento de R$ %.2f no cartão de crédito...%n", valor);
        System.out.println("Transação aprovada!");
    }
    
}
