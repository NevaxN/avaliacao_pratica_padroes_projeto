package Questao03;

/**
 * Esta é a outra parte do contrato. Ela define o que um objeto 'observável'
 * precisa saber fazer: gerenciar sua lista de inscritos (inscrever, desinscrever)
 * e, claro, notificar todo mundo.
 */
public interface Publicador {
    void inscrever(Observador observador);
    void desinscrever(Observador observador);
    void notificarObservadores();
}
