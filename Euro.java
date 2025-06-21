// Euro.java - Classe para moedas em Euro
// Autor: Eduardo Laércio Dias, RU: 4556952
public class Euro extends Moeda {

    // Construtor que inicializa a moeda com nome "Euro"
    public Euro(double valor) {
        super(valor, "Euro");
    }

    // Converte Euro para Real usando taxa fixa (1 Euro = 6 Reais)
    @Override
    public double converterParaReal() {
        return valor * 6.0;
    }
}