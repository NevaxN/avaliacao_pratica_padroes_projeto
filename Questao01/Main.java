package Questao01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        double pesoCarga = 100;
        double distanca = 1000;

        List<Transporte> entregas = new ArrayList<>();

        entregas.add(new TransporteAereo(pesoCarga));
        entregas.add(new TransporteTerrestre(distanca));
        entregas.add(new TransporteMaritimo(pesoCarga, distanca));

        for (Transporte entrega : entregas) {
            System.out.println("Tarifa " + entrega.getClass().getSimpleName() + ": R$" +
                entrega.calcularTarifa()
            );
        }
    }
}