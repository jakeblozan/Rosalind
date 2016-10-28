import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class ComputingGCContent here.
 * 
 * @author (Jake Blozan) 
 * @version (10/28/16)
 */
public class ComputingGCContent
{
    public static void main(String[] args) throws IOException {
        String data = new Scanner(new File("practice.txt")).useDelimiter("\\A").next();
        System.out.println("Fetching data...");
        int strings = 0;
        int length = data.length();
        for (int i = 0; i < length; i++) {
            if (data.charAt(i) == '>') {
                strings++;
            }
        }
        String[] tags = new String[strings];
        for (int i = 0; i < strings; i++) {
            
        }
    }
}