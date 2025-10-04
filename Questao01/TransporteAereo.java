package Questao01;

/**
 * Esta classe implementa a interface Transporte, fornecendo a lógica de negócio
 * específica para o cálculo de fretes aéreos.
 */
public class TransporteAereo implements Transporte{

    /**
    * Optei por deixar os atributos como públicos para simplificar a manipulação
    * e os testes diretamente na classe Main, já que se trata de um exercício prático.
    */
    public double pesoCarga;
    public double TARIFA_POR_KG = 0.10;

    /**
    * O construtor recebe os dados que o objeto precisa para existir e funcionar.
    * Assim, quando eu crio um 'new TransporteAereo', ele já nasce pronto para
    * fazer o cálculo.
    */
    public TransporteAereo(double pesoCarga){
        this.pesoCarga = pesoCarga;
    }

    /**
    * Essa é a implementação real do método que o contrato 'Transporte' exigiu.
    * Aqui entra a fórmula específica do frete aéreo, usando os atributos da classe.
    * A lógica fica toda contida aqui, bem organizada.
    */
    @Override
    public double calcularTarifa() {
        return TARIFA_POR_KG * pesoCarga;
    }
    
}
