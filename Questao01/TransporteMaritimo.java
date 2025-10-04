package Questao01;

/**
 * Esta classe implementa a interface Transporte, fornecendo a lógica de negócio
 * específica para o cálculo de fretes maritimos.
 */
public class TransporteMaritimo implements Transporte {

    /**
    * Optei por deixar os atributos como públicos para simplificar a manipulação
    * e os testes diretamente na classe Main, já que se trata de um exercício prático.
    */
    public double pesoCarga;
    public double distancia;
    public double TARIFA_MARITIMO = 0.05;

    /**
    * O construtor recebe os dados que o objeto precisa para existir e funcionar.
    * Assim, quando eu crio um 'new TransporteMaritimo', ele já nasce pronto para
    * fazer o cálculo.
    */
    public TransporteMaritimo(double pesoCarga, double distancia){
        this.pesoCarga = pesoCarga;
        this.distancia = distancia;
    }

    /**
    * Essa é a implementação real do método que o contrato 'Transporte' exigiu.
    * Aqui entra a fórmula específica do frete maritimo, usando os atributos da classe.
    * A lógica fica toda contida aqui, bem organizada.
    */
    @Override
    public double calcularTarifa() {
        return (this.pesoCarga * 0.2) + (this.distancia * 0.8) * TARIFA_MARITIMO;
    }
    
}
