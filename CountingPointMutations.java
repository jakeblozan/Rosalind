import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class CountingPointMutations here.
 * 
 * @author (Jake Blozan) 
 * @version (11/9/16)
 */
public class CountingPointMutations
{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("rosalind_hamm.txt"));
        System.out.println("Fetching data...");
        String line1 = scan.nextLine();
        String line2 = scan.nextLine();
        int hammDist = 0;
        for (int i = 0; i < line1.length(); i++) {
            if (line1.charAt(i) != line2.charAt(i)) {
                hammDist++;
            }
        }
        System.out.println(hammDist);
    }
}
