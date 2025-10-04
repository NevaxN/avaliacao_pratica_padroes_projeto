package Questao01;

/**
 * Essa interface 'Transporte' força que toda classe
 * de transporte que eu criar tenha, obrigatoriamente, um método calcularTarifa().
 * Assim, eu garanto que todas são compatíveis com o meu sistema principal,
 * evitando erros e padronizando a chamada dos métodos.
 */
public interface Transporte {
    /**
     * Assinatura do método que toda classe de transporte deverá implementar.
     * A lógica de como o cálculo é feito fica totalmente a cargo da classe
     * que implementa a interface.
     */
    double calcularTarifa();
}
