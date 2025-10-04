package Questao03;

/**
 * Essa classe é o nosso leitor de verdade. A responsabilidade dela é bem simples:
 * ter um nome para se identificar e implementar a lógica de 'atualizar' que
 * foi exigida pela interface Observador.
 */
public class LeitorAssinante implements Observador {
    private String nome;

    public LeitorAssinante(String nome){
        this.nome = nome;
    }

    /**
     * Aqui eu defino o que o leitor faz quando é notificado.
     * Para este trabalho, ele apenas exibe uma mensagem no console dizendo
     * que recebeu a notícia.
     */
    @Override
    public void atualzar(String nomeTopico, String tituloNoticia){
        System.out.printf("[Notificação para %s]: Nova notícia no tópico '%s': '%s'%n",
            this.nome, nomeTopico, tituloNoticia);
    }
}
