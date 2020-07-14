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
public class Questao01 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String nextConditional = "S";
        while(nextConditional.equalsIgnoreCase("S")) {
            // Passo 1 - Ler valor
            System.out.println("Digite um número para  vê-lo em binário");
            int value = t.nextInt();
            int numberValue = value;
            // Passo 2 - Converter valor
            String text = "";
            while(value > 1) {
                
                text = (value % 2) + text; 
                value = value / 2;  
                
            }              
            text = 1 + text;
               
            // Passo 3 - Mostrar valor
            System.out.println("O valor do número "+numberValue+" em binário fica "+text);
           
            System.out.println("Você Deseja Converter falor?S/N");
            nextConditional = t.next();
            
        }
        System.out.println("-------------FIM---------------");
    }
    /*  
    13 / 2 = 6 (1) 
    6 / 2 = 3  (0)
    3 / 2 = 1  (1)
                1  
    | | | | 1 | 1 | 0  | 1 |
    8 + 4 +  0 + 2 = 13
    1 1 0 1
    8+4+0+1
    
    25 / 2 = 12 (1)
    12 / 2 = 6  (0)
    6  / 2 = 3  (0)
    3  / 2 = 1  (1)
                  1
    
    | | | 1 | 1 | 0 | 0 | 1 |    
         16 + 8 + 0 + 0 + 1 = 25  
    bit menos significado é o bit mais a direta
    */
}
