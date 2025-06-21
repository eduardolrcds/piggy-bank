// Real.java - Classe para moedas em Real
// Autor: Eduardo Laércio Dias, RU: 4556952
public class Real extends Moeda {

    // Construtor que inicializa a moeda com nome "Real"
    public Real(double valor) {
        super(valor, "Real");
    }

    // Como é Real, o valor já está em Reais, sem necessidade de conversão
    @Override
    public double converterParaReal() {
        return valor;
    }
}