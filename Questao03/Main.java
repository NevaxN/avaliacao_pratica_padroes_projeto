package Questao03;

public class Main {
    public static void main(String[] args) {
        // 1. Criei os 'canais' (os Tópicos que serão observados)
        TopicoNoticias esportes = new TopicoNoticias("Esportes");
        TopicoNoticias tecnologia = new TopicoNoticias("Tecnologia");

        // 2. Criei os 'inscritos' (os Leitores que vão observar)
        LeitorAssinante leitor1 = new LeitorAssinante("Arthur");
        LeitorAssinante leitor2 = new LeitorAssinante("Maria");
        LeitorAssinante leitor3 = new LeitorAssinante("Joao");

        // 3. Fazer as inscrições
        esportes.inscrever(leitor1);
        esportes.inscrever(leitor2);

        tecnologia.inscrever(leitor1);
        tecnologia.inscrever(leitor3);

        tecnologia.publicarNovaNoticia("Lançado novo processador com IA integrada");

        esportes.publicarNovaNoticia("Brasil vence a final do campeonato mundial");

        // 4. Testando o 'desinscrever'.
        esportes.desinscrever(leitor2);

        // 5. Publicando outra notícia de esporte.
        esportes.publicarNovaNoticia("Nova contratação anunciada pelo time da casa");
    }
}
