import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a description of class ConsensusandProfile here.
 * 
 * @author (Jake Blozan) 
 * @version (10/25/18)
 */
public class ConsensusandProfile
{
    public static void main(String[] args) throws Exception {
        Scanner data = new Scanner(new File("practice.txt"));
        System.out.println("Fetching data...");
        String input = data.useDelimiter("\\Z").next();
        int length = input.length();
        int strings = 0;
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == '>') {
                strings++;
            }
        }
        int stringLength = 0;
        for (int i = 1; i < length; i++) {
            if (input.charAt(i) == '>') {
                break;
            }
            else {
                stringLength = i - 14;
            }
        }
        char[][] table = new char[stringLength][strings];
        for  (int k = 0; k < strings; k++) {
            for (int j = 0; j < stringLength; j++) {
                table[j][k] = input.charAt(j + 14);
            }
        }
        System.out.println(Arrays.deepToString(table));
    }
}
