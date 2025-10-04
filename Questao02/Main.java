package Questao02;

/**
 * Esta classe simula o nosso sistema (uma loja, um app, etc.) que precisa
 * processar um pagamento. O importante é que ela não quer (e não deve) saber
 * como se cria um objeto de pagamento. Ela delega essa tarefa para a Factory.
 */
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
