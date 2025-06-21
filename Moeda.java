// Moeda.java - Classe abstrata para moedas
// Autor: Eduardo Laércio Dias, RU: 4556952
public abstract class Moeda {
    protected double valor; // Valor da moeda
    protected String nome; // Nome ou tipo da moeda (ex.: Real, Dolar, Euro)

    // Construtor da classe abstrata
    // Valida que o valor é positivo
    public Moeda(double valor, String nome) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da moeda deve ser maior que zero!");
        }
        this.valor = valor;
        this.nome = nome;
    }

    // Método abstrato para conversão do valor para Real
    public abstract double converterParaReal();

    // Getters para acessar os atributos
    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    // Método toString para exibir informações da moeda, incluindo valor convertido
    @Override
    public String toString() {
        return String.format("%s: %.2f (R$ %.2f)", nome, valor, converterParaReal());
    }
}