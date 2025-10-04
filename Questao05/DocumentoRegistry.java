package Questao05;

import java.util.HashMap;
import java.util.Map;

/**
 * Criei esta classe para deixar o padrão mais robusto. Em vez de o cliente
 * ter que gerenciar as instâncias dos protótipos, ele simplesmente pede
 * a este 'Registro' um novo documento pelo nome.
 */
public class DocumentoRegistry {
    private static final Map<String, Documento> REGISTRY = new HashMap<>();

    /**
     * Usei um bloco 'static' para carregar os nossos protótipos no mapa
     * assim que o programa inicia. Isso garante que os "moldes" já estejam
     * prontos na primeira vez que o cliente precisar deles.
     */
    static {
        ModeloCurriculo curriculo = new ModeloCurriculo();
        ModeloPropostaComercial proposta = new ModeloPropostaComercial();

        REGISTRY.put("CURRICULO_PADRAO", curriculo);
        REGISTRY.put("PROPOSTA_COMERCIAL", proposta);
    }

    /**
     * O método principal que o cliente usará.
     * O detalhe mais importante aqui: ele não retorna o objeto original guardado
     * no mapa. Ele chama o método .clone() do protótipo e retorna a cópia.
     * Isso é essencial para que o nosso modelo original nunca seja modificado.
     */
    public static Documento getDocumento(String chave) {
        Documento prototipo = REGISTRY.get(chave);
        return prototipo != null ? prototipo.clone() : null;
    }
}
