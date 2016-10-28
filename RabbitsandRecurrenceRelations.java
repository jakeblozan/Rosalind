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
        Scanner scan = new Scanner(new File("practice.txt"));
        System.out.println("Fetching data...");
        int mRabbits = 0;
        int yRabbits = 1;
        //        int y2Rabbits = 0;
        int months = scan.nextInt();
        int birthrate = scan.nextInt();
        for (int i = 0; i < months; i++) {
            if (i == 0) {

            }
            else {
                mRabbits += yRabbits;
                yRabbits = mRabbits * birthrate;
            }
            System.out.println(mRabbits);
            System.out.println(yRabbits);
            System.out.println("");
        }
        System.out.println(mRabbits + yRabbits);
    }
}
