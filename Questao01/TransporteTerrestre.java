package Questao01;

public class TransporteTerrestre implements Transporte {

    public double distancia;
    public double TARIFA_POR_KM = 1.0;

    public TransporteTerrestre(double distancia){
        this.distancia = distancia;
    }

    @Override
    public double calcularTarifa() {
        return TARIFA_POR_KM * distancia;
    }
}
