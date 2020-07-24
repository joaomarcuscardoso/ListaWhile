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

public class Questao08 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.print("Informe o valor máximo da série fibonacci");
            int valorMaximo = s.nextInt();

            System.out.print("1 ");
            int termoAntAnt = 0;
            int termoAnt = 1;
            int termoCorr = 0;
            while (termoCorr < valorMaximo)
            {
                    termoCorr = termoAnt + termoAntAnt;
                    System.out.print(termoCorr + " ");

                    termoAntAnt = termoAnt;
                    termoAnt = termoCorr;
            }
    }
}
