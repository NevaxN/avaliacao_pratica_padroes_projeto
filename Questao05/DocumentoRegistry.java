package Questao05;

import java.util.HashMap;
import java.util.Map;

public class DocumentoRegistry {
    private static final Map<String, Documento> REGISTRY = new HashMap<>();

    static {
        ModeloCurriculo curriculo = new ModeloCurriculo();
        ModeloPropostaComercial proposta = new ModeloPropostaComercial();

        REGISTRY.put("CURRICULO_PADRAO", curriculo);
        REGISTRY.put("PROPOSTA_COMERCIAL", proposta);
    }

    public static Documento getDocumento(String chave) {
        Documento prototipo = REGISTRY.get(chave);
        return prototipo != null ? prototipo.clone() : null;
    }
}
