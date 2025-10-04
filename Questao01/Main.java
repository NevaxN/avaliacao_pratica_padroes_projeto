package Questao01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        double pesoCarga = 100;
        double distanca = 1000;

        // A lista é do mesmo tipo da Interface Transporte.
        // Isso permite que a lista armazene qualquer objeto de qualquer classe que implemente
        // a interface Transporte.
        List<Transporte> entregas = new ArrayList<>();

        // Aqui eu instancio os objetos de verdade e
        // adiciono na minha lista genérica.
        entregas.add(new TransporteAereo(pesoCarga));
        entregas.add(new TransporteTerrestre(distanca));
        entregas.add(new TransporteMaritimo(pesoCarga, distanca));

        // Eu passo por cada 'entrega' na lista
        // e trato todas da mesma forma, como um 'Transporte' genérico.
        // Não preciso fazer nenhum 'if' para saber o tipo real do objeto.
        for (Transporte entrega : entregas) {
            // Eu chamo o mesmo método 'calcularTarifa()' para todos. O Java sozinho
            // descobre qual é a classe real do objeto ('Aereo', 'Terrestre', 'Maritimo') e
            // executa o método correspondente daquela classe.
            // É isso que deixa o código flexível e fácil de dar manutenção.
            System.out.println("Tarifa " + entrega.getClass().getSimpleName() + ": R$" +
                entrega.calcularTarifa()
            );
        }
    }
}