package Questao04;

/**
 * Esta é a interface que todo mundo na estrutura precisa respeitar.
 * Tanto o relatório original ('RelatorioSimples') quanto todos os "embrulhos"
 * ('Decorators') vão implementar essa interface.
 *
 * Isso é o que permite que um relatório decorado ainda seja tratado como um
 * Relatorio comum pelo sistema, o que é a chave para o padrão funcionar.
 */
public interface Relatorio {
    String gerar();
}
