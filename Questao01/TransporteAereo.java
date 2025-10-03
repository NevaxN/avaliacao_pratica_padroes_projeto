package Questao01;

public class TransporteAereo implements Transporte{

    public double pesoCarga;
    public double TARIFA_POR_KG = 0.10;

    public TransporteAereo(double pesoCarga){
        this.pesoCarga = pesoCarga;
    }

    @Override
    public double calcularTarifa() {
        return TARIFA_POR_KG * pesoCarga;
    }
    
}
