package Questao03;

/**
 * Essa interface é o contrato que todo objeto que quiser "observar" algo precisa assinar.
 * No nosso caso, é o Leitor. Ela define o que acontece quando uma notificação chega,
 * que é o método 'atualizar'.
 */
public interface Observador {
    void atualzar(String nomeTopico, String tituloNoticia);
}
