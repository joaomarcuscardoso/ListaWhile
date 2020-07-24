/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listawhile;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author JoãoMarcus
 */
public class Questao04 {
    public static void main(String[] args) {
        /*
         o código do curso, o número de vagas, número de candidatos 
        do sexo masculino 
        e o número de candidatos do sexo feminino
        */
        Scanner t = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#0.00");
        int codeCurse = 0, wave = 0,
        beforeTotal = 0, bestCodeCurse = 0;
        double  bestTotal = -1, Total =0;
        String nameCurse = "";
        
        while(!nameCurse.equalsIgnoreCase("X") ) {
            System.out.println("Digite o nome do Curso, X para sair");
            nameCurse = t.next();

            if(!nameCurse.equalsIgnoreCase("X")) {
                System.out.println("Digite o codigo do curso");

                codeCurse = t.nextInt();


                System.out.println("Quantas vagas tem no curso?");
                wave = t.nextInt();
                System.out.println("Números de canditados do sexo masculino?");
                int candidateMale = t.nextInt();
                System.out.println("Números de canditados do sexo feminino?");
                int candidateFemale = t.nextInt();

                
                Total = ((double)(candidateMale + candidateFemale) / (wave));
                
                
                if(Total > bestTotal) {
                    bestCodeCurse =  codeCurse;
                    bestTotal = Total;
                }
                double percentFemela = ((candidateFemale * 100) / (candidateMale + candidateFemale));
                System.out.println("O número de candidatos por vagas do curso "+nameCurse+" é "+d.format(Total));
                System.out.println("A porcetagem de candidatas  do sexo feminino é "+d.format(percentFemela)+"%");
                
                System.out.println("O codigo do curso "+bestCodeCurse+" e o maior número de candidatos por vagas é "+d.format(bestTotal));
                
            } 
        }
    }
}
