/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listawhile;

/**
 *
 * @author JoãoMarcus
 */

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um valor de 4 digitos, maior 1000 ou menor 9999");
        
        int n = t.nextInt();
        
        while(n > 1000 && n < 9999) {
            int p1 = Integer.parseInt(String.valueOf(n).substring(0,2));
            int p2 = Integer.parseInt(String.valueOf(n).substring(2,4));
            int result = p1 + p2;
            
            System.out.println(""+p1+" + "+p2+" = "+result);
            System.out.println(result+" ao quadrado é "+(result * result));
            
            
            if((result * result) == n) {
                System.out.println("O número digitado apresenta tal caracteristica");
            } else {
                System.out.println("O número digitado não apresenta tal caracteristica");
            }
            System.out.println("------------------------------------------------------------------------");
            
            System.out.println("Digite outros número para continuar entre 1000 e 9999. SAIR - 0");
            n = t.nextInt();
        }
        System.out.println("Fim da execução");
        
    }
}
