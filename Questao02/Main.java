package Questao02;

public class Main {
    public static void main(String[] args) {
        PagamentoFactory factory = new PagamentoFactory();
    
        try{
            MetodoPagamento metodo = factory.getPagamento("Pix"); 
            metodo.processarPagamento(150.75);

            MetodoPagamento metodoInvalido = factory.getPagamento("Cripto");
            metodoInvalido.processarPagamento(500.00);
        } catch(IllegalArgumentException e){
            System.err.println("Erro ao processar pagamento: " + e.getMessage());
        }
    }
}
