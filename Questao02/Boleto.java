package Questao02;

public class Boleto implements MetodoPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Boleto no valor de R$ %.2f gerado com sucesso.%n", valor);
        System.out.println("Linha digitável: 1234.5678.9012.3456...");
    }
    
}
