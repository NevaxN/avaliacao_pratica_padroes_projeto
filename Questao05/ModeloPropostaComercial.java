package Questao05;

/**
 * É um objeto que já nasce
 * configurado como um template de currículo pronto para ser copiado.
 */
public class ModeloPropostaComercial extends Documento {
    private String empresaDestino;

    /**
     * O construtor padrão serve para configurar nosso protótipo.
     * Ele é chamado uma única vez, quando carregamos o protótipo no nosso 'Registry'.
     */
    public ModeloPropostaComercial(){
        this.titulo = "Proposta Comercial Genérica";
        this.fonte = "Times New Roman";
        this.cor = "Preto";
        this.logo = "[LOGO DA SUA EMPRESA]";
        this.empresaDestino = "[NOME DA EMPRESA CLIENTE]";
    }

    /**
     * Este é um 'construtor de cópia'. Optei por essa abordagem para implementar a clonagem
     * por ser mais segura e explícita em Java. O método clone() abaixo vai chamar
     * este construtor para criar a cópia.
     */
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

    /**
     * A implementação do método de clonagem exigido pela classe pai.
     * Ele simplesmente cria uma nova instância de si mesmo, passando o objeto
     * atual (this) para o construtor de cópia.
     */
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
