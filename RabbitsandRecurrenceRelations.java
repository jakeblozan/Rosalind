import java.io.*;
import java.util.Scanner;

/**
 * Write a description of class RabbitsandRecurrenceRelations here.
 * 
 * @author (Jake Blozan) 
 * @version (10/27/16)
 */
public class RabbitsandRecurrenceRelations
{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("rosalind_fib (2).txt"));
        System.out.println("Fetching data...");
        double mRabbits = 0;
        double yRabbits = 1;
        //        int y2Rabbits = 0;
        int months = scan.nextInt();
        int birthrate = scan.nextInt();
        for (int i = 1; i < months; i++) {
            double temp = yRabbits;
            yRabbits = mRabbits * birthrate;
            mRabbits += temp;
            System.out.println(mRabbits);
            System.out.println(yRabbits);
            System.out.println("");
        }
        PrintWriter writer = new PrintWriter("result.txt", "UTF-8");
        writer.println(mRabbits + yRabbits);
        writer.close();
    }
}
