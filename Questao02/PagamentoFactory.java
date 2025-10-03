package Questao02;

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
            default:
                throw new IllegalArgumentException("Tipo de pagamento desconhecido: " + pagamento);
        }
    }
}
