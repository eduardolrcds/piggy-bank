// Dolar.java - Classe para moedas em Dolar
// Autor: Eduardo Laércio Dias, RU: 4556952
public class Dolar extends Moeda {

    // Construtor que inicializa a moeda com nome "Dolar"
    public Dolar(double valor) {
        super(valor, "Dolar");
    }

    // Converte Dolar para Real usando taxa fixa (1 Dolar = 5 Reais)
    @Override
    public double converterParaReal() {
        return valor * 5.0;
    }
}