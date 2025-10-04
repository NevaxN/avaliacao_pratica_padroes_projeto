package Questao03;

public class LeitorAssinante implements Observador {
    private String nome;

    public LeitorAssinante(String nome){
        this.nome = nome;
    }

    @Override
    public void atualzar(String nomeTopico, String tituloNoticia){
        System.out.printf("[Notificação para %s]: Nova notícia no tópico '%s': '%s'%n",
            this.nome, nomeTopico, tituloNoticia);
    }
}
