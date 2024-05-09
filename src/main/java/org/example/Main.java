package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lanches lancheEscolhido = null;
        int quantidade = 0;

        try {
            System.out.println("Escolha o código do lanche: ");
            System.out.println("101 - Cachorro Quente (R$ 1,20)");
            System.out.println("102 - Bauru Simples (R$ 1,30)");
            System.out.println("103 - Bauru Com Ovo (R$ 1,20)");
            System.out.println("104 - Hambúrguer (R$ 1,50)");
            System.out.println("105 - Cheeseburguer (R$ 1,30)");
            System.out.println("106 - Refrigerante (R$ 1,00)");

            System.out.println("Digite o código do lanche desejado: ");
            int condigoLanche = scanner.nextInt();


            switch (condigoLanche) {
                case 101:
                    lancheEscolhido = new Lanches("Cachorro quente", 101, 1.20);
                    break;
                case 102:
                    lancheEscolhido = new Lanches("Bauru Simples", 102, 1.30);
                    break;
                case 103:
                    lancheEscolhido = new Lanches("Bauru com ovo", 103, 1.20);
                    break;
                case 104:
                    lancheEscolhido = new Lanches("Hambúrguer", 104, 1.50);
                    break;
                case 105:
                    lancheEscolhido = new Lanches("Cheeseburguer", 105, 1.30);
                    break;
                case 106:
                    lancheEscolhido = new Lanches("Refrigerante", 106, 1.00);
                    break;
                default:
                    throw new LancheInvalidoException("Opção de lanche inválida ou codigo inválido");
            }
            System.out.println("Digite a quantidade de lanches desejada: ");
            quantidade = scanner.nextInt();

            CompraDoLanche pedido = new CompraDoLanche(lancheEscolhido, quantidade);

            double totalPedido = pedido.calcularTotal();


            System.out.println("\nPedido realizado: ");
            System.out.println("O lanche escolhido foi: " + lancheEscolhido.getLanche());
            System.out.println("O código do lanche é: " + lancheEscolhido.getCodigoLanche());
            System.out.println("A quantidade de lanches foi: " + quantidade);
            System.out.println("O valor de cada lanche é R$  : " + lancheEscolhido.getValorLanche());
            System.out.println("O total do pedido deu: R$ " + totalPedido);
        } catch (LancheInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}

//O cardápio de uma lanchonete é o seguinte:
//     LANCHE        CÓDIGO        VALOR
//Cachorro Quente      101          1,20
//Bauru Simples        102          1,30
//Bauru Com Ovo        103          1,50
//Hambúrger            104          1,20
//Cheeseburger         105          1,30
//Refrigerante         106          1,00
//Escrever um algoritmo que leia o código do item pedido e a quantidade. Calcule o valor a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item. Caso não seja
//informado algum código da lista, deve-se informar que o código do lanche é inválido.