package Questao04;

public class RelatorioComEstatisticas extends RelatorioDecorator{
    
    public RelatorioComEstatisticas(Relatorio relatorio){
        super(relatorio);
    }

    @Override
    public String gerar(){
        String relatoriaBase = super.gerar();
        return relatoriaBase + adicionarEstatisticas();
    }

    private String adicionarEstatisticas(){
        return "\n++ [Estatísticas] Faturamento Total: R$ 5.000,00 ++";
    }
}
