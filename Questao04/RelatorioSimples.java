package Questao04;

/**
 * Este é o nosso objeto base, o relatório em sua forma mais pura e simples.
 * Ele não sabe nada sobre gráficos, estatísticas ou PDFs. A única responsabilidade
 * dele é gerar a lista básica de pedidos.
 *
 * O mais importante é que, seguindo o padrão, eu nunca mais vou precisar
 * editar este arquivo, não importa quantas novas funcionalidades sejam pedidas.
 */
public class RelatorioSimples implements Relatorio{
    
    @Override
    public String gerar(){
        return "Relatório Básico: Lista de Pedidos [Pedido 1, Pedido 2, Pedido 3]";
    }
}
