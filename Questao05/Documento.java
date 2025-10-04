package Questao05;

public abstract class Documento {
    protected String titulo;
    protected String fonte;
    protected String cor;
    protected String logo;
    
    public abstract Documento clone();

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setFonte(String fonte) { this.fonte = fonte; }
    public void setCor(String cor) { this.cor = cor; }
    public void setLogo(String logo) { this.logo = logo; }
}
