package Questao04;

/**
 * Este é um dos nossos "ingredientes" ou "papéis de presente". Ele herda do
 * molde de decorador e tem a única função de adicionar estatísticas.
 */
public class RelatorioComEstatisticas extends RelatorioDecorator{
    
    public RelatorioComEstatisticas(Relatorio relatorio){
        super(relatorio);
    }

    /**
     * Aqui está a lógica do Decorator em ação.
     * 1. Primeiro, ele chama o método 'gerar()' do objeto que está embrulhando
     * (usando o 'super.gerar()'). Isso pode ser o relatório simples ou outro decorador.
     * 2. Depois, ele pega o resultado e adiciona a sua própria funcionalidade,
     * que no caso é o texto das estatísticas.
     */
    @Override
    public String gerar(){
        String relatoriaBase = super.gerar();
        return relatoriaBase + adicionarEstatisticas();
    }

    private String adicionarEstatisticas(){
        return "\n++ [Estatísticas] Faturamento Total: R$ 5.000,00 ++";
    }
}
