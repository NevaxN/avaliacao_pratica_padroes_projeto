package Questao02;

/**
 * O objetivo desta classe é tirar a responsabilidade de criar objetos do cliente.
 * Ela centraliza e esconde toda a lógica de instanciação (os 'new').
 * Assim, o cliente não precisa saber que existe uma classe chamada 'Pix',
 * ele só precisa pedir à fábrica um processador de pagamento do tipo "pix".
 */
public class PagamentoFactory {
    public MetodoPagamento getPagamento(String pagamento){
        if(pagamento == null || pagamento.isEmpty()){
            throw new IllegalArgumentException("O tipo de pagamento não pode ser nulo ou vazio.");
        }

        switch (pagamento.toLowerCase()) {
            case "credito":
                return new Credito();
            case "boleto":
                return new Boleto();
            case "pix":
                return new Pix();
                // A grande vantagem está aqui: se eu precisar adicionar um novo método de
                // pagamento, eu só adiciono um 'case' novo. O cliente não precisa mudar nada.
            default:
                // Se o cliente pedir um tipo que não existe, eu lanço uma exceção
                // com uma mensagem clara. É muito melhor que retornar 'null' e
                // o programa quebrar em outro lugar sem a gente saber o porquê.
                throw new IllegalArgumentException("Tipo de pagamento desconhecido: " + pagamento);
        }
    }
}
