# piggy-bank
Piggy bank object-oriented programming
Cofrinho de Moedas
Descrição
O Cofrinho de Moedas é um projeto desenvolvido em Java para a disciplina de Programação Orientada a Objetos da UNINTER. O sistema simula um cofrinho virtual que permite adicionar moedas de diferentes tipos (Real, Dolar, Euro), remover moedas específicas, listar todas as moedas armazenadas e calcular o valor total convertido para Reais. O objetivo principal é demonstrar a aplicação dos conceitos de herança e polimorfismo, conforme orientações do professor Leonardo Gomes.

O sistema foi implementado com uma interface de console, utilizando um menu interativo para gerenciar as operações. A atividade avalia a organização do código, a correta aplicação de conceitos de orientação a objetos, a inclusão de comentários explicativos e a exportação do projeto no formato ZIP pelo Eclipse.

Autor: Eduardo Laércio Dias
RU: 4556952
Instituição: UNINTER
Disciplina: Programação Orientada a Objetos
Professor: Leonardo Gomes, Dr.
Data: Junho de 2025

Estrutura do Projeto
O projeto é composto por seis classes Java, organizadas no diretório src:

Moeda.java: Classe abstrata que define a estrutura básica das moedas, com atributos valor e nome, e o método abstrato converterParaReal(). Inclui validação para valores positivos.

Real.java: Classe concreta que herda de Moeda, representando moedas em Reais (sem conversão).

Dolar.java: Classe concreta que herda de Moeda, representando moedas em Dólares (taxa fixa: 1 Dolar = 5 Reais).

Euro.java: Classe concreta que herda de Moeda, representando moedas em Euros (taxa fixa: 1 Euro = 6 Reais).

Cofrinho.java: Classe que gerencia a coleção de moedas usando um ArrayList<Moeda>. Implementa métodos para adicionar, remover, listar e calcular o total em Reais.

Principal.java: Classe principal com o menu interativo, utilizando Scanner para capturar entradas do usuário.

Estrutura de Arquivos
plain


CofrinhoProjeto/
├── src/
│   ├── Moeda.java
│   ├── Real.java
│   ├── Dolar.java
│   ├── Euro.java
│   ├── Cofrinho.java
│   ├── Principal.java
├── README.md
Herança e Polimorfismo
Herança
A herança é implementada pela hierarquia de classes, onde Real, Dolar e Euro herdam de Moeda. A classe Moeda define atributos comuns (valor e nome) e o método abstrato converterParaReal(), garantindo que todas as subclasses compartilhem uma estrutura básica, mas possam implementar a conversão de forma específica. Isso promove reutilização de código e organização.

Polimorfismo
O polimorfismo é aplicado no método converterParaReal(), que é chamado de forma dinâmica dependendo do tipo de moeda armazenada no ArrayList da classe Cofrinho. Por exemplo, ao calcular o total em Reais, o método calcularTotalEmReais() itera sobre a lista de moedas e invoca converterParaReal() para cada uma, executando a implementação específica de Real, Dolar ou Euro.

Funcionamento do Sistema
O sistema opera por meio de um menu interativo na classe Principal, que oferece cinco opções ao usuário:

Adicionar moeda: O usuário especifica o tipo de moeda (Real, Dolar, Euro) e seu valor. A classe Principal cria uma instância da classe correspondente e a adiciona ao cofrinho. Valores inválidos (negativos ou zero) são rejeitados.

Remover moeda: O usuário informa o tipo e o valor da moeda a ser removida. O método removerMoeda() usa uma tolerância para comparar valores e remove a primeira ocorrência correspondente.

Listar moedas: O método listarMoedas() exibe todas as moedas, incluindo seus valores originais e convertidos para Reais.

Calcular total em Reais: O método calcularTotalEmReais() soma o valor convertido de todas as moedas, exibindo o resultado com duas casas decimais.

Sair: Encerra o programa e fecha o Scanner.

O sistema inclui tratamento de erros para entradas inválidas, validação de valores positivos e mensagens claras para o usuário.

Pré-requisitos
Java Development Kit (JDK): Versão 8 ou superior.

Ambiente de Desenvolvimento:

Recomendado: Eclipse IDE, IntelliJ IDEA ou VS Code com extensões Java.

Alternativa: Compilador Java via linha de comando.

Sistema Operacional: Windows, macOS ou Linux.

Como Executar
Siga os passos abaixo para executar o projeto:

Usando Eclipse
Clonar o Repositório (se hospedado no GitHub):

bash


git clone https://github.com/seu-usuario/cofrinho-de-moedas.git
Importar o Projeto:

Abra o Eclipse.

