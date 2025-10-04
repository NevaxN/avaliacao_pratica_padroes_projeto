package Questao04;

/**
 * É aqui que a gente vê a flexibilidade do padrão. Podemos montar nossos
 * relatórios com as funcionalidades que quisermos, em tempo de execução.
 */
public class Main {
    public static void main(String[] args) {
        Relatorio relatorioSimples = new RelatorioSimples();
        System.out.println("--- Relatório Simples ---");
        System.out.println(relatorioSimples.gerar());
        System.out.println("========================================\n");

        Relatorio relatorioComGraficos = new RelatorioComGraficos(new RelatorioSimples());
        System.out.println("--- Relatório com Gráficos ---");
        // Note como eu "embrulho" o relatório simples dentro do decorador de gráficos.
        System.out.println(relatorioComGraficos.gerar());
        System.out.println("========================================\n");

        // Eu crio um relatório simples,
        // "embrulho" ele com o decorador de gráficos,
        // e "embrulho" o resultado com o decorador de estatísticas.
        // A ordem importa
        Relatorio relatorioCompleto = new RelatorioComEstatisticas(
                                        new RelatorioComGraficos(
                                            new RelatorioSimples()
                                        )
                                      );
        System.out.println("--- Relatório Completo (Gráficos + Estatísticas) ---");
        System.out.println(relatorioCompleto.gerar());
        System.out.println("========================================\n");

        // Apenas estatísticas e depois o formato PDF.
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
