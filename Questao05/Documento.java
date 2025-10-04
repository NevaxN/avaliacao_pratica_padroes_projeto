package Questao05;

/**
 * Esta classe define os atributos que são comuns a todos (título, fonte, etc.) e,
 * o mais importante, estabelece o contrato de que toda subclasse
 * precisa implementar um método clone().
 *
 * Optei por uma classe abstrata para poder compartilhar os atributos comuns.
 */
public abstract class Documento {
    protected String titulo;
    protected String fonte;
    protected String cor;
    protected String logo;

    // Força todas as classes filhas a implementarem sua própria lógica de clonagem.
    public abstract Documento clone();

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setFonte(String fonte) { this.fonte = fonte; }
    public void setCor(String cor) { this.cor = cor; }
    public void setLogo(String logo) { this.logo = logo; }
}
