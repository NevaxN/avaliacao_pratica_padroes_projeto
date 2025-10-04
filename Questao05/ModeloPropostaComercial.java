package Questao05;

public class ModeloPropostaComercial extends Documento {
    private String empresaDestino;

    public ModeloPropostaComercial(){
        this.titulo = "Proposta Comercial Genérica";
        this.fonte = "Times New Roman";
        this.cor = "Preto";
        this.logo = "[LOGO DA SUA EMPRESA]";
        this.empresaDestino = "[NOME DA EMPRESA CLIENTE]";
    }

    private ModeloPropostaComercial(ModeloPropostaComercial modelo){
        this.titulo = modelo.titulo;
        this.fonte = modelo.fonte;
        this.cor = modelo.cor;
        this.logo = modelo.logo;
        this.empresaDestino = modelo.empresaDestino;
    }

    public void setEmpresaDestino(String empresa) {
        this.empresaDestino = empresa;
    }

    @Override
    public Documento clone() {
        return new ModeloPropostaComercial(this);
    }

    @Override
    public String toString() {
        return String.format("Proposta [Título: %s, Fonte: %s, Logo: %s, Para: %s]",
            titulo, fonte, logo, empresaDestino);
    }
}
