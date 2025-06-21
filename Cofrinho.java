// Cofrinho.java - Classe que gerencia a coleção de moedas
// Autor: Eduardo Laércio Dias, RU: 4556952
import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas; // Coleção de moedas

    // Construtor inicializa o ArrayList
    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    // Adiciona uma moeda ao cofrinho
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
        System.out.println("Moeda de " + moeda.getNome() + " no valor de " + moeda.getValor() + " adicionada com sucesso!");
    }

    // Remove uma moeda específica com base no tipo e valor
    // Usa tolerância para comparar doubles
    public boolean removerMoeda(String tipo, double valor) {
        final double EPSILON = 0.0001; // Tolerância para comparação de doubles
        for (int i = 0; i < moedas.size(); i++) {
            Moeda moeda = moedas.get(i);
            if (moeda.getNome().equalsIgnoreCase(tipo) && Math.abs(moeda.getValor() - valor) < EPSILON) {
                moedas.remove(i);
                System.out.println("Moeda de " + tipo + " no valor de " + valor + " removida com sucesso!");
                return true;
            }
        }
        System.out.println("Moeda não encontrada!");
        return false;
    }

    // Lista todas as moedas no cofrinho
    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio!");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : moedas) {
                System.out.println(moeda);
            }
        }
    }

    // Calcula o total em Reais de todas as moedas
    public double calcularTotalEmReais() {
        double total = 0.0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }
}