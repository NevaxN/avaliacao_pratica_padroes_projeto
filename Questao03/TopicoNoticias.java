package Questao03;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void notificarObservadores(){
        for(Observador assinante : this.assinantes){
            assinante.atualzar(this.nome, this.ultimaNoticia);
        }
    }

    public void publicarNovaNoticia(String tituloNoticia){
        this.ultimaNoticia = tituloNoticia;
        System.out.printf("%n--- Tópico '%s' publicou uma nova notícia! ---%n", this.nome);
        notificarObservadores();
    }
}
