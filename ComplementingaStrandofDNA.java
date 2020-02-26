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
        Scanner scan = new Scanner(new File("practice.txt"));
        System.out.println("Fetching data...");
        String input = scan.next();
        System.out.println(input);
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
        System.out.println(result);
        writer.print(result);
        writer.close();
        System.out.println("Done");
    }
}
