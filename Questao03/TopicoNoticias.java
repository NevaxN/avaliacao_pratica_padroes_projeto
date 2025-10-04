package Questao03;

import java.util.ArrayList;
import java.util.List;

/**
 * Essa é a classe principal do padrão, o nosso Tópico de Notícias que será observado.
 * Ela guarda o estado (a última notícia) e a lista de quem quer saber das novidades.
 */
public class TopicoNoticias implements Publicador {
    private List<Observador> assinantes;
    private String nome;
    private String ultimaNoticia;

    public TopicoNoticias(String nome){
        this.nome = nome;
        this.assinantes = new ArrayList<>();
    }

    @Override
    public void inscrever(Observador observador){
        this.assinantes.add(observador);
        System.out.printf("%s se inscreveu no tópico '%s'.%n", observador, this.nome);
    }

    @Override
    public void desinscrever(Observador observador){
        this.assinantes.remove(observador);
        System.out.printf("%s cancelou a inscrição do tópico '%s'.%n", observador, this.nome);
    }

    /**
     * Este método simplesmente passa pela lista de assinantes e chama o
     * método 'atualizar' de cada um. O Tópico não sabe o que o 'atualizar' faz,
     * ele só cumpre sua parte, que é avisar.
     */
    @Override
    public void notificarObservadores(){
        for(Observador assinante : this.assinantes){
            assinante.atualzar(this.nome, this.ultimaNoticia);
        }
    }

    /**
     * Este é o método que funciona como gatilho.
     * Quando o sistema publica uma notícia, ele é chamado.
     * A primeira coisa que ele faz é atualizar seu estado interno (a 'ultimaNoticia'),
     * e então ele imediatamente chama o método para notificar todo mundo.
     */
    public void publicarNovaNoticia(String tituloNoticia){
        this.ultimaNoticia = tituloNoticia;
        System.out.printf("%n--- Tópico '%s' publicou uma nova notícia! ---%n", this.nome);
        notificarObservadores();
    }
}
