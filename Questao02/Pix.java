package Questao02;

public class Pix implements MetodoPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f via Pix confirmado.%n", valor);
        System.out.println("Gerando QR Code e aguardando confirmação...");
    }
    
}
