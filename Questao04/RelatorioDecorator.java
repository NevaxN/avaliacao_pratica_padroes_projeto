package Questao04;

public abstract class RelatorioDecorator implements Relatorio {
    protected Relatorio relatorioDecorado;

    public RelatorioDecorator(Relatorio relatorio){
        this.relatorioDecorado = relatorio;
    }

    @Override
    public String gerar(){
        return relatorioDecorado.gerar();
    }
}
