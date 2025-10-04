package Questao03;

public class Main {
    public static void main(String[] args) {
        TopicoNoticias esportes = new TopicoNoticias("Esportes");
        TopicoNoticias tecnologia = new TopicoNoticias("Tecnologia");

        LeitorAssinante leitor1 = new LeitorAssinante("Arthur");
        LeitorAssinante leitor2 = new LeitorAssinante("Maria");
        LeitorAssinante leitor3 = new LeitorAssinante("Joao");

        esportes.inscrever(leitor1);
        esportes.inscrever(leitor2);

        tecnologia.inscrever(leitor1);
        tecnologia.inscrever(leitor3);

        tecnologia.publicarNovaNoticia("Lançado novo processador com IA integrada");

        esportes.publicarNovaNoticia("Brasil vence a final do campeonato mundial");

        esportes.desinscrever(leitor2);

        esportes.publicarNovaNoticia("Nova contratação anunciada pelo time da casa");
    }
}
