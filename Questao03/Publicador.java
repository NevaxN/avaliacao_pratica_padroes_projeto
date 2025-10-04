package Questao03;

public interface Publicador {
    void inscrever(Observador observador);
    void desinscrever(Observador observador);
    void notificarObservadores();
}
