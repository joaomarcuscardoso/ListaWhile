/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listawhile;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Questao05 {
    public static void main(String[] args) {
        /**
         *
         * @author JoãoMarcus
         * Data:24/07/2020
         * Trabalho Introdução á programação
         */
        Scanner t = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.##");
        int cidade = 1, totalTypeOne = 0, totalTypeTwo = 0,
        totalTypeThree = 0, biggerKwhConsumed = 0, 
        smallerKwhConsumed = 0, qtdTypeOnePayBiggerFiveHundred = 0;
        double average = 0,  totalKwhConsumed = 0;
        
        while(cidade != 0) {
            System.out.println("Digite o Preço do kWh consumido");
            double kwhPrice = t.nextInt();
            System.out.println("Digite os números do consumidores");
            int qtdConsumer = t.nextInt();
            for(int i =1;i<=qtdConsumer;i++) {
                System.out.println("Qual é a quantidade de cosumo mensal do consumidor "+i);
                int kwhConsumed = t.nextInt();
                
                if(kwhConsumed > biggerKwhConsumed) {
                    biggerKwhConsumed = kwhConsumed;
                }
                
                if(kwhConsumed < smallerKwhConsumed || smallerKwhConsumed == 0 ) {
                    smallerKwhConsumed = kwhConsumed;
                }
               totalKwhConsumed += kwhConsumed;
               if(i == qtdConsumer) {
                   average = totalKwhConsumed / qtdConsumer;
               }
               
                
                System.out.println("Qual é o tipo de consumidor(1- residencial, 2- comercial, 3 -industrial)");
                int typeConsumer = t.nextInt();
                
                double totalPay = kwhConsumed * kwhPrice;
                System.out.println("O consumidor "+i+" deve pagar R$ "+totalPay);
                
                if(typeConsumer == 1) {
                    if(totalPay > 500) {
                        qtdTypeOnePayBiggerFiveHundred += 1;
                    }
                    
                    
                    totalTypeOne += totalPay;
                } else if(typeConsumer == 2) {
                    totalTypeTwo += totalPay;
                } else if(typeConsumer == 3) {
                    totalTypeThree += totalPay;
                } else {
                    System.out.println("Tipo de consumidor não identificado.");
                }
                
            }
            System.out.println("O total das contas de todos os consumidores residenciais é R$ "+d.format(totalTypeOne));
            System.out.println("O total das contas de todos os consumidores comercial é R$ "+d.format(totalTypeTwo));
            System.out.println("O total das contas de todos os consumidores industrial é R$ "+d.format(totalTypeThree));
            System.out.println("A media dos valores consumidos é "+d.format(average));
            System.out.println("A quantidade de consumidores residenciais que devem pagar a conta maior que R$ 500,00 é "+d.format(qtdTypeOnePayBiggerFiveHundred));
            System.out.println("O maior valor consumido é "+biggerKwhConsumed);
            System.out.println("O menor valor consumido é "+smallerKwhConsumed);
            System.out.println("0 - Sair");
            cidade = t.nextInt();
        }
    }
}
