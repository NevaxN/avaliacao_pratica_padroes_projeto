package Questao04;

/**
 * Este é um dos nossos "ingredientes" ou "papéis de presente". Ele herda do
 * molde de decorador e tem a única função de adicionar PDF's.
 */
public class RelatorioExportacaoPDF extends RelatorioDecorator {
    
    public RelatorioExportacaoPDF(Relatorio relatorio){
        super(relatorio);
    }

    /**
     * Aqui está a lógica do Decorator em ação.
     * 1. Primeiro, ele chama o método 'gerar()' do objeto que está embrulhando
     * (usando o 'super.gerar()'). Isso pode ser o relatório simples ou outro decorador.
     * 2. Depois, ele pega o resultado e adiciona a sua própria funcionalidade,
     * que no caso são os PDF's.
     */
    @Override
    public String gerar(){
        String conteudo = super.gerar();
        return simularExportacaoPDF(conteudo);
    }

    private String simularExportacaoPDF(String conteudo){
        return "\n--- Início do Documento PDF ---\n" + conteudo + "\n--- Fim do Documento PDF ---";
    }
}
