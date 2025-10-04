package Questao04;

public class RelatorioComGraficos extends RelatorioDecorator {
    
    public RelatorioComGraficos(Relatorio relatorio){
        super(relatorio);
    }

    @Override
    public String gerar(){
        return super.gerar() + adicionarGrafico();
    }

    private String adicionarGrafico(){
        return "\n[Gráfico] Gráfico de Vendas Mensais";
    }
}
