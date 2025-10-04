package Questao04;

/**
 * Essa classe é o "molde" para todos os nossos decoradores. A função dela
 * é ser a "cola" que une tudo.
 *
 * O truque dela é duplo:
 * 1. Ela implementa a interface 'Relatorio', então ela pode ser tratada como um Relatorio.
 * 2. Ela tem uma referência a um objeto 'Relatorio', que é o objeto que ela vai "embrulhar".
 */
public abstract class RelatorioDecorator implements Relatorio {
    protected Relatorio relatorioDecorado;

    public RelatorioDecorator(Relatorio relatorio){
        this.relatorioDecorado = relatorio;
    }

    /**
     * Por padrão, um decorador simplesmente repassa a chamada para o objeto
     * que ele está decorando. As classes filhas (os decoradores concretos)
     * é que vão adicionar o comportamento extra antes ou depois dessa chamada.
     */
    @Override
    public String gerar(){
        return relatorioDecorado.gerar();
    }
}