Vá em File > Import > General > Existing Projects into Workspace.

Selecione a pasta CofrinhoProjeto e clique em Finish.

Executar:

Clique com o botão direito em Principal.java (em src).

Selecione Run As > Java Application.

Interaja com o menu no console.

Usando Linha de Comando
Clonar o Repositório (ou copie os arquivos para uma pasta):

bash


git clone https://github.com/seu-usuario/cofrinho-de-moedas.git
cd cofrinho-de-moedas/CofrinhoProjeto/src
Compilar:

bash


javac *.java
Executar:

bash


java Principal
Interagir: Siga as instruções do menu no terminal.

Exemplo de Uso
plain


=== Cofrinho de Moedas ===
1. Adicionar moeda
2. Remover moeda
3. Listar moedas
4. Calcular total em Reais
5. Sair
Escolha uma opção: 1
Digite o tipo de moeda (Real, Dolar, Euro): Real
Digite o valor da moeda: 10.0
Moeda de Real no valor de 10.0 adicionada com sucesso!

Escolha uma opção: 1
Digite o tipo de moeda (Real, Dolar, Euro): Dolar
Digite o valor da moeda: 5.0
Moeda de Dolar no valor de 5.0 adicionada com sucesso!

Escolha uma opção: 3
Moedas no cofrinho:
Real: 10.00 (10.00 Reais)
Dolar: 5.00 (25.00 Reais)

Escolha uma opção: 4
Total no cofrinho (em Reais): R$ 35.00

Escolha uma opção: 5
Saindo do programa...
Detalhamento do Código
Classe Moeda
A classe Moeda é abstrata e define a estrutura básica:

Atributos: valor (double) e nome (String).

Métodos:

converterParaReal(): Abstrato, implementado pelas subclasses.

getValor() e getNome(): Getters.

toString(): Exibe o valor original e convertido.

Validação: O construtor verifica se o valor é positivo.

Classe Real
Herdada de Moeda, representa moedas em Reais:

Construtor: Define nome como "Real".

converterParaReal(): Retorna o valor diretamente.

Classe Dolar
Herdada de Moeda, representa moedas em Dólares:

Construtor: Define nome como "Dolar".

converterParaReal(): Usa taxa fixa de 5.0.

Classe Euro
Herdada de Moeda, representa moedas em Euros:

Construtor: Define nome como "Euro".

converterParaReal(): Usa taxa fixa de 6.0.

Classe Cofrinho
Gerencia a coleção de moedas:

Atributo: moedas (ArrayList).

Métodos:

adicionarMoeda(): Adiciona uma moeda.

removerMoeda(): Remove uma moeda com comparação tolerante.

listarMoedas(): Lista moedas ou mensagem de vazio.

calcularTotalEmReais(): Soma valores convertidos.

Classe Principal
Contém o menu interativo:

Main: Usa um loop while com Scanner.

Switch: Gerencia opções com tratamento de erros.

Apêndice: Código Comentado
Moeda.java
java


// Moeda.java - Classe abstrata para moedas
// Autor: Eduardo Laércio Dias, RU: 4556952
public abstract class Moeda {
    protected double valor; // Valor da moeda
    protected String nome; // Nome ou tipo da moeda (ex.: Real, Dolar, Euro)

    // Construtor da classe abstrata
    // Valida que o valor é positivo
    public Moeda(double valor, String nome) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da moeda deve ser positivo!");
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
        return String.format("%s: %.2f (%.2f Reais)", nome, valor, converterParaReal());
    }
}
Real.java
java


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
Dolar.java
java


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
Euro.java
java


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
Cofrinho.java
java


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
Principal.java
java


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
                System.out.println("Entrada inválida! Digite um número entre 1 e 5.");
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
                            System.out.println("O valor da moeda deve ser positivo!");
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println("Valor inválido! Digite um número válido.");
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
                                System.out.println("Tipo de moeda inválido! Use Real, Dolar ou Euro.");
                                continue;
                        }
                        cofrinho.adicionarMoeda(moeda);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
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
                            System.out.println("O valor da moeda deve ser positivo!");
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println("Valor inválido! Digite um número válido.");
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
                    System.out.println("Opção inválida! Escolha entre 1 e 5.");
            }
        }
        scanner.close();
    }
}
Contribuições
Este projeto foi desenvolvido como uma atividade acadêmica e não está aberto a contribuições externas. Para dúvidas ou sugestões, entre em contato com o autor.

Licença
Este projeto é destinado exclusivamente para fins acadêmicos e não possui uma licença pública. Todos os direitos são reservados ao autor e à UNINTER.

Contato
Autor: Eduardo Laércio Dias
