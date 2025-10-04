package Questao05;

/**
 * É um objeto que já nasce
 * configurado como um template de currículo pronto para ser copiado.
 */
public class ModeloCurriculo extends Documento{
    private int numeroPaginas;

    /**
     * O construtor padrão serve para configurar nosso protótipo.
     * Ele é chamado uma única vez, quando carregamos o protótipo no nosso 'Registry'.
     */
    public ModeloCurriculo(){
        this.titulo = "Currículo Padrão";
        this.fonte = "Calibri";
        this.cor = "Azul Escuro";
        this.logo = "[LOGO PADRÃO]";
        this.numeroPaginas = 1;  
    }

    /**
     * Este é um 'construtor de cópia'. Optei por essa abordagem para implementar a clonagem
     * por ser mais segura e explícita em Java. O método clone() abaixo vai chamar
     * este construtor para criar a cópia.
     */
    private ModeloCurriculo(ModeloCurriculo modelo) {
        this.titulo = modelo.titulo;
        this.fonte = modelo.fonte;
        this.cor = modelo.cor;
        this.logo = modelo.logo;
        this.numeroPaginas = modelo.numeroPaginas;
    }

    /**
     * A implementação do método de clonagem exigido pela classe pai.
     * Ele simplesmente cria uma nova instância de si mesmo, passando o objeto
     * atual (this) para o construtor de cópia.
     */
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
