package Questao05;

public class ModeloCurriculo extends Documento{
    private int numeroPaginas;

    public ModeloCurriculo(){
        this.titulo = "Currículo Padrão";
        this.fonte = "Calibri";
        this.cor = "Azul Escuro";
        this.logo = "[LOGO PADRÃO]";
        this.numeroPaginas = 1;  
    }

    private ModeloCurriculo(ModeloCurriculo modelo) {
        this.titulo = modelo.titulo;
        this.fonte = modelo.fonte;
        this.cor = modelo.cor;
        this.logo = modelo.logo;
        this.numeroPaginas = modelo.numeroPaginas;
    }

    @Override
    public Documento clone(){
        return new ModeloCurriculo(this);
    }

    @Override
    public String toString(){
        return String.format("Currículo [Título: %s, Fonte: %s, Cor: %s, Logo: %s, Páginas: %d]",
            titulo, fonte, cor, logo, numeroPaginas);
    }
}
