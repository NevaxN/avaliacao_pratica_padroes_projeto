package Questao01;

public class TransporteMaritimo implements Transporte {

    public double pesoCarga;
    public double distancia;
    public double TARIFA_MARITIMO = 0.05;

    public TransporteMaritimo(double pesoCarga, double distancia){
        this.pesoCarga = pesoCarga;
        this.distancia = distancia;
    }

    @Override
    public double calcularTarifa() {
        return (this.pesoCarga * 0.2) + (this.distancia * 0.8) * TARIFA_MARITIMO;
    }
    
}
