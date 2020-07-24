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
public class Questao09 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.print("Informe o valor máximo da série fetuccine");
            int valorMaximo = s.nextInt();

            System.out.print("informe o termo 1 ");
            int termoAntAnt = s.nextInt();
            System.out.print("informe o termo 2 ");
            int termoAnt = s.nextInt();
            System.out.print(termoAntAnt + " " + termoAnt + " ");

            int termoCorr = 0;
            int indice = 3;
            while (termoCorr < valorMaximo)
            {
                    if (indice % 2 > 0)
                            termoCorr = termoAnt + termoAntAnt;
                    else
                            termoCorr = termoAnt - termoAntAnt;

                    System.out.print(termoCorr + " ");

                    termoAntAnt = termoAnt;
                    termoAnt = termoCorr;
                    indice ++;
            }
    }
  
}
