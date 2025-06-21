// Principal.java - Classe com o menu interativo
// Autor: Eduardo Laércio Dias, RU: 4556952
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            // Exibe o menu interativo
            System.out.println("\n=== Cofrinho de Moedas ===");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Reais");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            // Trata entrada inválida no menu
            int opcao;
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, digite um número entre 1 e 5.");
                scanner.nextLine(); // Limpa o buffer
                continue;
            }

            switch (opcao) {
                case 1:
                    // Adiciona uma moeda com base no tipo e valor fornecidos
                    System.out.print("Digite o tipo de moeda (Real, Dolar, Euro): ");
                    String tipo = scanner.nextLine().trim();
                    System.out.print("Digite o valor da moeda: ");
                    double valor;
                    try {
                        valor = scanner.nextDouble();
                        scanner.nextLine(); // Limpa o buffer
                        if (valor <= 0) {
                            System.out.println("Erro: O valor da moeda deve ser maior que zero!");
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println("Erro: Valor inválido! Digite um número válido.");
                        scanner.nextLine(); // Limpa o buffer
                        continue;
                    }

                    // Cria a moeda correspondente usando polimorfismo
                    Moeda moeda;
                    try {
                        switch (tipo.toLowerCase()) {
                            case "real":
                                moeda = new Real(valor);
                                break;
                            case "dolar":
                                moeda = new Dolar(valor);
                                break;
                            case "euro":
                                moeda = new Euro(valor);
                                break;
                            default:
                                System.out.println("Erro: Tipo de moeda inválido! Use Real, Dolar ou Euro.");
                                continue;
                        }
                        cofrinho.adicionarMoeda(moeda);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 2:
                    // Remove uma moeda com base no tipo e valor
                    System.out.print("Digite o tipo de moeda (Real, Dolar, Euro): ");
                    tipo = scanner.nextLine().trim();
                    System.out.print("Digite o valor da moeda: ");
                    try {
                        valor = scanner.nextDouble();
                        scanner.nextLine(); // Limpa o buffer
                        if (valor <= 0) {
                            System.out.println("Erro: O valor da moeda deve ser maior que zero!");
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println("Erro: Valor inválido! Digite um número válido.");
                        scanner.nextLine(); // Limpa o buffer
                        continue;
                    }
                    cofrinho.removerMoeda(tipo, valor);
                    break;

                case 3:
                    // Lista todas as moedas
                    cofrinho.listarMoedas();
                    break;

                case 4:
                    // Calcula e exibe o total em Reais
                    double total = cofrinho.calcularTotalEmReais();
                    System.out.printf("Total no cofrinho (em Reais): R$ %.2f%n", total);
                    break;

                case 5:
                    // Encerra o programa
                    rodando = false;
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Erro: Opção inválida! Escolha um número entre 1 e 5.");
            }
        }
        scanner.close();
    }
}