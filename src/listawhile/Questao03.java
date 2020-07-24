/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listawhile;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author JoãoMarcus
 */
public class Questao03 {
    public static void main(String[] args) {
        // preço de compra e preço de venda das mesmas
        Scanner t = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#0.00");
        
        int profitTenpercent=0; int profitTwentypercent =0; int profitTwoConditional=0;
        double profitTotal = 0; double broughtTotal = 0;
        
        System.out.println("Digite a descrição da mercadoria. Informe 'X' para terminar");
        String descriptionThing = t.next();
        
        while(!descriptionThing.equalsIgnoreCase("X")) {

            System.out.println("Digite o preço de compra da mercadoria");
            double broughtPrice = t.nextDouble();
            broughtTotal += broughtPrice;

            System.out.println("Digite o preço de venda da mercadoria");
            double salePrice = t.nextDouble();

            double profit = salePrice - broughtPrice ;
            profitTotal += profit;
            double tenPercent =(broughtPrice * 10)/100;
            double twentyPercent = (broughtPrice * 20)/100;
            
            if( profit < tenPercent ) {
                profitTenpercent += 1;
            } else if( tenPercent <= profit && profit <= twentyPercent) {
                profitTwoConditional += 1;
            } else {
                profitTwentypercent +=1;
            }  
                       
            System.out.println("Digite a descrição da mercadoria. Informe 'X' para terminar");
            descriptionThing = t.next(); 
        }
        
        System.out.println(profitTenpercent+" Produtos tem lucro abaixo de 10%");
        System.out.println(profitTwoConditional+" Produtos tem lucro entre 10% e 20%");
        System.out.println(profitTwentypercent+" Produtos tem lucro acima de 20%");
        System.out.println("Total gasto comprando produtos R$ "+d.format(broughtTotal));
        System.out.println("Lucro R$ "+d.format(profitTotal));
        
    }
}
