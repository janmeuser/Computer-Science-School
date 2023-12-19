/* Notenrechner
 * in Java
*/

import java.util.Scanner;

public class NotenRechner {
    public static void main(String[] args) {
        int total, score;
        float percentage;
        Scanner inputNumScanner = new Scanner(System.in);

        System.out.println("Bitte gib die Höchstpunktzahl der Kursarbeit ein: ");
        total = inputNumScanner.nextInt();

        System.out.println("Bitte gib die erreichte Punktzahl ein: ");
        score = inputNumScanner.nextInt();

        percentage = (score * 100 / total);

        System.out.println("Der Prozent-Anteil beträgt " + percentage + " %");
    }

    scanner.close();
    // Zuordnen

    avg=total/6;System.out.print("The student Grade is: ");if(avg>=80)

    {
        System.out.print("A");
    }else if(avg>=60&&avg<80)
    {
        System.out.print("B");
    }else if(avg>=40&&avg<60)
    {
        System.out.print("C");
    }

    else
    {
        System.out.print("D");

syst
    }
}