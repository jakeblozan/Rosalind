import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Write a description of class TranscribingDNAintoRNA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TranscribingDNAintoRNA
{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("rosalind_rna.txt"));
        System.out.println("Fetching data...");
        String input = scan.next();
        int length = input.length();
        String result = "";
        for (int i = 0; i < length; i++) {
            char x = input.charAt(i);
            if (x == 'T') {
                result += "U";
            }
            else {
                result += Character.toString(x);
            }
        }
        PrintWriter writer = new PrintWriter("result.txt", "UTF-8");
        writer.println(result);
        writer.close();
    }
}