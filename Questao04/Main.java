package Questao04;

public class Main {
    public static void main(String[] args) {
        Relatorio relatorioSimples = new RelatorioSimples();
        System.out.println("--- Relatório Simples ---");
        System.out.println(relatorioSimples.gerar());
        System.out.println("========================================\n");

        Relatorio relatorioComGraficos = new RelatorioComGraficos(new RelatorioSimples());
        System.out.println("--- Relatório com Gráficos ---");
        System.out.println(relatorioComGraficos.gerar());
        System.out.println("========================================\n");

        Relatorio relatorioCompleto = new RelatorioComEstatisticas(
                                        new RelatorioComGraficos(
                                            new RelatorioSimples()
                                        )
                                      );
        System.out.println("--- Relatório Completo (Gráficos + Estatísticas) ---");
        System.out.println(relatorioCompleto.gerar());
        System.out.println("========================================\n");

        Relatorio relatorioPDFcomStats = new RelatorioExportacaoPDF(
                                           new RelatorioComEstatisticas(
                                               new RelatorioSimples()
                                           )
                                         );
        System.out.println("--- Relatório com Estatísticas para PDF ---");
        System.out.println(relatorioPDFcomStats.gerar());
        System.out.println("========================================\n");
    }
}
