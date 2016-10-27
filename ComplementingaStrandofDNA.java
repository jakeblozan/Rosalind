import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class ComplementingaStrandofDNA here.
 * 
 * @author (Jake Blozan) 
 * @version (10/27/16)
 */
public class ComplementingaStrandofDNA
{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("rosalind_revc.txt"));
        System.out.println("Fetching data...");
        String input = scan.next();
        int length = input.length();
        String result = "";
        for (int i = 0; i < length; i++) {
            char x = input.charAt(length - i - 1);
            if (x == 'A') {
                result += "T";
            }
            if (x == 'T') {
                result += "A";
            }
            if (x == 'C') {
                result += "G";
            }
            if (x == 'G') {
                result += "C";
            }
        }
        PrintWriter writer = new PrintWriter("result.txt", "UTF-8");
        writer.print(result);
        writer.close();
        System.out.println("Done");
    }
}