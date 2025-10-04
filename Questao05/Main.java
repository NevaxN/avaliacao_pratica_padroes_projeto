package Questao05;

/**
 * Aqui a gente vê como o uso do padrão simplificou a vida do cliente.
 * Não há nenhum 'new ModeloCurriculo()' aqui. A criação de objetos
 * está totalmente abstraída.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Gerando documentos a partir de protótipos ---\n");

        // Note que eu não preciso saber qual é a classe concreta, só peço ao
        // catálogo um clone do protótipo identificado pela chave "CURRICULO_PADRAO".
        Documento curriculoArthur = DocumentoRegistry.getDocumento("CURRICULO_PADRAO");

        curriculoArthur.setCor("Verde Oliva");
        curriculoArthur.setLogo("[Logo A.P.S.]");

        Documento curriculoMaria = DocumentoRegistry.getDocumento("CURRICULO_PADRAO");

        curriculoMaria.setFonte("Arial");
        curriculoMaria.setLogo("[Logo M.C.]");

        System.out.println("Documentos Gerados:");
        System.out.println(curriculoArthur);
        System.out.println(curriculoMaria);
        System.out.println();

        ModeloPropostaComercial propostaEmpresaX = (ModeloPropostaComercial) DocumentoRegistry.getDocumento("PROPOSTA_COMERCIAL");
        propostaEmpresaX.setEmpresaDestino("Empresa de Tecnologia X");
        propostaEmpresaX.setTitulo("Proposta de Desenvolvimento de Software");
        
        System.out.println(propostaEmpresaX);
    }
}
