/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listawhile;

import java.text.DecimalFormat;


/**
 *
 * @author JoãoMarcus
 */
public class Questao02 {
    public static void main(String[] args) {
        
        DecimalFormat d = new DecimalFormat("#0.00");
        int far = 1;
        while(far <= 150) {
            // Passo 1 - Converte para celsius e escreve
            double celsius =  5.0/9.0 * ( far - 32 );
            System.out.println(far + " graus farenheit = "+ d.format(celsius)+" ");

            far++;
        }
        System.out.println("-------------FIM---------------");
    }
}
