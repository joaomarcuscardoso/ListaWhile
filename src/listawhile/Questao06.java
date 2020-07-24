/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listawhile;

import java.util.Scanner;

/**
 *
 * @author JoãoMarcus
 */
public class Questao06 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int next = 1;
        
        while(next != 0) {
            System.out.println("Digite um número inteiro e daremos a raiz quadrada dele");
            int raiz = t.nextInt();
            int  number = raiz;
            int result = 0;
            
            for(int i =1; raiz > 0 ;i+=2 ) {
                result++;
                raiz -= i;

                if(raiz == 0) {
                    i = 0;
                }
                
            }
            // Ta aproximando a raiz
            System.out.println("A raiz quadrada do "+number+" = "+result+" aproximadamente");
          
            
            System.out.println("1- Continuar / 0- Sair do Programa");
            next = t.nextInt();
        }
    }
}
