package Questao04;

public class RelatorioSimples implements Relatorio{
    
    @Override
    public String gerar(){
        return "Relatório Básico: Lista de Pedidos [Pedido 1, Pedido 2, Pedido 3]";
    }
}
