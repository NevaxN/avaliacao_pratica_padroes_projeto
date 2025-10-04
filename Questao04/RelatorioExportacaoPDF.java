package Questao04;

public class RelatorioExportacaoPDF extends RelatorioDecorator {
    
    public RelatorioExportacaoPDF(Relatorio relatorio){
        super(relatorio);
    }

    @Override
    public String gerar(){
        String conteudo = super.gerar();
        return simularExportacaoPDF(conteudo);
    }

    private String simularExportacaoPDF(String conteudo){
        return "\n--- Início do Documento PDF ---\n" + conteudo + "\n--- Fim do Documento PDF ---";
    }
}
