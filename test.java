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
public class test
{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("rosalind_rna.txt"));
        System.out.println("Fetching data...");
        String input = scan.next();
        int length = input.length();
        PrintWriter writer = new PrintWriter("result.txt", "UTF-8");
        writer.println("The first line");
        writer.println(length);
        writer.close();
        System.out.println("done");
    }
}